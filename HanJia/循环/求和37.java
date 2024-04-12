package HanJia.循环;

public class 求和37 {
    /*
   需求：将1到5的和打印在控制台
       分析：
           1.求和的最终结果必须保存起来，需要定义一个变量，用于保存求和的结果，初始值为0
           2．在循环中初始化一个变量从1开始，不断++，增长到5
           3.循环的过程中，将能够代表(1-5)的i变量和sum进行累加
           4.当循环执行完毕时，将最终数据打印出来
      积累思路:
                如果在今后的需求中，看到了xxXX求和的字样，就要联想到求和变量
                  int sum = 0;
     */
    public static void main(String[] args) {
             int sum=0;
             for(int i=1;i<=5;i++){
                 sum+=i;
             }
        System.out.println("1~5的和："+sum);
    }
}
