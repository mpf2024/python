package HanJia.调用;

public class 方法相互调用的定义27 {
      String name;
      int age;
      public void study(){
          System.out.println("学习Java");
      }
      public void sleep(){
          System.out.println("睡觉");
      }
      public void eat(){
          System.out.println("吃饭");
      }
      public void show(){
          sleep();
          study();
          eat();
      }
}
