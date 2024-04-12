'''
open(name,mode,encoding)
      name:是要打开的文件名的字符串可以包含文件所在的具体路径
      mode：设置打开文件的模式（访问模式：只读、写入、追加）
      encoding：编码格式（推荐使用UTF-8）
mode常用的三种基础访问模式
    r：以只读方式打开文件。文件的指针将放在文件的开头，这是默认模式
    w：打开一个文件只用于写入文件。如果该文件已存在则打开文件，并从头开始编辑，原有内容会被删除
       如果该文件不存在，创建新文件
    a：打开一个文件用于追加。如果该文件已存在，新内容将会被写入到已有内容之后。
       如果该文件不存在，创建新文件进行写入
示例代码：
      f=open("python.txt","r",encoding="UTF-8")
      encoding的顺序不是第三位，所以不能用位置参数，用关键字参数直接指定
'''
# 打开文件
import time

f=open("D:\python\测试.txt.txt","r",encoding="UTF-8")
print(type(f))
# 读取文件 - read（）  多次调用read，后面的read会接着前面read读取的内容开始读取
# print(f"读取十个字节的结果：{f.read(10)}")
# print(f"read方法读取全部内容的结果：{f.read()}") # 不写参数可以读取全部内容
# 读取文件 - readLines()
# lines = f.readlines()       # 读取文件的全部行，封装到列表中
# print(f"lines对象的类型：{type(lines)},内容是：{lines}")
# 读取文件 - readLine()   一次读取一行内容
# line1 = f.readline()
# line2 = f.readline()
# line3 = f.readline()
# print(f"第一行数据是：{line1}")
# print(f"第二行数据是：{line2}")
# print(f"第三行数据是：{line3}")
# for 循环读取文件进行
for line in f:
    print(f"每一行数据是：{line}")
#文件关闭
f.close()
time.sleep(500000)    # 程序睡眠
# with open 语法操作文件  执行完语法自动关闭
# whith open（”python。txt“,"r"）as f:
#   f.readlines  通过在with open的语句块中对文件进行操作，可以在操作完成后自动关闭close文件，避免遗忘掉close方法
with open("D:\python\测试.txt.txt","r",encoding="UTF-8") as f:
    for line in f:
       print(f"每一行数据是：{line}")


