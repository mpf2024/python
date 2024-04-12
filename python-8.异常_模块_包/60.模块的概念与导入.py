"""
模块再使用前需要先导入
   [from 模块名] import [模块|类|变量|函数|*]  [as 别名]
常用的组合形式如：
    import 模块名
    from   模块名  import 类、变量、方法等
    from   模块名  import*
    from   模块名  as 别名
    from   模块名  import 功能名 as 别名
"""
import time   # 导入python内置的time模块（time.py这个代码文件）
print("你好")
time.sleep(3)  # 通过. 就可以使用模块内部的全部功能（类、函数、变量）
print('你也好')
"""
from 模块名 import 功能名
功能名（）
"""
from time import sleep
print("开始")
# 让程序睡眠2秒
sleep(2)
print("结束")
# 使用 * 导入time模块的全部功能
from time import *
print("开始")
# 让程序睡眠2秒
sleep(2)
print("结束")
# 使用as给特定功能加上别名
import time as t
print("开始")
t.sleep(3)
print("结束")

from time import sleep as t
print("开始")
t(3)
print("结束")

