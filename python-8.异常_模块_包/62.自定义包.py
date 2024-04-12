# 创建一个包
# 导入自定义的包中的模块，并使用
import my_package8.my_moudule2
import my_package8.my_moudule

from my_package8.my_moudule import info_print1
from my_package8.my_moudule2 import info_print2

from my_package8 import my_moudule
from my_package8 import my_moudule2
# 调用
my_package8.my_moudule.info_print1()
my_package8.my_moudule2.info_print2()

info_print1()
info_print2()

my_moudule.info_print1()
my_moudule2.info_print2()

