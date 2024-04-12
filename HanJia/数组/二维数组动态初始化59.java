package HanJia.数组;

public class 二维数组动态初始化59 {
      /*
            二维数组动态初始化格式：
                          数组类型[][]数组名=new 数组类型[m][n]
                          m表示这个二维数组，可以存放多少个一维数组
                          n表示每一个一维数组，可以存放多少个元素
       */
      public static void main(String[] args) {
          int[][]arr=new int[2][3];
          for (int i = 0; i < arr.length; i++) {
              for (int j = 0; j < arr[i].length; j++) {
                  System.out.println(arr[i][j]);
              }
          }
          System.out.println("---------");
          arr[0][0]=11;
          arr[0][1]=22;
          arr[0][2]=33;
          arr[1][0]=44;
          arr[1][1]=55;
          arr[1][2]=66;
          for (int i = 0; i < arr.length; i++) {
              for (int j = 0; j < arr[i].length; j++) {
                  System.out.println(arr[i][j]);
              }
          }
          System.out.println("---------");
          int []arr1={11,22,33};
          int []arr2={44,55,66};
          arr[0]=arr1;
          arr[1]=arr2;
          for (int i = 0; i < arr.length; i++) {
              for (int j = 0; j < arr[i].length; j++) {
                  System.out.println(arr[i][j]);
              }
          }

      }
}
