package HanJia.运算;

import com.sun.java.swing.plaf.windows.WindowsTabbedPaneUI;

/*
    基本赋值运算：
                 =:将符号右侧的数据赋值给左边
     扩展赋值运算符：
                 += ：将符号左右两边的数据 做加法运算，再将结果赋值给左边
                 -= ：将符号左右两边的数据 做减法运算，再将结果赋值给左边
                 *= ：
                 /= :
                 %= :
             注意：扩展运算符自带强转效果

     */
public class 赋值运算符13 {
        public static void main(String[] args) {
            int num =10;
            num+=20;  //num=num=20
            int num2=10;
            num2-=30;   //num2=num2-30
            System.out.println(num);
            System.out.println(num2);

            int a=10;
            byte b=10;
            b=(byte)(a+b);
            int c=10;
            int d=10;
            d+=c;
            System.out.println(b);
            System.out.println(d);

        }
}
