package HanJia.面向对象的高级;

public class 抽象类69 {
    /*
         抽象类：理解的层面来说，就是把像的部分和相似的部分，抽取到一个父类中（共性行为向上抽取）
                当行为被抽取到父类之后，发现这个行为在父类中描述不清了
                且该行为还是子类必须要做的事，就将其定义为抽象类
                抽象方法要存活在抽象类当中
         简单记：抽象类就是一个特殊的父类，该父类可以定义抽象方法

            抽象方法的定义格式：
                        public abstract 返回值类型方法名（参数列表）;
            抽象类的定义格式：
                        public abstract class类名{};
     */
    /*
        问题1：抽象类是否可以实例化（创建对象）？
              不允许实例化，一旦允许创建对象，就可以调用内部没有方法体的抽象方法
     */
    /* 问题2.抽象类既然不能创建对象，那是否存在构造方法
             有构造方法，作用是交给子类去访问的
   */
    /*
            问题3：抽象类中是否可以没有抽象方法？
                可以没有抽象方法，但有抽象方法的类一定是是抽象类。抽象类中是可以定义普通方法的。
     */
    /*
        问题4：作为抽象类的子类因该注意什么？
               1.必须重写所有抽象方法。
               2.将自己也变成一个抽象类（不推荐，因为变成抽象类后还要再写一个子类）
     */
    public static void main(String[] args) {

    }
}
abstract class Employee1{
    public abstract void work();
}
class Manager1 extends Employee1{
   public void work(){
       System.out.println("管理程序员...");
   }
}
class Coder1 extends Employee1{
    public void work(){
        System.out.println("管理程序员...");
    }
}