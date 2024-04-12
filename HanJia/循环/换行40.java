package HanJia.循环;

public class 换行40 {
    public static void main(String[] args) {
        //定义变量count，用于保存“打印过”的数量，初始值为0
        int count=0;
        for(int i=1;i<=100;i++){
            System.out.print(i+" ");
            count++;
            //在每一次count变量+1后，判断是否到达了需要换行的倍数 是的话就换行
            if(count%10==0){
                //println()表示换行，不带ln表示不换行
                System.out.println( );
            }
        }
    }
}
