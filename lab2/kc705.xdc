# Clock signal
create_clock -period 10.000 -name sysclk_p [get_ports sysclk_p]
set_property PACKAGE_PIN AD12 [get_ports sysclk_p]
set_property PACKAGE_PIN AD11 [get_ports sysclk_n]
set_property IOSTANDARD DIFF_SSTL15 [get_ports { sysclk_p }]
set_property IOSTANDARD DIFF_SSTL15 [get_ports { sysclk_n }]


##Buttons
set_property PACKAGE_PIN Y28  [get_ports {io_a}]
set_property PACKAGE_PIN AA28 [get_ports {io_b}]
set_property PACKAGE_PIN W29  [get_ports {io_c}]
set_property PACKAGE_PIN Y29  [get_ports {reset}] ##0

set_property IOSTANDARD LVCMOS25 [get_ports {io_a}]
set_property IOSTANDARD LVCMOS25 [get_ports {io_b}]
set_property IOSTANDARD LVCMOS25 [get_ports {io_c}]
set_property IOSTANDARD LVCMOS25 [get_ports {reset}]


##LEDs
set_property PACKAGE_PIN AB8 [get_ports io_out]

set_property IOSTANDARD LVCMOS15 [get_ports io_out]


