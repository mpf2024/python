package HanJia.导包;

import java.util.Random;

public class Random33 {
    public static void main(String[] args) {
          //根据Random类的构建方法创建对象
        Random m=new Random();
        int count=1;
        for(int i=1;i<=10;i++){
            //对象名调用方法
            int num=m.nextInt(100);
            System.out.println("第"+count+"个:"+num);
            count++;
        }


    }
}
