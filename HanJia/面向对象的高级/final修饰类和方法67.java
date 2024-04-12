package HanJia.面向对象的高级;

public class final修饰类和方法67 {
    /*
         修饰方法：表明该方法是最终方法，不能重写
         修饰类：表明该类是最终类，不能被继承
     */
    public static void main(String[] args) {

    }
}
// 修饰类：表明该类是最终类，不能被继承
final class Fu{
//    修饰方法：表明该方法是最终方法，不能重写
    public final void method(){
        System.out.println("非常核心的方法...");
    }
}
class zi{
//    @Override
//    public void method() {
//        System.out.println("hhh,核心的方法被干掉了...");
//    }
}