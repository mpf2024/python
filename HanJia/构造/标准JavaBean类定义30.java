package HanJia.构造;

public class 标准JavaBean类定义30 {
    private String name;
    private int age;

    public 标准JavaBean类定义30() {

    }

    public 标准JavaBean类定义30(String name, int age) {
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
}
