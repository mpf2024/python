package HanJia.接口;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class 类和接口之间的关系72 {
     /*
            类和接口：
                 实现关系，可以单实现，也可以多实现，
                 并且可以在继承一个类的同时，实现多个接口。
            类与类的关系：
                只能单继承，但可以多层继承
            接口与接口：
                  继承关系，可以单继承，也可以多继承
      */
     public static void main(String[] args) {
             Zi m=new Zi();
             m.method1();
             m.method2();
             m.method();
     }
}
class Fu{
    public void method(){
        System.out.println("我是Fu类的method方法");
    }
}
interface InterA{
    void method1();
}
interface InterB{
    void method2();
}
interface InterC{
    void method();
}
class Zi extends Fu implements InterA,InterB,InterC{

    @Override
    public void method1() {
        System.out.println("Zi类重写后的method1方法");
    }

    @Override
    public void method2() {
        System.out.println("Zi类重写后的method2方法");
    }
}