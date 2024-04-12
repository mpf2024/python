package HanJia.调用;

import HanJia.调用.成员定义21;

/*
      成员方法的调用格式：
               对象名.方法名;
    */
public class 成员方法的定义和调用22 {
    public static void main(String[] args) {
          成员定义21 stu=new 成员定义21();
        stu.name="小马";
        stu.age=21;
        System.out.println(stu.name+"-----"+stu.age);
         stu.show();
         stu.sleep();
         stu.eat();

    }
}
