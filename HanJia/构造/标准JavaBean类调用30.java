package HanJia.构造;

import HanJia.构造.标准JavaBean类定义30;

public class 标准JavaBean类调用30 {
    public static void main(String[] args) {
        标准JavaBean类定义30 m=new 标准JavaBean类定义30("张三",18);
        System.out.println(m.getName()+"--"+m.getAge());
        标准JavaBean类定义30 m2=new 标准JavaBean类定义30();
        m2.setName("李四");
        m2.setAge(19);
        System.out.println(m2.getName()+"--"+m2.getAge());
    }
}
