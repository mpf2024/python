package 练习.排序;

import java.util.Random;

public class D {
   public int sj(){
       Random r=new Random();
       int []arr=new int[10];
       for (int i = 0; i < arr.length; i++) {
           int num=r.nextInt(100);
           arr[i]=num;
       }
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" ");
       }

       return 0;
   }
    public  void 空格(){
        System.out.println();
    }
public void dh(int []arr,int i,int j){
    int temp=arr[j];
    arr[j]=arr[j-1];
    arr[j-1]=temp;
}


}
