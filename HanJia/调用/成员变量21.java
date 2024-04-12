package HanJia.调用;

/*
     创建对象的格式：
                 类名 对象名=new 类名（）；
             使用成员变量的格式；
             对象名.变量名；
        注意：
            1. 打印对象名的时候，会出现对象在内存中的地址值
                     HanJia.调用.成员定义21@1b6d3586
            2.成员变量就算没有赋值，也可以直接使用，但是使用的是默认初始化值
                   整数：0;
                   小数：0.0;
                   布尔：false;
                   字符：'\u0000' 空白字符;
                   引用数据类型：null;
            3.引用数据类型：引用记录了一份地址值的变量
              该变量所对应的数据类型就是引用数据类型
              （类 数组 接口）
      */
public class 成员变量21 {
         String name;
         int age;
         public static void main(String[] args) {
             //  创建对象的格式：
             成员定义21 stu=new 成员定义21();   //类名 对象名=new 类名（）；
             //打印对象名的时候，会出现对象在内存中的地址值
             System.out.println(stu);
             //使用成员变量的格式；
             System.out.println(stu.name+"-----"+stu.age);   //对象名.变量名
              stu.name="小马";
              stu.age=21;
             System.out.println(stu.name+"-----"+stu.age);

         }
}
