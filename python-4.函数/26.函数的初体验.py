'''
函数
  已组织好的
  可重复使用
  针对特定功能
  len()统计字符串长度
'''
str1 = 'hsahdbshabf'
str2 = 'hwuiqbdhsjhag'
str3 = 'wubgcebdh'
count = 0
for i in str1:
    count +=1
print(f'字符串{str1}的长度是：{count}')
count = 0
for i in str2:
    count +=1
print(f'字符串{str2}的长度是：{count}')
count = 0
for i in str3:
    count +=1
print(f'字符串{str3}的长度是：{count}')

# 函数演示
def my_len(data):
    count = 0
    for i in data:
        count += 1
    print(f'字符串{data}的长度是：{count}')

my_len(str1)
my_len(str2)
my_len(str3)