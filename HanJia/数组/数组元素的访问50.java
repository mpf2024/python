package HanJia.数组;

public class 数组元素的访问50 {
    /*
         数组的元素访问格式：
                       数组名[]索引
     */
    public static void main(String[] args) {
        int[]arr={11,22,33,44,55};
        System.out.println(arr[3]);
        //修改arr[0]的数值为66 ，并打印在控制台
        arr[0]=66;
        System.out.println(arr[0]);
    }
}
