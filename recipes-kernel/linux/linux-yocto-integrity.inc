FILESEXTRAPATHS_prepend := "${THISDIR}/linux-yocto-integrity:"

SRC_URI += " \
    ${@base_contains('DISTRO_FEATURES', 'ima', 'file://ima.scc', '', d)} \
    ${@base_contains('DISTRO_FEATURES', 'ima', 'file://ima.cfg', '', d)} \
"

