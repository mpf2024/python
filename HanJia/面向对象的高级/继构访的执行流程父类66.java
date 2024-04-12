package HanJia.面向对象的高级;

public class 继构访的执行流程父类66 {
    private String name;
   private int age;
    public 继构访的执行流程父类66() {
    }

    public 继构访的执行流程父类66(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){
        System.out.println("吃饭");
    }
}
