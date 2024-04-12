package HanJia.面向对象的高级;

public class 继承中构造方法的访问特点定义65 {
    private String name;
    private int age;
     /*
         问题4：父类的构造方法中，也默认隐藏着super();吗？
                 —— 是的，在Java中所有的类都默认继承一个叫做Object的类
         注意：如果我们编写的类，没有手动指定父类，系统也会自动继承Object（JAVA继承体系中的最顶层父亲 ）
      */

    public 继承中构造方法的访问特点定义65() {
        System.out.println("父亲[空空空空空空]参数构造方法执行了");
    }

    public 继承中构造方法的访问特点定义65(String name, int age) {
        System.out.println("父亲---[带带带]---参数构造方法执行了");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
