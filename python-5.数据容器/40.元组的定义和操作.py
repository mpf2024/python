'''
演示tuple元组的定义和操作
定义单个元素元组时必须在后面加一个逗号
元组不可修改，但是元组中的list内的可修改
'''
# 定义元组变量   变量名称 = （元素,元素,元素,.....,元素）
t1 = (1,"Hello",True)
# 定义空元组
t2 = ()
t3 = tuple()

print(f"t1的类型是：{type(t1)},内容是：{t1}")
print(f"t2的类型是：{type(t2)},内容是：{t2}")
print(f"t3的类型是：{type(t3)},内容是：{t3}")
# 定义单个元素的元组  定义单个元素元组时必须在后面加一个逗号
t4 = ("hello",)
print(f"t4的类型是：{type(t4)},内容是：{t4}")

# 定义一个嵌套元组  变量名称 = （（元素,元素,元素,...）,(元素,元素,元素,...)）
t5 = ((1,2,3),(4,5,6))
print(f"t5的类型是：{type(t5)},内容是：{t5}")
# 下标索引取出内容 取6
num = t5[1][2]
print(f"从嵌套元组中取出的数据是：{num}")
# 元组的操作：index查找方法
t6 = ("java","python","MySQL")
index = t6.index("java")
print(f"在元组t6中查找Java，的下标是：{index}")
# 元组的操作：count统计方法
t7 = ("java","java","python","java","MySQL","python","java","MySQL")
num = t7.count('java')
print(f"在元组t7中统计Java的数量：{num}")
# 元组的操作：len函数统计元组元素数量
t8= ("java","java","python","java","MySQL","python","java","MySQL")
num2 = len(t8)
print(f"t8元组中的元素有：{num2}个")
# 元组的操作：while
index = 0
while index <len(t8):
    print(f"元组的元素有：{t8[index]}")
    index += 1
# 元组的操作：for
for element in t8:
    print(f"2元组的元素有：{element}")

# 修改元组内容，定义一个元组  元组不可修改，但是元组中的list内的可修改
t9 = (1,2,[7,8,6])
print(f"t9的内容是：{t9}")
t9[2][0] = 4
t9[2][1] = 5
print(f"t9的内容是：{t9}")
