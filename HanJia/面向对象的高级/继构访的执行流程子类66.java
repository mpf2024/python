package HanJia.面向对象的高级;

public class 继构访的执行流程子类66  extends 继构访的执行流程父类66{
    private int score;

    public 继构访的执行流程子类66() {

    }

    public 继构访的执行流程子类66(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }
    /*
           this：代表本类对象的引用
           super：代表父类存储空间的标识（可以理解为父类对象的引用）
               关键字          访问成员变量              访问成员方法               访问构造方法
               this           this.成员变量             this.成员方法(...)         this(...)
                              访问本类成员变量           访问本类成员方法            访问本类构造方法
               super          super.成员变量            super.成员方法(...)         super(...)
                              访问父类成员变量           访问父类成员方法            访问父类构造方法

               子类中调用父类的成员方法，如果子类没有对父类方法进行重写
               super关键字可以省略不写
     */

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
