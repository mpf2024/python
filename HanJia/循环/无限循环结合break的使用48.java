package HanJia.循环;

import java.util.Scanner;

public class 无限循环结合break的使用48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个1~100之间的数：");
            int num = sc.nextInt();
            if (num >= 0 && num <= 100) {
                System.out.println("您输入的数据为：" + num);
                break;
            } else {
                System.out.println("您输入的信息有误");
            }
        }
    }
}
