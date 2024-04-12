package HanJia.游戏;

import javax.swing.*;

public class 循环改进43 {
    public static void main(String[] args) {
        //绘制窗体对象
        JFrame frame=new JFrame();
        //调用成员方法，设置宽和高
        frame.setSize(514,538);
        //调用成员方法，设置窗体居中
        frame.setLocationRelativeTo(null);
        //调用成员方法，设置窗体置顶
        frame.setAlwaysOnTop(true);
        //调用成员方法，设置关闭模式;
        frame.setDefaultCloseOperation(3);
        //通过窗体对象，取消默认布局
        frame.setLayout(null);
        for(int i=0;i<4;i++){
               for (int x=0;x<4;x++){
                   // 创建JLaBel对象，展示图片。
                   JLabel JL3=new JLabel(new ImageIcon("D:\\编程\\素材包\\饺子"));
                   //设置布局
                   JL3.setBounds(50+100*i,50+100*x,100,100);
                   // 通过窗体对象，获取面板对象并调用add方法添加按钮组件
                   frame.getContentPane().add(JL3);
               }
        }
        //调用成员方法，设置窗口标题
        frame.setTitle("2048小游戏");
        //调用成员方法，设置窗体可见
        frame.setVisible(true);
    }
}
