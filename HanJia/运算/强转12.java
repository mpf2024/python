package HanJia.运算;

/*
       强制转换：
             把一个取值范围大的数值或变量，赋值给一个取值范围小的变量
             不允许直接赋值，需要加入强制转换
          格式： 目标数据类型 变量名=(目标数据类型）被强转的数据
          注意事项：强转可能出现精度损失。
 */
public class 强转12 {
    public static void main(String[] args) {
        double a = 12.3;
        int b = (int) a;
        System.out.println(b);
        System.out.println("________");

           long c=123L;
           int d=(int)c;
        System.out.println(d);
        System.out.println("________");
        int num=130;
        //byte取值-128到127
        byte num2=(byte)num;
        System.out.println(num2);
    }
}
