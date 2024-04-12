package HanJia.调用;

public class this关键字定义26 {
    String name;
    int age;
    public void say(String name){
        //就近原则
        System.out.println("局部变量"+name);
        System.out.println("成员变量"+this.name);

    }
    public void met(){
        System.out.println("met方法中的this"+this);
    }
}
