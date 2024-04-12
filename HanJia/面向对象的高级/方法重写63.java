package HanJia.面向对象的高级;

public class 方法重写63 {
       /*
              1.定义手机类IPearV1
                Call(String name):打电话的方式
                smallBlack:语音助手（speak english...）
              2. 定义手机类IPearV2
                Call(String name):打电话的方式
                smallBlack:语音助手（speak english... 说中文）
            方法重写应用场景：
                        当子类需要父类功能，而功能主体子类有自己特有的内容
                        可以重写父类中的方法，这样，即沿袭了父类功能，有定义了子类特有的内容
            注意事项：
                   子类的访问权限必须大于或等于父类，最好保持一致。不然会出现无法访问的情况
        */
       public static void main(String[] args) {
              IPearV2 v=new IPearV2();
              v.smallBlack();
       }
}
class IPearV1{
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }
    public void smallBlack(){
        System.out.println("speak english...");
    }
}
class IPearV2 extends IPearV1{
    public void smallBlack(){
        super.smallBlack();
        System.out.println("说中文");
    }
}