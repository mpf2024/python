package HanJia.运算;
              /*
              自增自减运算符：
                    ++：变量的值自身加一
                    --：变量的值自身减一
               单独使用：
                    符号在前在后，没有区别。
                参与运算使用：
                         ++在前：变量先完成自增长，然后再参与运算
                         ++在后：会将该变量原本记录的值。提出来参与运算，然后变量再参与自增长。

                 注意事项：自增自减运算符只能操作变量，不能参与常量



               */
public class 自增自减11 {
    public static void main(String[] args) {
                  int num=10;
                  num++;    //num=num+1;
        System.out.println(num);
        System.out.println("_____________");
        int a=10;
        int b=++a;   //a=11,b=11
        System.out.println(a);
        System.out.println(b);
        System.out.println("_____________");
        int c=10;
        int d=c++;      //d=10 ,c=11
        System.out.println(c);
        System.out.println(d);
                  }
}
