package HanJia.运算;
       /*
            三元运算格式：
                  关系表达式？值1：值2
                  判断条件？值1：值2
              执行流程：
                   首先计算关系表达式的值
                   如果值为true，取值1
                   如果值为false，取值2
                需求：求两个整数的最大值

        */
public class 三元运算符15 {
           public static void main(String[] args) {
               int a=18;
               int b=20;
               int max=a>b?a:b;
               System.out.println(max);
           }
}
