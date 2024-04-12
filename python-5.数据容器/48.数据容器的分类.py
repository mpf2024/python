"""
 是否支持下标索引
     支持：列表，元组，字符串 - 序列类型
     不支持：集合，字典 - 非序列类型
 是否支持重复元素：
     支持：列表，元组，字符串 - 序列类型
     不支持：集合，字典 - 非序列类型
 是否支持修改：
     支持：列表，集合，字典
     不支持：元组，字符串
列表，元组，字符串支持while循环，集合，字典不支持，因为没有下标索引
排序：
   sorted(容器，[reverse=True])
"""
# 列表
my_list = [1,2,3,4,5]
# 元组
my_tuple = (1,2,3,4,5)
# 字符串
my_str = "abcdefg"
# 集合
my_set = {1,2,3,4,5}
# 字典
my_dict = {"key1":1,"key2":2,"key3":3,"key4":4,"key5":5}
# len元素个数
print(f"列表 元素个数有：{len(my_list)}")
print(f"元组 元素个数有：{len(my_tuple)}")
print(f"字符串 元素个数有：{len(my_str)}")
print(f"集合 元素个数有：{len(my_set)}")
print(f"字典 元素个数有：{len(my_dict)}")
# max最大元素
print(f"列表最大元素个数有：{max(my_list)}")
print(f"元组最大元素个数有：{max(my_tuple)}")
print(f"字符串最大 元素个数有：{max(my_str)}")
print(f"集合最大元素个数有：{max(my_set)}")
print(f"字典最大元素个数有：{max(my_dict)}")
# min最小元素
print(f"列表  最小元素个数有：{min(my_list)}")
print(f"元组  最小元素个数有：{min(my_tuple)}")
print(f"字符串最小元素个数有： {min(my_str)}")
print(f"集合  最小元素个数有：{min(my_set)}")
print(f"字典  最小元素个数有：{min(my_dict)}")
# 类型转换：容器转列表
print(f"列表 转列表的结果是:{list(my_list)}")
print(f"元组 转列表的结果是:{list(my_tuple)}")
print(f"字符串转列表的结果是:{list(my_str)}")
print(f"集合 转列表的结果是:{list(my_set)}")
print(f"字典 转列表的结果是:{list(my_dict)}")
# 类型转换：容器转元组
print(f"列表 转元组的结果是:{tuple(my_list)}")
print(f"元组 转元组的结果是:{tuple(my_tuple)}")
print(f"字符串转元组的结果是:{tuple(my_str)}")
print(f"集合 转元组的结果是:{tuple(my_set)}")
print(f"字典 转元组的结果是:{tuple(my_dict)}")
# 类型转换：容器转字符串
print(f"列表 转字符串的结果是:{str(my_list)}")
print(f"元组 转字符串的结果是:{str(my_tuple)}")
print(f"字符串转字符串的结果是:{str(my_str)}")
print(f"集合 转字符串的结果是:{str(my_set)}")
print(f"字典 转字符串的结果是:{str(my_dict)}")
# 类型转换：容器转集合
print(f"列表 转集合的结果是:{set(my_list)}")
print(f"元组 转集合的结果是:{set(my_tuple)}")
print(f"字符串转集合的结果是:{set(my_str)}")
print(f"集合 转集合的结果是:{set(my_set)}")
print(f"字典 转集合的结果是:{set(my_dict)}")
# 进行容器的排序
my_list = [6,4,1,3,8,7,2,9,5]
print(f"列表对象的排序结果：{sorted(my_list)}")
print(f"列表对象的反向排序结果：{sorted(my_list,reverse=True)}")