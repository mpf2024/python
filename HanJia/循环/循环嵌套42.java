package HanJia.循环;

import java.util.Random;

public class 循环嵌套42 {
    /*
          外循环一次，内循环一圈
     */
    public static void main(String[] args) {
        Random a=new Random();
        for(int i=1;i<=9;i++){
            int num=a.nextInt(9);
            for(int x=1;x<=9;x++){
                int num2=a.nextInt(9);
                System.out.println("m:"+num+num2+" ");

            }

        }
        for(int i=1;i<=5;i++){
             for(int x=1;x<=10;x++){
                 System.out.print("*");
             }
            System.out.println();
        }
    }
}
