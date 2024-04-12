package HanJia.循环;

public class 偶数的和38 {
      /*
      需求：将1到100的偶数和打印在控制台
       分析：
           1.需求是要求和，定义求和变量
           2．在循环中获取1到100的每一个数值
           3.循环过程中 ，对每一个数值进行if判断，判断是否为偶数。
           4.是偶数的话，跟求和变量累加
           5.循环结束后打印最终结果
       */
      public static void main(String[] args) {
             int sum=0;
             for(int i=1;i<=100;i++){
                 if(i%2==0){   //if（i%==1）奇数和
                     sum+=i;
                 }
             }
          System.out.println("1~100之间的偶数和："+sum);
      }
}
