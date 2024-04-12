package HanJia.接口;

public class 多态访问的特点74 {
    /*
            多态中的成员访问特点：
                   成员变量：编译看左边（父类），运行看左边（父类）
                   成员方法：编译看左边（父类），运行看右边（子类）
     */
    public static void main(String[] args) {
          Fu1 f= new Zi1();
        System.out.println(f.num);
        f.show();
    }
}
class Fu1{
    int num=10;
    public void show(){
        System.out.println("Fu...show");
    }
}
class Zi1 extends Fu1{
    int num=20;
    public void show(){
        System.out.println("Zi...show");
    }
}