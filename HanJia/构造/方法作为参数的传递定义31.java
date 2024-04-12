package HanJia.构造;

public class 方法作为参数的传递定义31 {
    private String brand;
    private int price;

    public 方法作为参数的传递定义31() {

    }

    public 方法作为参数的传递定义31(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void call(String name){
        System.out.println("给"+name+"打电话");
    }
    public void send(){
        System.out.println("发短信");
    }
}
