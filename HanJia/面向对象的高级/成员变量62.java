package HanJia.面向对象的高级;

public class 成员变量62 {
    public static void main(String[] args) {
        Zi z=new Zi();
        System.out.println(z.num);   //子类和父类出现重名的成员变量，根据就近原则，优先使用子类成员变量
        z.method();

    }
}

class fu {
    int num = 10;
}

class Zi extends fu {
    int num = 20;  //成员变量
    public void method(){
        int num=30;   //局部变量
        System.out.println(num);
        System.out.println(this.num);        //局部变量和成员变量重复，利用this调用成员变量
        System.out.println(super.num);       //利用super访问父类成员变量
    }
}
