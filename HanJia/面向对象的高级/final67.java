package HanJia.面向对象的高级;

public class final67 {
    /*
        final关键字是最终的意思，可以修饰（方法，变量，类）
         被final修饰的变量就变成了常量（自定义常量），只能赋值一次，不可修改

           基本数据类型变量   其值不可以更改
           引用数据类型变量   地址值不可更改，但是可以通过SetXxx方法修改内部的属性值
     */
    public static void main(String[] args) {
           //常量命名规范：如果是一个单词，所有字母大写。如果是多个单词，所有字母大写，但中间需要使用_进行分割
        final int A=10;
        final int MAX=20;
        final int MAX_VALUE=10;

      final   Student m=new Student();
        m.setName("张三");
    }
}
class Student{
    /*
        final 修饰成员变量，初始化时机
              1.在创建的时候，直接给值
              2.在构造方法结束之前，完成赋值
     */
    final int num=10;
    final int num1;
    private String name;

    public Student() {
        num1=20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}