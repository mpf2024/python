package HanJia.导包;

import java.util.Scanner;

public class 导包8 {
    /*
          Scanner的键盘录入
                        1.寻找Scanner符咒
                        2.召唤Scanner精灵
                        3.指挥Scanner干活
     */
    public static void main(String[] args) {
        //召唤Scanner精灵，起名叫sc，创建对象

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int age = sc.nextInt();                //接收数据
        System.out.println(age);

        System.out.println("请输入一个字符串：");
        String name=sc.next();                    //接收数据
        System.out.println(name);

    }
}
