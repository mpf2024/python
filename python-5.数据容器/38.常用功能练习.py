'''
演示List常用操作的可后来练习
'''
# 1.定义这个列表，并用变量接收它，内容是：[21,25,21,23,22,20]
mylist = [21,25,21,23,22,20]
# 2.追加一个数字31，到列表的尾部  列表.append()
mylist.append(31)
print(mylist)
# 3.追加一个新列表[29,33,30]   列表.extend()
mylist2 = [29,33,30]
mylist.extend(mylist2)
print(mylist)
# 4.取出第一个元素（应是：21）   列表[下标]
num = mylist[0]
print(f"从列表中取出来第一个元素，应该是21，实际上是：{num}")
# 5.取出最后一个元素（应是：30）
num2 = mylist[-1]
print(f"从列表中取出来最后一个元素，应该是30，实际上是：{num2}")

# 6.查找元素31，在列表中的下标位置
index = mylist.index(31)
print(f"元素31在列表的下标位置是：{index}")
print(f"最后列表的内容是：{mylist}")