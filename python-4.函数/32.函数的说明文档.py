'''
对函数进行说明解释，帮助更好理解函数的功能
'''
# 定义函数，进行文档说明
def add(x,y):
    '''
    add函数可以接受两个参数，进行两数相加的功能
    :param x: 形参x表示相加的其中一个数字
    :param y: 形参y表示相加的另一个数字
    :return: 返回值是两个数相加的结果
    '''
    result = x + y
    print(f'两数相加的结果是：{result}')
    return result

add(5,6)