package HanJia.数组;

public class 数组求最大值55 {
    /*
        需求：已知数组元素为{5,44,33,55,22}
             请找出数组最大数打印在控制台
         分析：
                1.定义max变量
                2.遍历数组获取每一个元素
                3.让每一个元素跟max比较，如果找到更大值，就让max记录该元素
                4.打印max所记录的值
     */
    public static void main(String[] args) {
        int[]arr={5,44,33,55,22};
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {

            if(arr[i]>max){
                max=arr[i];
            }


        }
        System.out.println(max);
    }
}
