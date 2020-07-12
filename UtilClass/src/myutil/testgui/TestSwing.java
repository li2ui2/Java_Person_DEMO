package myutil.testgui;

import javax.swing.*;
import java.io.File;

/**
 * @author LiWei
 * @date 2020/06/13 14:02
 */

@SuppressWarnings("all")
public class TestSwing {
    public static void main(String[] args) {
        // frame最大的窗体，管理方式为边界式 中 东 西 南 北 BorderLayout
        // JMenuBar 菜单条，放置在窗体上面
        // Panel 面板，可以有多个，管理方式为流式、居中 FlowLayout
        // 组件
        // frame.setLayOut(new FlowLayout());  frame.setLayOut(null);

        // 先创建一个窗体
        JFrame frame = new JFrame("Java应用程序窗口");
        // 设置窗体的title
        // frame.setTitle("Java应用程序窗口");

        // 创建一个面板
        JPanel panel = new JPanel();

        // 添加一个按钮
        JButton button = new JButton("登录");
        // button.setText("");

        // 创建复选框
        JCheckBox box1 = new JCheckBox("抽烟");
        JCheckBox box2 = new JCheckBox("喝酒");
        JCheckBox box3 = new JCheckBox("烫头");

        // 创建单选按钮
        JRadioButton r1 = new JRadioButton("male");
        JRadioButton r2 = new JRadioButton("female");
        // 将两个单选按钮添加在一个组里面
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);

        // 创建文本域
        JTextArea area = new JTextArea(5,10);
        // 滚动条
        JScrollPane pane = new JScrollPane(area);

        // 菜单条 JMenuBar
        // 菜单 JMenu
        // 菜单项 JMenuItem
        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem newUItem = new JMenuItem("New");
        menu.add(newUItem);
        bar.add(menu);

        // 创建标签
        JLabel userLable = new JLabel("账号：");
        JLabel passLable = new JLabel("密码：");
        // 创建一个文本框
        JTextField text = new JTextField(20);

        // 创建一个密码框
        JPasswordField pass = new JPasswordField(20);


        //将按钮添加到擦窗体内
        panel.add(userLable);
        panel.add(text);
        panel.add(passLable);
        panel.add(pass);
        panel.add(button);
        panel.add(box1);
        panel.add(box2);
        panel.add(box3);
        panel.add(r1);
        panel.add(r2);
        panel.add(pane);

        frame.setJMenuBar(bar);
        frame.add(panel);

        // 设置不可以拖拽大小
        // frame.setResizable(false);

        // 设置窗体出现时的位置和自身大小
        // x和y为左上角位置，width和height为窗体宽和高
        frame.setBounds(600,300,900,550);

        // 设置窗体的属性状态为显示状态
        frame.setVisible(true);
        // 设置点击关闭按钮时，窗体执行完毕
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
