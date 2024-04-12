package HanJia.选择;

import java.util.Scanner;

/*
     if语句格式3：
                      if（判断条件1）{
                           语句体1；
                      }else if（判断条件2）{
                          语句体2；
                      }else if(判断条件3){
                            语句体3
                      }.....
                         else{
                         语句体n+1;
                         }
             执行流程：
                        首先计算判断条件1的值；
                        如果关系表达式的值为true就执行语句体1；如果值为false就执行判断条件2
                        如果关系表达式的值为true就执行语句体2；如果关系表达式的值为false就执行语句体3；
                        .......
                        如果没有任何判断条件为true ，就执行语句体n+1;
      */
public class if语句3考试奖励18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入考试成绩：");
        int score = sc.nextInt();
        if (score >= 0 && score <= 100) {
            if (score >= 95 & score <= 100) {
                System.out.println("山地自行车");
            } else if (score >= 90 & score <= 94) {
                System.out.println("游乐园玩一次");
            } else if (score >= 80 & score <= 89) {
                System.out.println("变形金刚一个");
            } else {
                System.out.println("胖揍");
            }

        } else {
            System.out.println("你输入的信息有误");
        }

    }
}


