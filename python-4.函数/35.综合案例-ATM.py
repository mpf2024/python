# 定义全局变量money name
money = 5000000
name = None
# 要求客户输入信息
name = input('请输入你的姓名：')
# 定义查询函数
def query(show_header):
    if show_header:
        print('-------查询余额-------')
    print(f'{name},您好！你的余额剩余：{money}元')
# 定义存款函数
def saving(num):
    global money # money在函数内部定义为全局变量
    money +=num
    print("-------存款-------")
    print(f"{name},您好！您存款{num}元成功")
    # 调用query函数查询余额
    query(False)

# 定义取款函数
def get_money(num):
    global money
    money -=num
    print("-------取款-------")
    print(f"{name},您好！您取款{num}元成功")
    # 调用query函数查询余额
    query(False)
# 定义主菜单函数
def main():
    print("------主菜单-------")
    print(f"{name},您好！，欢迎来到中国银行ATM。请选择操作")
    print("查询余额\t[请输入1]")
    print("存款\t\t[请输入2]")
    print("取款\t\t[请输入3]")
    print("退出\t\t[请输入4]")
    return input("请输入你的选择：")
# 设置无线循环，确保程序不退出
while True:
    keyboard_input = main()
    if keyboard_input == "1":
        query(False)
    elif keyboard_input == "2":
        num = int(input("您想要存多少钱？请输入："))
        saving(num)
    elif keyboard_input == "3":
        num = int(input("您想要取多少钱？请输入："))
        get_money(num)
    else:
        print("程序退出")
        break


