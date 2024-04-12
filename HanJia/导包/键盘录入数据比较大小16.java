package HanJia.导包;

import java.util.Scanner;

/*
    需求：
        键盘录入三个数 ，找出最大值打印在控制台
     分析：
         1.使用Scanner键盘录入三个整数
         2.用三元运算符获取前两个数值的最大值，并用临时变量保存起来
         3.用三元运算符让临时变量和第三个数据进行比较，并记录结果
         4.输出结果
     */
public class 键盘录入数据比较大小16 {
        public static void main(String[] args) {
           Scanner  sc=new Scanner(System.in);
            System.out.println("请输入三个整数：");
            //1.使用Scanner键盘录入三个整数
           int num=sc.nextInt();
           int num2=sc.nextInt();
           int num3=sc.nextInt();
           // 2.用三元运算符获取前两个数值的最大值，并用临时变量保存起来
           int temp=num>num2?num:num2;
           // 3.用三元运算符让临时变量和第三个数据进行比较，并记录结果
           int max=temp>num3?temp:num3;
           //输出结果
            System.out.println("最大值是："+max);
        }
}
