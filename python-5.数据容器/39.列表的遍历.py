'''
演示对list列表的循环，使用while和for循环两种方式
while适用于任何场景，for适用于从容器中依次取出元素并处理
'''
def list_while_func():
    """
    使用while循环遍历列表的演示函数
    :return:  None
    """
    my_list = ["java","python","MySQL"]
    # 循环控制变量通过下标索引来控制，默认0
    # 每一次循环将下标索引变量+1
    # 循环条件：下标索引变量 < 列表的元素数量

    # 定义一个变量用来标记列表的下标
    index = 0     # 初始值为0
    while index < len(my_list):
        # 通过index变量取出对应下标的元素  element元素
        element = my_list[index]
        print(f"列表的元素：{element}")
        # 至关重要 将循环变量（index）每一次循环都+1
        index += 1
def list_for_func():
    """
    使用for 循环遍历列表的演示函数
    :return: None
    """
    my_list = [1,2,3,4,5]
    # for 临时变量 in数据容器
    for element in my_list:
        print(f"列表的元素有：{element}")
list_while_func()
list_for_func()
# 定义一个列表
list = [1,2,3,4,5,6,7,8,9,10]

def my_list():
     # 定义一个空列表
     listx=[]
     # 定义一个元素下标
     index = 0
     # 定义while循环遍历列表
     while index < len(list):
         # 定义一个变量接收元素
         element = list[index]
         # # 用if判断元素的奇偶性
         if element % 2 == 0:
             # 用空列表接收偶数
             listx.append(element)
         #  循环变量+1
         index +=1
     # 输出偶数列表
     print(listx)

def my_list2():
    # 定义一个空列表
    listx2 = []
    # 定义一个变量接收元素，用for循环遍历list
    for element in list:
        # 用if判断元素的奇偶性
        if element%2==1:
            # 用空列表接收奇数
            listx2.append(element)
    print(listx2)


my_list()
my_list2()