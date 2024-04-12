package 练习.循环;

public class 素数的求法 {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for(int i=2;i<=100;i++){
            int j=2;
            while (i%j!=0){
                j++;
            }
            if(i==j){
                sum+=i;
                count++;
            }
        }
        System.out.println("素数的个数是："+count);
        System.out.println("素数的合是："+sum);

    }
}
