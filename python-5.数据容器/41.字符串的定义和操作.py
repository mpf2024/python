'''
演示以数据容器的角色，学习字符串的相关操作
字符串不支持需改，字符串是只读
语法：字符串.replace(字符串1，字符串2)
功能：将字符串内的全部：字符串1，替换为字符串2
注意：不是修改字符串本身，而是得到了一个新字符串
字符串的分割
     语法：字符串.split(分割符字符串)
     功能：按照指定的分隔符字符串，将字符串划分为多个字符串，并存入列表对象中
     注意：字符串本身不变，而是得到了一个列表对象
字符串的规整操作（去前后空格）
     my_str = " itheima and itcast "
     print(my_str.strip())   结果：”itheima and itcast“
字符串的规整操作（去前后指定字符串）
     my_str = " 12itheima and itcast21 "
     print(my_str.strip(”12“))   结果：”itheima and itcast“
     注意：传入的是”12“其实就是：”1“，”2“都会移除是按照字符
'''
my_str = "itheima and itcast"
# 通过下标索引取值
value = my_str[2]
value2 = my_str[-16]
print(f"从字符串{my_str}取下标为2的元素值是：{value}，取下标为2的元素值是：{value2}")
# index方法
index = my_str.index('and')
print(f"在字符串{my_str}中查找and，起始下标是：{index}")
'''
 语法：字符串.replace(字符串1，字符串2)
 功能：将字符串内的全部：字符串1，替换为字符串2
 注意：不是修改字符串本身，而是得到了一个新字符串
'''
# replace方法
new_my_str = my_str.replace("it","程序")
print(f"将字符串{my_str},进行替换后的到：{new_my_str}")

'''
字符串的分割
     语法：字符串.split(分割符字符串)
     功能：按照指定的分隔符字符串，将字符串划分为多个字符串，并存入列表对象中
     注意：字符串本身不变，而是得到了一个列表对象

'''
# split方法
my_str = 'hello java python'
new_my_list =  my_str.split(" ")
print(f"将字符串{my_str}进行split切分后得到：{new_my_list},类型是：{type(new_my_str)}")
'''
字符串的规整操作（去前后空格）
     my_str = " itheima and itcast "
     print(my_str.strip())   结果：”itheima and itcast“
字符串的规整操作（去前后指定字符串）
     my_str = " 12itheima and itcast21 "
     print(my_str.strip(”12“))   结果：”itheima and itcast“
     注意：传入的是”12“其实就是：”1“，”2“都会移除是按照字符
'''
# strip
# 去前后空格
my_str = " itheima and itcast "
new_my_str = my_str.strip()   # 不传入参数，去除首尾空格
print(f"字符串{my_str}被strip后，结果是：{new_my_str}")
# 去前后指定字符串
my_str2 = "12itheima and itcast21"
new_my_str2 = my_str2.strip("12")
print(f"字符串{my_str2}被strip后，结果是：{new_my_str2}")
# 统计字符串中某字符串的出现次数
my_str = "itheima and itcast"
count = my_str.count("it")
print(f"字符串{my_str}中的it出现的次数是：{count}")
# 统计字符串的长度
num = len(my_str)
print(f"字符串的长度为：{num}")