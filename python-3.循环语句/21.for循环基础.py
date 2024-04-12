'''
同while循环不同，for循环是无法定义循环条件的
只能从被处理的数据集中，依次取出内容进行处理
 for 临时变量 in 待处理数据集 （序列）：
     循环满足条件是执行的代码
'''
# 统计如下字符串中，有多少个字母
name = 'itheima is a brand of itcast'
# 定义一个变量，用量统计有多少个a
count = 0
# for 循环统计
# for 临时变量in被统计的数据：
for x in name:
    if x=='a':
        count += 1
print(f'被统计的字符串中有{count}个a')

