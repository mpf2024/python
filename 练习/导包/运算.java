package 练习.导包;
import java.util.Scanner;
import java.math.BigInteger;

public class 运算 {
    /*基本运算:
              add()和  subtract()减 multiply()乘divide()除
              mod()取模
              remainder()求余 pow()平方 abs() 取绝对值 negate()取相反数
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        BigInteger b1=new BigInteger(sc.next());
        System.out.println("请输入第二个数：");
        BigInteger b2=new BigInteger(sc.next());
        System.out.println(b1.add(b2));          //加
        System.out.println(b1.subtract(b2));     //减
        System.out.println(b1.multiply(b2));      //乘
        System.out.println(b1.divide(b2));           //除
        System.out.println(b1.remainder(b2));        //求余
        System.out.println(b1.pow(2));             //平方
        System.out.println(b1.abs());              //取绝对值
        System.out.println(b1.negate());           //取相反数
        System.out.println(b1.mod(b2));            //取模


    }
}
