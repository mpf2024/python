'''
演示if elif else 多条件判断语句的使用
'''
# height = int(input("请输入你的身高（cm）："))
# VIP_level= int(input("请输入你的VIP等级（1-5）："))

# 通过if判断，可以使用多判断的语法
# 第一个条件就是if
if int(input("请输入你的身高（cm）："))<120:
    print('身高小于120cm，可以免费。')
elif int(input("请输入你的VIP等级（1-5）："))>3:
    print('vip等级大于3，可以免费')
elif int(input('请告诉我今天记号:')) ==1:
    print('今天事1号免费日，可以免费.')
else:
    print('不好意思，条件都不满足，需要买票10元。')