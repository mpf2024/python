'''
打开文件，通过a模式打开即可
     f = open（"python.txt","a"）
文件写入
     f.write(""hello world)
内容刷新
     f.flush
a模式：文件不存在会创建文件
a模式：文件存在会在最后，追加写入文件
'''
# 打开文件 ，不存在的文件
fr = open("D:\python\测试4.txt", "a",  encoding="UTF-8")
# write 写入
f.write("Hello world")
# flush刷新
f.flush()
# close关闭
f.close()
# 打开一个存在的文件
f = open("D:\python\测试4.txt", "a",  encoding="UTF-8")
# write写入、flush刷新
f.write("小马")
f.flush()
# close
f.close()
