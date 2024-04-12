package HanJia.游戏;

import javax.swing.*;

public class 继承改进68 extends JFrame {

        int[][] datas={
                {0,2,0,4},
                {8,2,0,4},
                {0,2,16,4},
                {32,2,0,64},
        };
public 继承改进68(){
       initFrame();
       paintView();
    //调用成员方法，设置窗体可见
    setVisible(true);

}

    /**
     * 此方法用于初始化窗体，所有窗体的相关设置都在这个方法中完成
     */
    public void initFrame(){

            //调用成员方法，设置宽和高
            setSize(514,538);
            //调用成员方法，设置窗体居中
            setLocationRelativeTo(null);
            //调用成员方法，设置窗体置顶
            setAlwaysOnTop(true);
            //调用成员方法，设置关闭模式;
            setDefaultCloseOperation(3);
            //通过窗体对象，取消默认布局
           setLayout(null);
        //调用成员方法，设置窗口标题
        setTitle("2048小游戏");

        }

    /**
     * 此方法用于绘制游戏界面
     */
    public void paintView(){
        for(int i=0;i<4;i++){
            for (int x=0;x<4;x++){
                // 创建JLaBel对象，展示图片。
                //JLabel JL3=new JLabel(new ImageIcon("D:\\编程\\素材包\\"+数组名[索引][索引]"+".png"));
                JLabel JL3=new JLabel(new ImageIcon("D:\\编程\\素材包\\饺子"));
                //设置布局
                JL3.setBounds(50+100*i,50+100*x,100,100);
                // 通过窗体对象，获取面板对象并调用add方法添加按钮组件
               getContentPane().add(JL3);
            }
        }
    }



}
