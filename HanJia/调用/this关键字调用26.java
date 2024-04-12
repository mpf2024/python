package HanJia.调用;

import HanJia.调用.this关键字定义26;

public class this关键字调用26 {
       /*
            this：代表当前类对象的引进（地址）
                  哪一个对象调用的this，this就代表哪一个对象
        */
    public static void main(String[] args) {
        this关键字定义26 nu1=new this关键字定义26();
        System.out.println(nu1);
        nu1.met();

        this关键字定义26 nu2=new this关键字定义26();
        System.out.println(nu2);
        nu2.met();
        this关键字定义26 nu3=new this关键字定义26();
        nu3.name="张三";
        nu3.age=18;
        nu3.say("李四");

    }
}
