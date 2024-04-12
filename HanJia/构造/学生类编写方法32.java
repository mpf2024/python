package HanJia.构造;

import java.util.Scanner;

public class 学生类编写方法32 {
     /*
           功能：
               键盘录入学生信息（姓名，年龄）
            封装为学生对像，并返回

                1.参数
                2.返回值   学生类定义32
      */
      public  学生类定义32 getstu(){
          Scanner m=new Scanner(System.in);
          System.out.println("请输入学生姓名：");
          String name=m.next();
          System.out.println("请输入学生年龄：");
          int age=m.nextInt();
          //将信息封装为学生对象
          学生类定义32 M=new 学生类定义32(name,age);
          return M;

      }

}
