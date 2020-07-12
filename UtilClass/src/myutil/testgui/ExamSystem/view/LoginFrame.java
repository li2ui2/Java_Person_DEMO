package myutil.testgui.ExamSystem.view;

import myutil.testannotation2.ioc.Myspring;
import myutil.testgui.ExamSystem.service.UserService;
import myutil.testgui.ExamSystem.util.BaseFrame;
import myutil.testgui.ExamSystem.util.MySpring;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author LiWei
 * @date 2020/06/13 16:13
 */
@SuppressWarnings("all")
public class LoginFrame extends BaseFrame {

    public LoginFrame() {
        this.init();
    }

    public LoginFrame(String title) {
        super(title);
        this.init();
    }

    // 创建一个面板
    private JPanel mainPanel = new JPanel();
    // 创建title显示标题
    private JLabel titleLabel = new JLabel("在 线 考 试 系 统");
    // 创建账号密码标题
    private JLabel accountLabel = new JLabel("账 户：");
    private JLabel passwordLabel = new JLabel("密 码：");
    // 创建输入账号和密码的文本框/密码框
    private JTextField accountField = new JTextField();
    private JPasswordField passwordField = new JPasswordField();
    // 创建两个按钮
    private JButton loginButton = new JButton("登 录");
    private JButton exitButton = new JButton("退 出");

    // 设置每一个组件的位置、大小、布局等
    @Override
    protected void configComponents() {
        // 设置组件的位置--布局管理
        // 默认为流失管理，即都居中
        // 边界式BorderLayout(JFrame) 流式FlowLayout(JPanel)
        // 网格式GridLayout 自定义(null)
        mainPanel.setLayout(null);  // 设置panel的部剧管理方式为自定义
        // mainPanel.setBackground(Color.WHITE);  // 设置mainPanel背景颜色

        // 设置标题组件的位置和字体大小
        titleLabel.setBounds(120, 40, 340, 35);
        titleLabel.setFont(new Font("黑体", Font.BOLD, 34));
        // 设置用户名label位置和字体大小
        accountLabel.setBounds(94, 124, 90, 30);
        accountLabel.setFont(new Font("黑体", Font.BOLD, 24));
        // 设置用户名field位置和字体大小
        accountField.setBounds(204, 124, 260, 30);
        accountField.setFont(new Font("黑体", Font.BOLD, 24));
        // 设置密码label位置和字体大小
        passwordLabel.setBounds(94, 174, 90, 30);
        passwordLabel.setFont(new Font("黑体", Font.BOLD, 24));
        // 设置密码field位置和字体大小
        passwordField.setBounds(204, 174, 260, 30);
        passwordField.setFont(new Font("黑体", Font.BOLD, 24));
        // 设置登录按钮位置和字体大小
        loginButton.setBounds(154, 232, 100, 30);
        loginButton.setFont(new Font("黑体", Font.BOLD, 22));
        // 设置退出按钮位置和字体大小
        exitButton.setBounds(304, 232, 100, 30);
        exitButton.setFont(new Font("黑体", Font.BOLD, 22));
    }

    // 将所有的组件添加在窗体上
    @Override
    protected void addElement() {
        // 将所有组件添加至窗体上
        mainPanel.add(titleLabel);
        mainPanel.add(accountLabel);
        mainPanel.add(accountField);
        mainPanel.add(passwordLabel);
        mainPanel.add(passwordField);
        mainPanel.add(loginButton);
        mainPanel.add(exitButton);
        this.add(mainPanel);
    }

    // 绑定事件监听
    @Override
    protected void addListener() {
        // 绑定事件监听器
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 1.获取用户输入的账号密码
                // 从登录窗口上的组件内获取 文本框 密码框
                String account = accountField.getText();
                char[] value = passwordField.getPassword();
                String password = new String(value);
                // 2.调用之前Service层的登录方法
                UserService service = MySpring.getBean("myutil.testgui.ExamSystem.service.UserService");
                String result = service.login(account, password);
                // 3.判定最终的结果
                if (result.equals("登录成功")) {
                    LoginFrame.this.setVisible(false);  // 登录窗口隐藏，展示新的窗口
                    // 弹出新的考试界面
                    new ExamFrame("考试系统--考试页面");

                    System.out.println("登录成功");
                } else {
                    // 弹出警告框，告诉登录失败
                    JOptionPane.showMessageDialog(LoginFrame.this, result);
                    // 设置文本框和密码框的值为空
                    accountField.setText("");
                    passwordField.setText("");
                }
            }
        };
        loginButton.addActionListener(listener);  // 观察者模式
    }

    // 设置窗体规格
    @Override
    protected void setFrameSelf() {
        // 设置窗体其实位置和大小
        this.setBounds(750, 300, 560, 360);
        // 设置点击关闭退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗体大小不可拖拽
        this.setResizable(false);
        // 设置窗体显示状态
        this.setVisible(true);
    }

}
