'''
range（num）
获取一个从o开始，到num结束的数
range(num1,num2)
获取一个从num1开始，到num2结束的数字序列（不含num2本身）
range(num1,num2，step)
获取一个从num1开始，到num2结束的数字序列（不含num2本身）
数字之间的步长，以step为准（step默认为1）
如，range（5，10，2）取得的数据是：[5,7,9]
'''

# # range语法1 range(num)
# for x in range(10):
#     print(x)
# # range语法2 range(num1,num2)
# for x in range(5,10):
#     print(x)
# # range 语法3 range(num1,num2,step)
# for x in range(5,10,2):
#     print(x)
count = 0
for x in range(1,100):
    if x%2==0:
        count += 1
print(f"偶数的个数为：{count}个")
