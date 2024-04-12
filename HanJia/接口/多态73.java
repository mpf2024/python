package HanJia.接口;

public class 多态73 {
    /*
       多态的前提和体现
                 1.有继承/实现关系
                 2.有方法重写
                 3.有父类引用指向子类对象
     */
    public static void main(String[] args) {
        //当前事物，是一个员工
        Employee e=new Coder();
        // //当前事物，是一个程序员
        Coder c=new Coder();
    }
}
 class Employee{
    public void work(){
        System.out.println("工作");
    }
 }
 class Coder extends Employee{
    public void work(){
        System.out.println("程序员写代码");
    }
 }