# '''
# 演示自定义模块
# '''
# # 导入自定义模块使用
# # import 模块名
# #         模块名.功能
# # import  my_module1
# # from 模块名 import  功能
# #    功能（）
# # from my_module1 import text
# # text(1,2)
# # 导入不同模块的同名功能    后面的模块会把前面的覆盖
# from my_module1 import text
# from my_module2 import text
# text(1,2)
# # __main__变量
# '''
# if __main__=="__main__"表示，只有当程序是直接执行的才会进入if内部，如果是被导入的，则if无法将进入
# '''
# from my_module1 import test
# __all__变量   控制变量*代表的全部变量
from my_module2 import *
test_A(1,2)
test_B(4,5)