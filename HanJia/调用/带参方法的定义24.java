package HanJia.调用;

public class 带参方法的定义24 {
      String brand;
      int price;
         /*
            带参数方法的定义格式；
                   public void 方法名（数据类型 变量名）{
                   }
          */
    public void call(String name){
        System.out.println("给"+name+"打电话" );

    }

         /*
            需求：
                提供一个方法，计算两个整数相加的和
          */
    public int add(int a,int b){
           int c=a+b;
           return  c;
    }
}
