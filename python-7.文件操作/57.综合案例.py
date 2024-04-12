'''
演示文件操作综合案例：文件备份
'''
# 打开文件得到文件对象，准备读取
fr = open("D:\python\测试5.1.txt","r",encoding="UTF-8")
# 打开文件得到文件对象，准备写入
fw = open("D:\python\测试5.2.txt","w",encoding="UTF-8")

# for循环读取文件
for line in fr:
    line = line.strip()     #取出开头和结尾的空格和回车键
    print(line.split(","))
    # 判断内容，将满足的内容写出
    if line.split(",")[4] == "测试":
        continue     # continue 进入下一次循环,后面的内容跳过
    # 将内容写出去
    fw.write(line)
    # 由于前面对内容进行了strip() 把回车键去除，所以要手动写入换行符
    fw.write("\n")
# # close两个文件
fr.close()
fw.close()