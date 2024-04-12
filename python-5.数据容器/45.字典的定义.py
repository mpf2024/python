'''
定义字典字面量
{key:value,key:value,....,key:value,}
定义字典变量
my_dict = {key:value,key:value,....,key:value,}
定义空字典
my_dict = {}
my_dict = dict()
key:value  是一个键子对属于一个元素用冒号隔开
'''
# 定义字典
my_dict1 = {'王力宏':99,'周杰伦':88,'林俊杰':77}
# 定义空字典
my_dict2 = { }
my_dict3 = dict()
print(f"字典1的内容是：{my_dict1},类型：{type(my_dict1)}")
print(f"字典1的内容是：{my_dict2},类型：{type(my_dict2)}")
print(f"字典1的内容是：{my_dict3},类型：{type(my_dict3)}")
# 定义重复Key的字典  不允许重复，因为用Key查询时后面的值会覆盖前面的值
my_dict1 = {'王力宏':99,'王力宏':87,'周杰伦':88,'林俊杰':77}
print(f"重复Key的字典的内容是{my_dict1}")
# 从字典中基于Key获取Value
my_dict1 = {'王力宏':99,'周杰伦':88,'林俊杰':77}
stu_score = my_dict1["王力宏"]
print(f"王力宏的考试分数是:{stu_score}分")
# 定义嵌套字典
'''
{Key:{
  Key:Value,
  Key:Value,},
  Key:{
  Key:Value,
  Key:Value,}    
}
'''
stu_score_dict = {
    '王力宏':{
        '语文':77,
        '数学':66,
        '英语':33
    },'周杰伦':{
        '语文':88,
        '数学':86,
        '英语':55
    },'林俊杰':{
        '语文':99,
        '数学':96,
        '英语':66
    }
}
print(f"学生的考试信息是：{stu_score_dict}")
# 从嵌套字典中获取数据  score = stu_score_dict["Key"]["Key"]
# 看一下周杰伦的语文信息
score = stu_score_dict["周杰伦"]["语文"]
print(f"周杰伦的语文分数是：{score}")
