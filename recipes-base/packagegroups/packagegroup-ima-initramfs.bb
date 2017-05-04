#
# Copyright (C) 2016-2017 Wind River Systems Inc.
#

DESCRIPTION = "Linux Integrity Measurement Architecture (IMA) subsystem for initramfs"

include packagegroup-ima.inc

RDEPENDS_${PN} += " \
    util-linux-mount \
    util-linux-umount \
    gawk \
    ima-policy \
    initrdscripts-ima \
"
