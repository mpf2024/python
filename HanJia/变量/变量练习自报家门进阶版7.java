package HanJia.变量;
/*
  需求：将（姓名，年龄，性别，身高，婚姻状况）定义变量，随后打印在控制台。
           分析：
               姓名---> 字符串  String
               年龄----> 整数类型 int
               性别----> 字符  char
               身高----> 浮点数 double
               婚姻状况----> 布尔 boolean
 */
public class 变量练习自报家门进阶版7 {
    public static void main(String[] args) {
        String name="张三";
        int age =18;
        char gender='男';
        double heig =182.4;
        boolean flag=false;
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println( heig+"cm" );
        System.out.println(flag);
    }
}
