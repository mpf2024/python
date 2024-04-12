package HanJia.数组;

public class 数组求和54 {
    /*
        需求：已知数组元素为{11，22，33，44，55}
            请将数组中偶数元素取出来并求和打印，最后打印求和结果
         分析：
             1.静态初始化数组
             2.定义求和变量
             3.遍历数组取出每一个元素
             4.判断当前元素是否为偶数，是的话求和变量做累加操作
             5.打印求和变量
     */
    public static void main(String[] args) {
          int[] arr={11,22,33,44,55};
           int sum=0;
           for(int i=0;i<arr.length;i++){
               if(arr[i]%2==0){            //arr[i]%2==1奇数
                   sum+=arr[i];
               }
           }
        System.out.println(sum);
    }
}
