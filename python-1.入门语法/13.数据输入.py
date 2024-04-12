'''
演示python的input语句
 input(提示信息)：获取键盘录入信息
     input()
       无论录入什么类型的数据，获得的数据永远都是字符串
'''
name = input('请告诉我你是谁：')
print(f"我知道了，你是：{name}")

# 输入数字类型
num = input('请告诉我你的银行卡密码：')
num = int(num)
print("你的银行卡密码的类型是：",type(num))