class Student:
    # __init__ 构造方法,可用于创建类对象的时候设置初始化行为
    def __init__(self,name,age):
        self.name=name
        self.age=age
    #  __str__魔术方法  用于实现类对象转字符串的行为
    def __str__(self):
        return f"Student类对象，name：{self.name},age:{self.age}"

    #  __lt__魔术方法  用于两个类对象比较大小
    def __lt__(self, other):
        return self.age < other.age
    #  __le__魔术方法  用于两个类对象进行大于等于或小于等于的比较
    def __le__(self, other):
        return self.age <=other.age

    #  __eq__魔术方法  用于比较两个类对象是否相等,若不用__eq__魔术方法,则默认比较内存地址值
    def __eq__(self, other):
        return self.age==other.age

stu1 = Student("小马",20)
stu2 = Student("大马",22)
print(stu1<stu2)
print(stu1>=stu2)
print(stu1<=stu2)
print(stu1==stu2)



