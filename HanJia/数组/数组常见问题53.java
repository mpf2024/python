package HanJia.数组;

public class 数组常见问题53 {
      /*
         数组索引越界问题：
             ArrayIndexOutOfBoundsException
             当访问了不存在的索引，就会引发此异常
       */
      public static void main(String[] args) {
          int []arr={11,22,33};
          System.out.println(arr[0]);
          System.out.println(arr[1]);
          System.out.println(arr[2]);

          /*
                   空指针异常：NullPointerException
           */
          int [] arr1=new int[2];
          arr1=null;
          System.out.println(arr1[0]);
      }
}
