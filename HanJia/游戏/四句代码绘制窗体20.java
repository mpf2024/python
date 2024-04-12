package HanJia.游戏;

import javax.swing.*;

public class 四句代码绘制窗体20 {
    public static void main(String[] args) {
        //绘制窗体对象
        JFrame frame=new JFrame();
        //调用成员方法，设置宽和高
        frame.setSize(1200,800);
        //调用成员方法，设置窗体居中
        frame.setLocationRelativeTo(null);
        //调用成员方法，设置窗体置顶
        frame.setAlwaysOnTop(true);
        //调用成员方法，设置关闭模式;
        frame.setDefaultCloseOperation(3);
        //调用成员方法，设置窗口标题
        frame.setTitle("2048小游戏");
        //调用成员方法，设置窗体可见
        frame.setVisible(true);
    }
}
