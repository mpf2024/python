'''
def关键字，可以定义带有名称的函数
lambda关键字，可以定义匿名函数（无名称）
有名称的函数，可以基于名称重复使用
无名称的匿名函数，只能临时使用一次
lambda 传入参数：函数体（一行代码）
'''
# 定义一个函数，接收另一个函数作为传入参数
def test_func(compute):
    result = compute(1,2)   # 确定compute是函数
    print(f"compute参数的类型是：{type(compute)}")
    print(f"计算结果：{result}")
# 定义一个函数，准备作为参数传入另一个函数
def compute(x,y):
    return x + y
# 调用，并传入函数
test_func(compute)

# 匿名函数   没有名字，只能使用一次
def test_func(compute):
    result = compute(1,2)   # 确定compute是函数
    print(f"compute参数的类型是：{type(compute)}")
    print(f"计算结果：{result}")
# 通过lambda匿名函数的形式，将匿名函数作为参数传入
test_func(lambda x,y:x+y)
