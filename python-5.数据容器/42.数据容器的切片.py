# 对list进行切片，从1开始，4结束，步长为1
my_list = [0,1,2,3,4,5,6]
result1 = my_list[1:4]   # 步长默认是1，所以可以省略不写
print(f"结果是：{result1}")

# 对tuple进行切片,从头开始，到最后结束，步长为1
my_tuple = (0,1,2,3,4,5,6)
result2 = my_tuple[:]  # 其实和结束不写表示从头到尾，步长为1可以省略
print(f"结果是：{result2}")

# 对str进行切片，从头开始，到最后结束，步长为2
my_str = "01234567"
result3 = my_str[::2]
print(f"结果是：{result3}")

# 对str进行切片，从头开始，到最后结束，步长为-1
my_str = "01234567"
result4 = my_str[::-1]   # 等同于将序列反转
print(f"结果是：{result4}")

# 对列表进行切片，从3开始，到1结束，步长-1
my_str = [0,1,2,3,4,5,6,7]
result5 = my_str[3:1:-1]
print(f"结果是：{result5}")
# 对元组进行切片，从头开始，到尾结束，步长-2
my_tuple = (0,1,2,3,4,5,6)
result6 = my_tuple[::-2]
print(f"结果是：{result6}")
'''
演示序列的切片的课后练习
'''
my_str = "万过薪月，员序程马黑来，nohtyP学"
# 倒序字符串，切片取出
result7 = my_str[::-1][9:14]
print(f"结果是：{result7}")
# 切片取出，然后倒序
result8 = my_str[5:10][::-1]
print(f"结果是：{result8}")
# split分隔”，“ replace替换”来“为空，倒序字符串
result9 = my_str.split("，")[1].replace("来","")[::-1]
print(f"结果是：{result9}")
