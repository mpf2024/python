'''
按照返回值的顺序，写对应顺序的多个变量接收即可，
 变量之间用逗号隔开，支持不同类型的数据return
'''
def test_return():
    return 1,"Holle",Ture
x,y,z = test_return()
print(x)
print(y)
print(z)