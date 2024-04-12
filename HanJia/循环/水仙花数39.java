package HanJia.循环;

public class 水仙花数39 {
    /*
    需求:在控制台输出所有的“水仙花数”
       水仙花数是一个三位数
       水仙花数的个位、十位、百位的数字立方和等于原数
    分析:
       1.通过循环获取所有的三位数100-999
       2．将每一个三位数拆分为个位，十位，百位
       3．加入if判断条件，计算是否是水仙花数，是的话输出打印．
     */
    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/10/10%10;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                System.out.println(i);
            }
        }
    }
}
