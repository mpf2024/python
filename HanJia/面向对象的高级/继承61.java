package HanJia.面向对象的高级;

public class 继承61 {
    /*
         继承： 类与类产生关系（子父类关系），子类就可以直接使用父类中非私有的成员。
            支持单继承，不支持多继承，但支持多层继承（一个儿子只能有一一个爹，不能有多个，但可以有子继父，父继爷）
     */
    public static void main(String[] args) {
        Coder c = new Coder();
        c.name = "张三";
        System.out.println(c.name);
    }
}
      /*
          一个Java文件中
                   可以编写多个class，但只能有一个被public修饰
       */
     class Employee{
         String name;
         int age;
         double salary;
      }
      class Coder extends Employee{

      }
    class Manager extends Employee{

    }

