"""
%表示:我要占位
s表示:将变量变成字符串放入占位的地方
%s：将内容转换成字符串，放入占位位置
%d：将内容转换成整数，放入占位位置
%f：将内容转换成浮点型，放入占位位置
"""
# 通过占位的形式，完成拼接
name = '小马'
message = "%s要努力"%name
print(message)

# 通过占位的形式，完成数字和字符串的拼接
month_num = 6
day_num = 13
message = "这个学期%s月份放假，还要上%s周，就该过暑假了"%(month_num,day_num)
print(message)
'''
m:控制宽度，要求是数字（很少使用），设置的宽度小于数字自身，不生效
.n：控制小数点精度，要求是数字，会对小数的四舍五入，数据有损失
例：
%5d：表示将整数的宽度控制在5位，如数字11，被设置为5d就会变成[空格][空格][空格]11，用三个空格补足宽度
%5.2f：表示将宽度控制为5，将小数点精度设置为2
'''
name = '小马'
born_year = 2002
born_month = 2.1
message = "%s出生于%d年%.2f号"%(name,born_year,born_month)
print(message)

# 宽度
num1 = 11
num2 = 3.1415926
print('数字11宽度限制5，结果是：%5d'%num1)
print('数字3.1415926宽度限制4，小数精度，结果是：%4.2f'%num2)



