'''
演示数据容器之：list
语法：[元素，元素，.....]
'''
# 定义一个列表list
my_list = ['xiaoma','java','python']
print(my_list)
print(type(my_list))

my_list = ['xiaoma',666,True]
print(my_list)
print(type(my_list))

# 定义一个嵌套的列表
my_list = [[1,2,3],[4,5,6]]
print(my_list)
print(type(my_list))

# 通过下标索引取出对应位置的数据
my_list = ['Tom','lily','Rose']
# 列表[下标索引]，从前向后从0开始，每次+1，从后向前从-1开始，每次-1
print(my_list[0])
print(my_list[1])
print(my_list[2])
# 错误示范：通过下标索引数据，一定不要超出范围
# print(my_list[3])

# 通过下标索引取出数据（倒序取出）
print(my_list[-1])
print(my_list[-2])
print(my_list[-3])

# 取出嵌套列表,按索引顺序取，把小列表当作元素
my_list = [[1,2,3],[4,5,6]]
print(my_list[0][2])
print(my_list[1][1])
print(my_list[0][0])


