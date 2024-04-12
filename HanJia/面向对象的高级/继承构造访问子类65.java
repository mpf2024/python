package HanJia.面向对象的高级;

public class 继承构造访问子类65 extends 继承中构造方法的访问特点定义65 {
          /*
                 问题1：子类是否可以继承父类的方法？？
                    -不可以，因为构造要求方法名和类名相同。
                    子类和父类的类名不可能一致，所以构造方法不能被继承
           */
    private int score;

    public 继承构造访问子类65() {
        super();    //默认加在第一行，访问父类空参构造方法
        System.out.println("我是子类空参构造方法");
    }

    public 继承构造访问子类65(int score) {
        super();    //默认加在第一行
        System.out.println("我是子类有参构造方法");
        this.score = score;
    }
    /*
        问题3：子类是如何调用到父类构造方法的呢？
                    —— 在所有构造方法中，都默认隐藏着一句话
                    super（）;
     */

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
