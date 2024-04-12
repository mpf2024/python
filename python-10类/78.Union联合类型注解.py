# 使用UNion联合类型注解
from typing import Union

my_list:list[Union[str,int]] = [1,2,'itheima','itcast']

def func(data: Union[int,str]) ->Union[int.str]:
    pass

func()