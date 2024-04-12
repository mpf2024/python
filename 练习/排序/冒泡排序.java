package 练习.排序;

import java.util.Random;
import java.util.Scanner;

public class 冒泡排序 {
    public static void main(String[] args) {
        //导包
        Random R=new Random();
        //定义动态初始化数组
        int[]arr=new int[10];
        //循环生成随机数据
        for(int x=0;x<arr.length-1;x++){
            //接收数据
            int num=R.nextInt(100)+1;
            //将数据存入数组
            arr[x] =num;
        }
        //查看生成数据信息
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //排序原理：数组元素两两比较，交换位置，大元素往后放，那么经过一轮比较后，最大的元素，就会出现在最大索引处
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    //交换位置
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }



    }
}