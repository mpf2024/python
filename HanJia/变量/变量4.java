package HanJia.变量;
/*
         变量的定义格式
                      数据类型  变量名=数据值;

                      数据类型：int（整数类型）


 */
public class 变量4 {
    public static void main(String[] args) {
        //定义数据类型，salary的意思薪水
        int  salary=12000;
        //取出
        System.out.println(salary);
        //修改，没有重新定义类型，在已有的定义数据修改。
        salary=13000;
        System.out.println(salary);

        //重新定义类型int类型
        int age=18;
        System.out.println(age);
    }
}
