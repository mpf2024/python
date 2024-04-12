package HanJia.运算;
/*
           定义不同基本数据类型的变量，并使用
           整数类型：
                       byte          -128~127
                       short         -32768~32767
                       int            十位数
                       long           十九位数
                       在定义Long类型变量时，需要在后面加入L的标识（大小写都可以)
           小数类型：
                    float
                    在定义float类型变量时，需要在后面加入F的标识（大小写都可以)
                    double
           字符：
                    char
            布尔：
                    boolean

 */
public class 数据类型的使用6 {
    public static void main(String[] args) {
        //整数类型变量
           byte num=10;
           short num2=20;
           int num3=40;
           long num4=123456789123456789L;
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println("_____________________");

           //小数类型变量
        float num5=12.5F;
        double num6=12.3;
        System.out.println(num5);
        System.out.println(num6);

        System.out.println("_____________________");
        //字符类型变量
        char c1='中';
        System.out.println( c1);
        System.out.println("_____________________");
        //布尔类型量
        boolean flag=false;
        boolean flag2=true;
        System.out.println(flag);
        System.out.println(flag2);

    }
}
