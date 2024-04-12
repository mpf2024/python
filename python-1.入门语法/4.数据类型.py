"""
type 用于返回数据类型
"""
# 方法(1:使用print直接输出输出类型信息)
print(type("小马"))
print(type(666))
print(type(1314))
# 方法(2:使用变量存储type（）语句的结果)
string_type = type("小马")
int_type = type("666")
float_type = type("1314")
print(string_type)
print(int_type)
print(float_type)
#方法(3: 使用type()语句，查看变量中存储的数据类型信息
name = "小马"
name_type = type(name)
print(name_type)