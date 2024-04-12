package HanJia.调用;

public class 权限修饰符的定义28 {
    String brand;
    int price;
    public  void call(String name){
        System.out.println("给"+name+"打电话");
           log();
    }
   private   void log(){
        System.out.println("通话记录");
        System.out.println("将联系人-时间-通话时长保存到本地");

    }
}
