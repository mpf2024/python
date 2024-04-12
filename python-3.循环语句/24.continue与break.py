'''
continue关键字用于：中断本次循环，直接进入下一次循环
continue可以用于：for循环和while循环，效果一致
'''
# # 演示循环中断语句 continue
# for i in range(1,6):
#      print('语句1')
#      continue
# # 当语句中遇到continue结束本次循环，进行下一次循环
#      print('语句2')
for i in range(1,6):
    print('语句1')
    for j in range(1,6):
        print('语句2')
        # 内层循环的continue只能中断内层循环，外层循环不影响
        continue
        print('语句3')
    print('语句4')


'''
break关键字用于：直接结束循环
break可以用于：for循环和while循环，兄啊过一致
'''

# 演示循环中断语句break
for i in range(1,101):
    print('语句1')
    # break出现直接结束循环，执行循环外的内容
    break
    print('语句1')
print('语句3')

# 演示break的嵌套应用
for i in range(1,6):
    print('语句1')
    for j in range(1,6):
        print('语句2')
        # 内层循环的break只能结束内层循环，外层循环不影响
        break
        print('语句3')
    print('语句4')

