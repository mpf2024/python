'''
try:
   可能发生错误的代码
except：
   如果出现异常执行的代码
else：
    表示的是没有异常要执行的代码
finally:    表示的是无论是否异常都要执行的代码
    f.close

'''
# 基本捕获语法
try:
    f = open("D:\python\测试6.txt","r",encoding="UTF-8")
except:
    print("出现异常了,因为文件不存在，我将open的模式，改为w模式取打开")
    f = open("D:\python\测试6.txt", "w", encoding="UTF-8")
# 捕获指定的异常
try:
    print(name)
except NameError as e:    # 指定错误信息NameError ，其他错误将不会捕获
    print("出现了变量未定义的异常")
    print(e)              # 输出异常信息
# 捕获多个异常
try:
    1/0
    print(name)
except(NameError,ZeroDivisionError) as e:
    print("出现了变量未定义 或者 除以0的异常错误")
# 未正确设置捕获异常类型，将无法捕获异常
# 捕获所有异常
try:
    1/0
except Exception as e:    # 捕获任何异常
    print("出现异常了")
else:
    print("无异常")
finally:
    f.close()
