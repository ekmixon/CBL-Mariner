%define debug_package %{nil}
Summary:        Text editor
Name:           vim
Version:        8.2.3441
Release:        2%{?dist}
License:        Vim
Vendor:         Microsoft Corporation
Distribution:   Mariner
Group:          Applications/Editors
URL:            https://www.vim.org
#Source0:       https://github.com/%{name}/%{name}/archive/v%{version}.tar.gz
Source0:        %{name}-%{version}.tar.gz

BuildRequires:  ncurses-devel

%description
The Vim package contains a powerful text editor.

%package        extra
Summary:        Extra files for Vim text editor
Group:          Applications/Editors
Requires:       %{name} = %{version}-%{release}
Requires:       tcsh

Conflicts:      toybox

%description extra
The vim extra package contains a extra files for powerful text editor.

%prep
%autosetup

echo '#define SYS_VIMRC_FILE "/etc/vimrc"' >> src/feature.h

%build

%configure --enable-multibyte
make VERBOSE=1 %{?_smp_mflags}

%install
#cd %{_builddir}/%{name}74
make DESTDIR=%{buildroot} install
ln -sv vim %{buildroot}%{_bindir}/vi
install -vdm 755 %{buildroot}%{_sysconfdir}
cat > %{buildroot}%{_sysconfdir}/vimrc << "EOF"
" Begin %{_sysconfdir}/vimrc

set shell=/bin/bash
set nocompatible
set backspace=2
set ruler
syntax on
set tags=./tags;/
color desert
if (&term == "iterm") || (&term == "putty")
  set background=dark
endif
" Binds
nmap <F2> :w<CR>
imap <F2> <Esc>:w<CR>
nmap <F10> :q!<CR>
nmap <Esc><Esc> :q<CR>
" Use 4 space characters instead of tab for python files
au BufEnter,BufNew *.py set tabstop=4 shiftwidth=4 expandtab
" Move the swap file location to protect against CVE-2017-1000382
" More information at http://security.cucumberlinux.com/security/details.php?id=120
if ! isdirectory("~/.vim/swap/")
        call system('install -d -m 700 ~/.vim/swap')
endif
set directory=~/.vim/swap/
" End %{_sysconfdir}/vimrc
EOF

%check
sed -i '/source test_recover.vim/d' src/testdir/test_alot.vim
sed -i '916d' src/testdir/test_search.vim
sed -i '454,594d' src/testdir/test_autocmd.vim
sed -i '1,9d' src/testdir/test_modeline.vim
sed -i '133d' ./src/testdir/Make_all.mak
make test %{?_smp_mflags}

%post
if ! sed -n -e '0,/[[:space:]]*call[[:space:]]\+system\>/p' %{_sysconfdir}/vimrc | \
     grep -q '^[[:space:]]*set[[:space:]]\+shell=/bin/bash'; then
  sed -i -e 's#^\([[:space:]]*\)\(call[[:space:]]\+system.*\)$#\1set shell=/bin/bash\n\1\2#g' %{_sysconfdir}/vimrc
fi

%files extra
%license README.txt
%doc %{_datarootdir}/vim/vim*/doc/*
%defattr(-,root,root)
%{_bindir}/vimtutor
%{_bindir}/xxd
%{_mandir}/*/*
%{_datarootdir}/vim/vim*/autoload/*
%{_datarootdir}/vim/vim*/bugreport.vim
%{_datarootdir}/vim/vim*/colors/*
%{_datarootdir}/applications/gvim.desktop
%{_datarootdir}/applications/vim.desktop
%{_datarootdir}/icons/hicolor/48x48/apps/gvim.png
%{_datarootdir}/icons/locolor/16x16/apps/gvim.png
%{_datarootdir}/icons/locolor/32x32/apps/gvim.png
%{_datarootdir}/vim/vim*/pack/dist/opt/*
%exclude %{_datarootdir}/vim/vim*/colors/desert.vim
%{_datarootdir}/vim/vim*/compiler/*
%{_datarootdir}/vim/vim*/delmenu.vim
%{_datarootdir}/vim/vim*/evim.vim
%{_datarootdir}/vim/vim*/ftoff.vim
%{_datarootdir}/vim/vim*/ftplugin.vim
%{_datarootdir}/vim/vim*/ftplugin/*
%{_datarootdir}/vim/vim*/ftplugof.vim
%{_datarootdir}/vim/vim*/gvimrc_example.vim
%{_datarootdir}/vim/vim*/indent.vim
%{_datarootdir}/vim/vim*/indent/*
%{_datarootdir}/vim/vim*/indoff.vim
%{_datarootdir}/vim/vim*/keymap/*
%{_datarootdir}/vim/vim*/macros/*
%{_datarootdir}/vim/vim*/menu.vim
%{_datarootdir}/vim/vim*/mswin.vim
%{_datarootdir}/vim/vim*/optwin.vim
%{_datarootdir}/vim/vim*/plugin/*
%{_datarootdir}/vim/vim*/synmenu.vim
%{_datarootdir}/vim/vim*/vimrc_example.vim
%{_datarootdir}/vim/vim*/print/*
%{_datarootdir}/vim/vim*/scripts.vim
%{_datarootdir}/vim/vim*/spell/*
%{_datarootdir}/vim/vim*/syntax/*
%exclude %{_datarootdir}/vim/vim82/syntax/nosyntax.vim
%exclude %{_datarootdir}/vim/vim*/syntax/syntax.vim
%exclude %{_datarootdir}/vim/vim82/autoload/dist/ft.vim
%{_datarootdir}/vim/vim*/tools/*
%{_datarootdir}/vim/vim*/tutor/*
%{_datarootdir}/vim/vim*/lang/*.vim
%doc %{_datarootdir}/vim/vim*/lang/*.txt
%lang(af) %{_datarootdir}/vim/vim*/lang/af/LC_MESSAGES/vim.mo
%lang(ca) %{_datarootdir}/vim/vim*/lang/ca/LC_MESSAGES/vim.mo
%lang(cs) %{_datarootdir}/vim/vim*/lang/cs/LC_MESSAGES/vim.mo
%lang(de) %{_datarootdir}/vim/vim*/lang/de/LC_MESSAGES/vim.mo
%lang(eb_GB) %{_datarootdir}/vim/vim*/lang/en_GB/LC_MESSAGES/vim.mo
%lang(eo) %{_datarootdir}/vim/vim*/lang/eo/LC_MESSAGES/vim.mo
%lang(es) %{_datarootdir}/vim/vim*/lang/es/LC_MESSAGES/vim.mo
%lang(fi) %{_datarootdir}/vim/vim*/lang/fi/LC_MESSAGES/vim.mo
%lang(fr) %{_datarootdir}/vim/vim*/lang/fr/LC_MESSAGES/vim.mo
%lang(ga) %{_datarootdir}/vim/vim*/lang/ga/LC_MESSAGES/vim.mo
%lang(it) %{_datarootdir}/vim/vim*/lang/it/LC_MESSAGES/vim.mo
%lang(ja) %{_datarootdir}/vim/vim*/lang/ja/LC_MESSAGES/vim.mo
%lang(ko.UTF-8) %{_datarootdir}/vim/vim*/lang/ko.UTF-8/LC_MESSAGES/vim.mo
%lang(ko) %{_datarootdir}/vim/vim*/lang/ko/LC_MESSAGES/vim.mo
%lang(nb) %{_datarootdir}/vim/vim*/lang/nb/LC_MESSAGES/vim.mo
%lang(no) %{_datarootdir}/vim/vim*/lang/no/LC_MESSAGES/vim.mo
%lang(pl) %{_datarootdir}/vim/vim*/lang/pl/LC_MESSAGES/vim.mo
%lang(pt_BR) %{_datarootdir}/vim/vim*/lang/pt_BR/LC_MESSAGES/vim.mo
%lang(ru) %{_datarootdir}/vim/vim*/lang/ru/LC_MESSAGES/vim.mo
%lang(sk) %{_datarootdir}/vim/vim*/lang/sk/LC_MESSAGES/vim.mo
%lang(sv) %{_datarootdir}/vim/vim*/lang/sv/LC_MESSAGES/vim.mo
%lang(uk) %{_datarootdir}/vim/vim*/lang/uk/LC_MESSAGES/vim.mo
%lang(da) %{_datarootdir}/vim/vim*/lang/da/LC_MESSAGES/vim.mo
%lang(lv) %{_datarootdir}/vim/vim*/lang/lv/LC_MESSAGES/vim.mo
%lang(sr) %{_datarootdir}/vim/vim*/lang/sr/LC_MESSAGES/vim.mo
%lang(tr) %{_datarootdir}/vim/vim*/lang/tr/LC_MESSAGES/vim.mo
%lang(vi) %{_datarootdir}/vim/vim*/lang/vi/LC_MESSAGES/vim.mo
%lang(zh_CN.UTF-8) %{_datarootdir}/vim/vim*/lang/zh_CN.UTF-8/LC_MESSAGES/vim.mo
%lang(zh_CN) %{_datarootdir}/vim/vim*/lang/zh_CN/LC_MESSAGES/vim.mo
%lang(zh_TW.UTF-8) %{_datarootdir}/vim/vim*/lang/zh_TW.UTF-8/LC_MESSAGES/vim.mo
%lang(zh_TW) %{_datarootdir}/vim/vim*/lang/zh_TW/LC_MESSAGES/vim.mo
%lang(cs.cp1250) %{_datarootdir}/vim/vim*/lang/cs.cp1250/LC_MESSAGES/vim.mo
%lang(ja.euc-jp) %{_datarootdir}/vim/vim*/lang/ja.euc-jp/LC_MESSAGES/vim.mo
%lang(ja.sjis) %{_datarootdir}/vim/vim*/lang/ja.sjis/LC_MESSAGES/vim.mo
%lang(nl) %{_datarootdir}/vim/vim*/lang/nl/LC_MESSAGES/vim.mo
%lang(pl.UTF-8) %{_datarootdir}/vim/vim*/lang/pl.UTF-8/LC_MESSAGES/vim.mo
%lang(pl.cp1250) %{_datarootdir}/vim/vim*/lang/pl.cp1250/LC_MESSAGES/vim.mo
%lang(ru.cp1251) %{_datarootdir}/vim/vim*/lang/ru.cp1251/LC_MESSAGES/vim.mo
%lang(sk.cp1250) %{_datarootdir}/vim/vim*/lang/sk.cp1250/LC_MESSAGES/vim.mo
%lang(uk.cp1251) %{_datarootdir}/vim/vim*/lang/uk.cp1251/LC_MESSAGES/vim.mo
%lang(zh_CN.cp936) %{_datarootdir}/vim/vim*/lang/zh_CN.cp936/LC_MESSAGES/vim.mo

%files
%defattr(-,root,root)
%license README.txt
%config(noreplace) %{_sysconfdir}/vimrc
%{_datarootdir}/vim/vim*/syntax/syntax.vim
%{_datarootdir}/vim/vim*/rgb.txt
%{_datarootdir}/vim/vim*/colors/desert.vim
%{_datarootdir}/vim/vim*/defaults.vim
%{_datarootdir}/vim/vim*/filetype.vim
%{_datarootdir}/vim/vim82/syntax/nosyntax.vim
%{_datarootdir}/vim/vim82/syntax/syntax.vim
%{_datarootdir}/vim/vim82/autoload/dist/ft.vim
%{_bindir}/ex
%{_bindir}/vi
%{_bindir}/view
%{_bindir}/rvim
%{_bindir}/rview
%{_bindir}/vim
%{_bindir}/vimdiff

%changelog
* Tue Oct 05 2021 Suresh Babu Chalamalasetty <schalam@microsoft.com> - 8.2.3441-2
- Fix vim startup error.
- vim-extra requires vim and fix for make check failure.

* Mon Sep 27 2021 Suresh Babu Chalamalasetty <schalam@microsoft.com> - 8.2.3441-1
- Fix CVE-2021-3778 and CVE-2021-3796 CVEs by updating to 8.2.3441.

* Fri Oct 30 2020 Pawel Winogrodzki <pawelwi@microsoft.com> - 8.1.1667-1
- Fix CVE-2019-20807 by updating to 8.1.1667.

* Thu Oct 15 2020 Emre Girgin <mrgirgin@microsoft.com> - 8.1.0388-7
- Fix CVE-2019-12735.

* Mon Jun 01 2020 Pawel Winogrodzki <pawelwi@microsoft.com> - 8.1.0388-6
- Adding a license reference.

* Mon Apr 13 2020 Eric Li <eli@microsoft.com> - 8.1.0388-5
- Add #Source0: comment and delete sha1. Verified license.

* Tue Sep 03 2019 Mateusz Malisz <mamalisz@microsoft.com> - 8.1.0388-4
- Initial CBL-Mariner import from Photon (license: Apache2).

* Tue Jan 29 2019 Dweep Advani <dadvani@vmware.com> - 8.1.0388-3
- Fixed swap file creation error for custom login shell

* Wed Sep 12 2018 Anish Swaminathan <anishs@vmware.com> - 8.1.0388-2
- Add conflicts toybox for vim-extra.

* Wed Sep 12 2018 Anish Swaminathan <anishs@vmware.com> - 8.1.0388-1
- Update to version 8.1.0388.

* Tue Jul 10 2018 Tapas Kundu <tkundu@vmware.com> - 8.0.0533-4
- Fix for CVE-2017-17087 and CVE-2017-1000382.

* Mon Aug 14 2017 Chang Lee <changlee@vmware.com> - 8.0.0533-3
- Disabled Test_recover_root_dir in %check.

* Tue May 02 2017 Anish Swaminathan <anishs@vmware.com> - 8.0.0533-2
- Remove tcsh requires.

* Fri Apr 14 2017 Xiaolin Li <xiaolinl@vmware.com> - 8.0.0533-1
- Updated to version 8.0.0533.

* Tue Feb 28 2017 Anish Swaminathan <anishs@vmware.com> - 7.4-10
- Fix for CVE-2017-6349 and CVE-2017-6350.

* Fri Feb 17 2017 Anish Swaminathan <anishs@vmware.com> - 7.4-9
- Fix for CVE-2017-5953.

* Fri Nov 18 2016 Anish Swaminathan <anishs@vmware.com> - 7.4-8
- Fix for CVE-2016-1248.

* Wed Oct 05 2016 ChangLee <changlee@vmware.com> - 7.4-7
- Modified %check.

* Wed Aug 24 2016 Alexey Makhalov <amakhalov@vmware.com> - 7.4-6
- vimrc: Added tags search, tab->spaces and some bindings.

* Tue May 24 2016 Priyesh Padmavilasom <ppadmavilasom@vmware.com> - 7.4-5
- GA - Bump release of all rpms.

* Thu Jul 16 2015 Touseef Liaqat <tliaqat@vmware.com> - 7.4-3
- Added profile related files in minimal vim package.

* Tue Jun 30 2015 Touseef Liaqat <tliaqat@vmware.com> - 7.4-3
- Pack extra files separately, to make vim package small.

* Fri Jun 19 2015 Alexey Makhalov <amakhalov@vmware.com> - 7.4-2
- Disable debug package. Use 'desert' colorscheme.

* Wed Nov 5 2014 Divya Thaluru <dthaluru@vmware.com> - 7.4-1
- Initial build First version.
