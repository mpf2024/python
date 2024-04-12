# 定义一个出现异常的方法
def func1():
    print(f"func1 开始执行")
    num = 1/0      # 肯定会有异常
    print(f"func1 结束执行")
# 定义一个无异常的方法
def func2():
    print(f"func2 开始执行")
    func1()
    print(f"func2 结束执行")
# 定义一个方法，调用上面的方法
def main():
    """
    异常具有传递性，不用再最底层捕获，可以在顶级函数中捕获
    :return:
    """
    try:
        func2()
    except Exception as e:
        print(f"出现异常了，异常的信息是：{e}")


main()