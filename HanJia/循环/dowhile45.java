package HanJia.循环;

public class dowhile45 {
      /*
           do...while格式：
                   初始化语句;
                do{
                         循环体语句;
                       条件控制语句;
                  }while（条件判断语句）

         特点：无论判断条件是否满足都会执行一次循环体
       */
    public static void main(String[] args) {
            int i=0;
          do {
              System.out.println("中");
              i++;
          }while(i<5);

    }
}
