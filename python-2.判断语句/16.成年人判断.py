'''
成年人的判断
'''
age = int(input('请输入你的年龄：'))
price = 10
# 通过if判断是否成年
if age>=18:
    print(f"你已成年，游玩需要补票{price}元")
print("祝你游玩愉快")

'''
if else的组合判断语句
'''
age = int(input('请输入你的年龄：'))
if age >=18:
    print('你已成年，需买票10元')
# 不需要判断条件
else:
    print('你未成年，可以免费游玩')


'''
演示if else练习题：我要买票吗
'''
height = int(input("请输入你的身高（cm）："))
# 通过if进行判断
if height>=120:
    print("你的身高超出120CM，需要买票，10元")
else:
    print("你的身高低于120CM，可以免费游玩。")

print("祝你游玩愉快！")