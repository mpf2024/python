package HanJia.构造;

public class 构造方法的格式和时机29 {
    /*
         构造方法的格式：
                      1.方法名与类名相同，大小写也要一致。
                      2.没有返回值类型连void都没有
                      3.没有具体的返回值（不能return带会结果数据）
         构造方法注意事项:
                      1.如果一个类中没有编写构造方法
                                系统将会提供一个默认的，无参数的构造方法
                                但是，如果手动编写的构造方法，系统将不会再提供那个默认的无参构造了
                      2.构造方法也是方法，允许重载
                                 推荐今后编写的类，无参构造和有参构造都手动给出。
     */
    String name;
    int age;
    public 构造方法的格式和时机29(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("构造方法");
    }
    public void show(){
        System.out.println(name+"---"+age);
    }
                       /*
                            构造方法的执行时机：
                                         在创建对象的时候，由系统自动调用执行
                                         每创建一次对象，就会执行一次构造方法
                        */
    public static void main(String[] args) {
            构造方法的格式和时机29 m=new 构造方法的格式和时机29("张三",18);
         m.show();
    }
}
