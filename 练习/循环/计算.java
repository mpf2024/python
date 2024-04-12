package 练习.循环;

import java.util.Random;

public class 计算 {
    /*
       需求：
            随机生成10个0~100之间的数存入数组
             1.求所有数的和
             2.求平均数
             3.求有多少数小于平均数
     */
    public static void main(String[] args) {
        //导包产生随机数
        Random R =new Random();
//   定义数组，接收十个动态初始化数据
        int []arr=new int[10];
        //利用循环，生成十个随机数
        for (int i = 0; i < arr.length; i++) {
            //接受生成的随机数
            int num=R.nextInt(100)+1;
            //将随机数存入数组
            arr[i]=num;
        }
        //循环输出生成的十个随机数
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            if(arr[i]==arr[arr.length-1]){
                System.out.println();
            }
        }
        //定义sum接收数据和
        int sum=0;
        //利用循环累加求和
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double agv=(double) sum/arr.length;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=(double) sum/arr.length){
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("和为："+sum);
        System.out.println("平均数为："+agv);
        System.out.println("小于平均数的共有："+count);
    }
}
