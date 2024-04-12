'''
w :文件不存在创建文件，文件存在清空所有内容，重新编写内容
打开文件
   f = open("python.txt",'w')
写入文件
   f = write("hello world")
内容刷新
   f = flish
   刷新内存到硬盘中
'''
# 打开文件，不存在的文件
f = open("D:\python\测试3.txt", "w",  encoding="UTF-8")
# write写入
f.write("Hello World!!!!")    #内容写入到内存中
# flush刷新
f.flush()                     # 将内存中积攒的内容，写入到硬盘的文件中
# close关闭
f.close()
# 打开一个存在的文件
f = open("D:\python\测试3.txt", "w",  encoding="UTF-8")
# write写入、flush刷新
f.write("小马")
f.flush()
# close关闭
f.close()
