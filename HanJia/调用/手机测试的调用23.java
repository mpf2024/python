package HanJia.调用;

import HanJia.调用.手机测试的定义23;

public class 手机测试的调用23 {
    public static void main(String[] args) {
        手机测试的定义23 p=new 手机测试的定义23();
        p.brand="大米";
        p.price=1999;
        System.out.println(p.brand+"----"+p.price);
        p.call("张三");
        p.call("李四");
        p.call("王五");

        p.sendMessage();
    }



}
