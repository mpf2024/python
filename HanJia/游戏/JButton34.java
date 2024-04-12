package HanJia.游戏;

import javax.swing.*;

public class JButton34 {
    public static void main(String[] args) {
        //绘制窗体对象
        JFrame frame=new JFrame();
        //调用成员方法，设置宽和高
        frame.setSize(600,500);
        //调用成员方法，设置窗体居中
        frame.setLocationRelativeTo(null);
        //调用成员方法，设置窗体置顶
        frame.setAlwaysOnTop(true);
        //调用成员方法，设置关闭模式;
        frame.setDefaultCloseOperation(3);
      //通过窗体对象，取消默认布局
        frame.setLayout(null);
        //创建窗体对象
        JButton btn =new JButton();
        btn.setBounds(50,50,100,100);
        JButton btn2 =new JButton("点我啊~");
        btn2.setBounds(150,150,200,200);
       // 通过窗体对象，获取面板对象并调用add方法添加按钮组件
        frame.getContentPane().add(btn);
        frame.getContentPane().add(btn2);
      //调用成员方法，设置窗口标题
        frame.setTitle("2048小游戏");
        //调用成员方法，设置窗体可见
        frame.setVisible(true);
    }
}
