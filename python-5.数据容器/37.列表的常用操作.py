"""
演示数据容器之：list列表的常用操作
index = 列表.index(元素)  查找某元素在列表内的下标索引,元素不存在则报错
 修改特定下标索引的值  语法：列表[下标] = 值
                语法：列表.insert（下标元素），在指定的下标位置，插入指定元素
追加单个元素          语法：列表.append(元素)
追加一批元素          语法：列表.extend(元素)
元素删除             语法1：del列表[下标]  语法2：列表.pop（下标）
                    只能删除元素         删除的同时可以作为返回值输出
删除某元素在列表中的第一个匹配项  语法：列表.remove（元素）
列表清空             语法：列表.clear（）
统计某元素在列表内的数量    语法：列表.count（元素）
统计列表中全部的元素数量  语法：len(列表)
"""
mylist = ["xiaoma","java","python"]
index = mylist.index("java")
print(f"xiaoma在列表中的元素下标索引值是：{index}")

# 修改特定下标索引值
mylist[0] = "传智教育"
print(f"列表被修改元素值后，结果是：{mylist}")
# 在指定下标位置插入新元素
mylist.insert(1,"MySQL")
print(mylist)
# 在列表的尾部追加'''单个'''新元素
mylist.append("Wed")
print(f"列表在追加一个元素后，结果是：{mylist}")
# 在列表尾部追加'''一批'''新元素
mylist2 = [1,2,3]
mylist.extend(mylist2)
print(f"列表在追加一批元素后，结果是：{mylist}")
# 元素删除方法一：del 列表[下标]
del mylist[5]
print(f"列表在删除一个元素后，结果是：{mylist}")
# 元素删除方法二：列表.pop(下标)
element = mylist.pop(5)
print(f"通过pop方法取出元素后列表内容：{mylist}，取出的元素是：{element}")
# 删除某元素在列表中的第一个匹配项
mylist2 = [2,1,2,2,3,2]
mylist2.remove(2)
print(f"通过remove方法移除元素后，列表的结果是：{mylist2}")
# 清空列表   列表,clear（）
mylist2.clear()
print(f"列表被清空了，结果是：{mylist2}")
# 统计列表内元素的数量   列表.count（）
mylist2 = [2,1,2,2,3,2]
count = mylist2.count(2)
print(f"列表中2的数量是：{count}")
# 统计列表中全部的元素数量
count = len(mylist)
print(f"列表的元素数量总共有：{count}")