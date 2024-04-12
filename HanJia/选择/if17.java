package HanJia.选择;
    /*
           if语句格式1：
                   if（ 关系表达式）{
                       语句体;
                       }
               执行流程：
                        首先计算关系表达式的值；
                        如果关系表达式的值为true就执行语句体；
                        如果关系表达式的值为false就不执行语句体；
                        继续执行后面的语句
            if语句格式2：
                      if（关系表达式）{
                           语句体1；
                      }else{
                          语句体2；
                      }
             执行流程：
                        首先计算关系表达式的值；
                        如果关系表达式的值为true就执行语句体1；
                        如果关系表达式的值为false就执行语句体2；
                        继续执行后面的语句

                注意事项：
                     1.if语句中，如果大括号控制的是一条语句，大括号可以省略不写
                     2.if语句中，（）和{}之间不要写分号

     */
public class if17 {
        public static void main(String[] args) {
            System.out.println("开始");
            int age=18;
            if (age>=18) {
                System.out.println("可以上网吧   ");
            }

            System.out.println("结束");
            System.out.println("________");
            System.out.println("开始执行第二次判断");
            int num =17;
            if (num>=18) {
                System.out.println("可以上网吧");
            }else{
                System.out.println("再等等");
            }

            System.out.println("结束");
        }
}
