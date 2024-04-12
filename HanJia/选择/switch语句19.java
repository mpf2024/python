package HanJia.选择;

import java.util.Scanner;
     /*
          switch语句格式：
                 switch(定义式){
                          case 1:
                              语句体1：
                              break;
                          case 2:
                              语句体2：
                              break;
                              ......
                          default:
                               语句体n+1:
                               break;
            执行流程：
                  1.先拿定义式的值，依次跟case后面的值进行匹配，匹配成功
                           就会执行对应的语句，在执行过程中遇到break就会结束。
                  2.如果所有的case值都不匹配，就会执行default里面的语句体，然后程序结束掉。
            建议：
                  如果要进行的判断，是范围性判断，建议使用if语句
                  如果要进行的判断，是固定值的匹配，建议使用switch语句
             注意：
                  1.case后面的值只能是常量，不能是变量。
                  2.case后面的值，不允许重复。

      */
public class switch语句19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字：");
        int week =sc.nextInt();
            switch (week){
                case 1:
                    System.out.println("星期一");
                    break;
                case 2:
                    System.out.println("星期二");
                    break;
                case 3:
                    System.out.println("星期三");
                    break;
                case 4:
                    System.out.println("星期四");
                    break;
                case 5:
                    System.out.println("星期五");
                    break;
                case 6:
                    System.out.println("星期六");
                    break;
                case 7:
                    System.out.println("星期日");
                    break;
                default:
                    System.out.println("数据有误");
                    break;
            }

    }
}
