package HanJia.循环;

public class for36 {
      /*
          for循环格式：
                  for(初始化语句;条件判断语句;条件控制语句){
                      循环体语句;
                  }
             需求：在控制台输出1-5和5-1。
             分析：
                 1.从1开始到5结束，设置初始化从1开始
                 2.设置判断条件没有到5 的时候继续执行执行到超过5程序结束
                 3.从1到5，每次增加1，设置条件控制语句每次加1
                 4.将反复进行的事情写入循环结构内部，打印对应数据
       */
      public static void main(String[] args) {
              for (int i=1;i<=5;i++){
                  System.out.println(i);
              }
          System.out.println("----------");
          for (int i=5;i>=1;i--){
              System.out.println(i);

          }
      }
}
