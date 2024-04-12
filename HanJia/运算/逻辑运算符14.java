package HanJia.运算;
     /*
              逻辑运算符分类：
                        &(与) ：并且，遇false则false，只有结果两边同时为true的时候才为true
                        |（或）：或者，遇true则true，只有结果两边同时为false的时候才为false
                        ！（非）：取反
                        ^(异或): 相同false，不同为true
               注意：
                      &&（短路与）：左边为true，右边执行。如果左边为false，右边不执行。
                      ||（短路或）：左边为false，右边执行。如果左边为true。右边不执行。
      */
public class 逻辑运算符14 {
         public static void main(String[] args) {
             //&(与) ：并且
             System.out.println(true&true);     //true
             System.out.println(false&false);    //false
             System.out.println(false&true);     //false
             System.out.println(true&false);     //false
             System.out.println("_________");
             //|（或）：或者
             System.out.println(true|true);     //true
             System.out.println(false|false);    //false
             System.out.println(false|true);     //true
             System.out.println(true|false);     //true
             System.out.println("_________");
             //！（非）：取反
             System.out.println(!true);    //false
             System.out.println(!!true);     //true
             System.out.println("_________");
             // ^(异或):
             System.out.println(true^true);    //false
             System.out.println(false^false);    //false
             System.out.println(false^true);     //true
             System.out.println(true^false);     //true
         }
}
