package HanJia.循环;

public class 三种循环的区别46 {

        public static void main(String[] args){
        /*
        for循环和while循环是先判断再进行循环，do...while循环是先循环再判断
        当判断条件不满足时，for循环和while循环不会输出结果，do...while循环会输出一次结果
        for循环和while循环的区别:
        在于“i”属于循环结构在循环结束时“i"不能继续使用，
        "j"在循环体外在循环结束时“j"仍能继续输出。
         */
            for(int i=1;i<=5;i++){
                System.out.println("老美了");
            }
            System.out.println("-------");
            int j=1;
            while(j<=5){

                System.out.println("老婆");
                j++;
            }
            System.out.println("-------");
            int i=1;
            do {
                System.out.println("老婆最美");
                i++;

            }while(i<10);

        }
    }

