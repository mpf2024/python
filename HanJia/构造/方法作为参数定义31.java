package HanJia.构造;

public class 方法作为参数定义31 {
    /*
           功能：
               使用手机的方法，方法内部调用手机对象的相关方法
               1.明确参数
               2.明确返回值
     */
    public void use(方法作为参数的传递定义31 m){
        m.call("张三");
        m.send();
        System.out.println(m.getBrand()+"--"+m.getPrice());
    }
}
