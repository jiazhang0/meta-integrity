#
# Copyright (C) 2017 Wind River Systems Inc.
#

# Append iversion option for auto types
do_install_append() {
    sed -i 's/\s*auto\s*defaults/&,iversion/' ${D}${sysconfdir}/fstab
}
