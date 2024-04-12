'''
演示第二种格式化方式：f"{占位}"
    f" {变量} {变量}"的方式进行快速格式化
这种方式：
   不理会类型
   不做精度控制
   适合对精度没有要求的时候快速使用
'''
name = '传智播客'
set_up_year = 2006
stock_price = 19.99
# f:format
print(f"我是{name}，我成立于：{set_up_year}年，我今天的股价是{stock_price}")



