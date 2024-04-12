package HanJia.数组;

public class 二维数组的遍历58 {
      /*
             需求：
                 已知一个二维数组arr={{11,22,33},{44,55,66}},遍历该数组，取出所有数组元素并打印
              步骤：
                  1.遍历二维数组，取出里面每一个一维数组
                  2.在遍历的过程中，对每一个一维数组继续完成遍历，获取内部储存的每一个元素
       */
      public static void main(String[] args) {
          int [][]arr={{11,22,33},{44,55,66}};
          for (int i = 0; i < arr.length; i++) {
              for (int x = 0; x < arr[i].length; x++) {
                  System.out.println(arr[i][x]);

              }
          }
      }
}
