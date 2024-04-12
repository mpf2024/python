package HanJia.数组;

public class 数组的动态初始化52 {
    /*

            数组的动态初始化：
                       初始化时只指数组长度，由系统为数据分配初始化值
             使用场景：
                 动态初始化：只明确元素个数，不明确具体数值，推荐使用动态初始化
                 静态初始化：需求中已经明确了要操作的数据，直接静态初始化即可
                   整数：0
                   小数：0.0
                   字符：‘\u0000’空白字符
                   布尔：false
                   引用数据类型：null
               格式：
                  数据类型[]数组名=new 数据类型[数组的长度]
     */
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //赋值
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
