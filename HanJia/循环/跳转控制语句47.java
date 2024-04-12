package HanJia.循环;

public class 跳转控制语句47 {
    public static void main(String[] args) {
            /*
            break:用于结束循环和switch
            注意：只能在循环和switch中使用，通常会配合判断条件使用
            需求：在十点的时候结束学习
             */
            for(int i=7;i<=12;i++){
                if(i==10){
                    break;
                }
                System.out.println(i+"点正在学习");
            }
            /*
                  continue:跳过某次循环，继续下次循环。
                注意：只能在循环当中进行使用，通常会配合判断条件进行使用

                需求：遇到3 17 19 号同学跳过
             */
             for(int x=1;x<=80;x++){
                 if(x==3||x==17||x==19){
                     continue;
                 }

                 System.out.println("老师正在给"+x+"号同学发冰棍");
             }
             /*
                  break和continue都只能操作自己所在的那一层循环
                      如果想要操作指定的一层，可以使用标点。
              */
            asd:for(int i=1;i<=5;i++){
                   for(int x=1;x<=4;x++){
                       if(x==2){
                           break asd;
                       }
                       System.out.println("i的值为："+i+",x的值为："+x);
                   }
             }
    }
}
