package HanJia.数组;

public class 数组反转56<start, end> {
       /*
           数组反转：

              步骤：
                  1.定义两个变量，start和end来表示开始和结束的时针
                  2.确定交换条件，start<end允许交换
                  3.循环中编写交换逻辑代码
                  4.每一次完成交换，改变两指针所指向的索引，start++,end--
                  5.循环结束后，遍历数组并打印，查看反转后的数组
        */
    public static void main(String[] args) {
        int []arr={11,22,33,44,55};

        //交换代码
        int temp=arr[0];
                arr[0]=arr[4];
                arr[4]=temp;
        int temp2=arr[1];
                arr[1]=arr[3];
                arr[3]=temp2;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        int []arr1={11,22,33,44,55};
        for(  int start=0, end=arr.length-1;start<end;start++,end--){
                    int temp3=arr1[start];
                    arr1[start]=arr1[end];
                    arr1[end]=temp3;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]);
        }
    }

}
