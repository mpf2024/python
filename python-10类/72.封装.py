'''
演示面向对象封装思想中私有成员得使用
'''

# 定义一个类，内容私有成员变量和私有成员方法   私有一"__"开头
class Phone:

    __current_voltage = 0.5   # 定义私有当前手机运行电压


    def  __keep_single_core(self):    # 定义私有成员方法
        print("让CPU以单核模式进行运行")

    def  call_by_5g(self):            # 私有成员变量外部不能调用，但内部可以随便调用
        if self.__current_voltage >= 1:
            print("5g通话已开启")
        else:
            self.__keep_single_core()
            print('电量不足，无法使用5g通话，并已设置为单核运行进行省电。')

phone = Phone()
# phone.__keep_single_core()   私有成员方法无法调用
phone.call_by_5g()