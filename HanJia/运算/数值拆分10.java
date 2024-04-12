package HanJia.运算;

import java.util.Scanner;

/*
           需求：键盘输入一个三位数将其拆分为个位，十位，百位后打印在控制台

              拆分：
                  1. 使用Scanner键盘录入一个三位数
                  2.个位的计算：数值%10
                  3.十位的计算：数值/10%10
                  4.百位的计算：数值/10/10%10
            */
public class 数值拆分10 {
               public static void main(String[] args) {
                   Scanner sc=new Scanner(System.in);

                       System.out.println("请输入一个三位数：");
                       int num=sc.nextInt();
                       int ge=num%10;
                       int shi=num/10%10;
                       int bai=num/10/10%10;
                       System.out.println("个位:"+ge);
                       System.out.println("十位:"+shi);
                       System.out.println("百位:"+bai);


               }
}
