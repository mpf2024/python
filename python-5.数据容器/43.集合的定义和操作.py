'''
列表使用：[]
元组使用：()
字符串使用：”“
集合使用：{}
定义集合变量
    变量名称 = {元素，元素，元素，...,元素}
定义空集合
     变量名称 = set()
注意：
    集合不允许重复，无序，不支持下标索引访问，允许修改,自带去重效果
取集合的差集
   语法：集合difference(集合2)
   功能：取出集合1和集合2的差集  集合1有集合2没有的
   结果：得到一个新集合，集合1和集合2不变
消除差集
    语法：集合1difference _update(集合2)
    功能：对比集合1和集合2，在集合1内，删除和集合2相同的元素
    结果：结合1被修改，集合2不变
两个集合合并
    语法：集合1，union(集合2)
    功能：将集合1和集合2组合成新集合
    结果：得到新集合，集合1和集合2不变
'''
# 定义集合
my_set = {"传智教育",'黑马程序员',"itheima","传智教育",'黑马程序员',"itheima","传智教育",'黑马程序员',"itheima"}
my_set_empty = set()
print(f"my_set的内容是:{my_set},类型是：{type(my_set)}")
print(f"my_set的内容是:{my_set_empty},类型是：{type(my_set_empty)}")
# 添加元素
my_set.add("Python")
print(f"my_set添加元素后结果是：{my_set}")
# 移除元素
my_set.remove("黑马程序员")
print(f"my_set移除元素后结果是：{my_set}")
# 随机取出一个元素
element = my_set.pop()
print(f"集合被取出元素是：{element},取出元素后：{my_set}")
# 清空集合 ，clear
my_set.clear()
print(f"集合被清空啦，结果是：{my_set}")
# 取两个集合的差集
set1 = {1,2,3,5,7,9}
set2 = {1,2,3,4,6,8}
set3 = set1.difference(set2)
print(f"取出差集后的集合是：{set3}")
print(f"取出差集后，原有set1的内容是：{set1}")
print(f"取出差集后，原有set2的内容是：{set2}")
# 消除两个集合的差集
set1 = {1,2,3,5,7,9}
set2 = {1,2,3,4,6,8}
set1.difference_update(set2)
print(f"消除差集后，原有set1的内容是：{set1}")
print(f"消除差集后，原有set2的内容是：{set2}")
# 两个集合合并为一个
set1 = {1,2,3,5,7,9}
set2 = {1,2,3,4,6,8}
set4 = set1.union(set2)
print(f"两集合合并结果：{set4}")
print(f"合并后结果：{set1}")
print(f"合并后结果：{set2}")
# 统计集合元素数量
num = len(set4)
print(f"集合内的元素数量有：{num}个")
# 集合的遍历  集合不支持下标索引，不能用while循环  可以用for循环
for element in set4:
     print(f"集合的元素有：{element}")