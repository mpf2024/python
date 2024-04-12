'''
演示布尔类型的定义
以及比较运算的应用
'''
# 定义变量储存布尔类型的数据
bool_1= True
bool_2= False
print(F'bool_1变量的内容是：{bool_1},类型是：{type(bool_1)}')
print(F'bool_1变量的内容是：{bool_2},类型是：{type(bool_2)}')
# 比较运算符的使用
# ==,!=,>,<,>=,<=
# 演示进行内容的相等比较
num1 = 10
num2 = 20
print(f'10==10的结果是：{num1 == num2}')

num1 = 10
num2 = 15
print(f'10!=15的结果是：{num1!=num2}')

name1 = 'xioama'
name2 = 'maxioa'
print(f'xioama == maxiao结果是：{name1==name2}')

# 演示大于小于，大于等于，小于等于的比较
num1 = 10
num2 = 5
print(f'10>5结果是：{num1>num2}')
print(f'10<5结果是：{num1<num2}')

num1 = 10
num2 = 11
print(f'10>=11结果是：{num1>=num2}')
print(f'10<=11结果是：{num1<=num2}')