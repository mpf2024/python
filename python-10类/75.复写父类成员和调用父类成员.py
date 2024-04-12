class Phone:
    IMEI = None       # 序列号
    producer = "ITCAST"   # 厂商

    def call_by_5g(self):
        print('使用5g网络进行通话')

# 定义子类，复写父类成员
class MyPhone(Phone):
    producer = "ITHEIMA"     # 重新修改父类中的内容称为复写

    def call_by_5g(self):    # 复写方法
        print('开启CPU单核模式，确保通话的时候省电')
        # 方法一
        print(f'父类的厂商是：{Phone.producer}')
        Phone.call_by_5g(self)
        # 方法二
        print(f'父类的厂商是：{super().producer}')
        super().call_by_5g()
        print('关闭CPU单核模式，确保性能')

phone = MyPhone()
phone.call_by_5g()
print(phone.producer)

"""
方法一：
  调用父类成员
     使用成员变量：父类名.成员变量
     使用成员方法：父类名.成员方法（self）
     
方法二:
   使用super()调用父类成员
      使用成员变量：super().成员变量
      使用成员变量：super().成员变量
"""

