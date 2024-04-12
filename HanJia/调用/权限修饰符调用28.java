package HanJia.调用;

import HanJia.调用.权限修饰符的定义28;

public class 权限修饰符调用28 {
       /*
                权限修饰符：
                         private:只能在本类当中进行访问。权限最小，
                         默认（default）:同一个类中，同一个包下访问（没有修饰符的都是默认）
                         public:同一个类，同一个包，不同包访问。权限最大
        */
       public static void main(String[] args) {
           权限修饰符的定义28 m=new 权限修饰符的定义28();
           m.brand="大米";
           //因调用的方法前有权限（private）进行锁定只能在同一个类中调用。
           // m.log();


       }
}
