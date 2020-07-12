package myutil.testgui.ExamSystem.view;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Font;

import myutil.testgui.ExamSystem.domain.Question;
import myutil.testgui.ExamSystem.service.QuestionService;
import myutil.testgui.ExamSystem.util.BaseFrame;
import myutil.testgui.ExamSystem.util.MySpring;

import javax.lang.model.element.Element;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * @author LiWei
 * @date 2020/06/13 16:26
 */
@SuppressWarnings("all")
public class ExamFrame extends BaseFrame {

    // 获取QuestionService对象
    private QuestionService service = MySpring.getBean("myutil.testgui.ExamSystem.service.QuestionService");
    // 通过service调用getPaper方法获取一套随机生成的试卷，题量为count
    private ArrayList<Question> paper = service.getPaper(5);
    // 创建一个用于存储学生选择的答案的容器
    private String[] answers = new String[paper.size()];

    // 创建吉哥变量，分别控制右侧message个数
    private int nowNum = 0;  // 记录当前题目序号
    private int totalCount = paper.size();  // 记录已经回答完毕的题目数量
    private int answerCount = 0;  // 记录已经回答完毕的题目数量
    private int unanswerCount = totalCount;  // 记录还没有回答的题目数量

    // 创建一个线程对象，控制时间变化
    private TimeControlThread timeControlThread = new TimeControlThread();
    // 创建一个变量，用来记录时间，以分钟为单位
    private int time = 61;


    //-----------------------------------------------------------------------------------------------------------------
    // 添加构造方法
    public ExamFrame() {
        this.init();
    }

    public ExamFrame(String title) {
        super(title);
        this.init();
    }

    // 添加三个panel，用于区域的分割
    private JPanel mainPanel = new JPanel();  // 负责答题主页面展示
    private JPanel messagePanel = new JPanel();  // 负责右侧信息展示
    private JPanel buttonPanel = new JPanel();  // 负责下方按钮展示

    // 添加主页面展示的各种组件
    private JTextArea examArea = new JTextArea();  // 考试文本域 展示题目
    private JScrollPane scrollPane = new JScrollPane(examArea);  // 滚动条

    // 添加右侧信息展示的各种组件
    private JLabel pictureLabel = new JLabel();  // 展示图片信息
    // 以下为提示信息
    private JLabel nowNumLabel = new JLabel("当前题号：");
    private JLabel totalCountLabel = new JLabel("题目总数：");
    private JLabel answerCountLabel = new JLabel("已答题数：");
    private JLabel unanswerCountLabel = new JLabel("未答题数：");
    private JTextField nowNumField = new JTextField();
    private JTextField totalCountField = new JTextField();
    private JTextField answerCountField = new JTextField();
    private JTextField unanswerCountField = new JTextField();
    private JLabel timeLabel = new JLabel("剩余答题时间");  // 提示剩余时间
    private JLabel realTimeLabel = new JLabel("00:00:00");  // 倒计时真实时间

    // 添加下方按钮展示的各种组件
    private JButton aButton = new JButton("A");
    private JButton bButton = new JButton("B");
    private JButton cButton = new JButton("C");
    private JButton dButton = new JButton("D");
    private JButton prevButton = new JButton("上一题");
    private JButton nextButton = new JButton("下一题");
    private JButton submitButton = new JButton("提交试卷");  // 提交按钮

    @Override
    protected void configComponents() {
        // 设置panel布局管理-->自定义
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.LIGHT_GRAY);
        // 设置message区域的位置
        messagePanel.setLayout(null);
        messagePanel.setBounds(680, 10, 300, 550);
        messagePanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));  // 设置边框
        // 设置button区域的位置
        buttonPanel.setLayout(null);
        buttonPanel.setBounds(16, 470, 650, 90);
        buttonPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        // 手动设置每一个组件的位置 字体 背景
        scrollPane.setBounds(16, 10, 650, 450);
        examArea.setFont(new Font("黑体", Font.BOLD, 28));
        examArea.setForeground(Color.BLACK);
        //examArea.setEnabled(false); // 设置文本域中的文字不能编辑

        //--------------------------------------------------------------------
        // 设置message区域中的每一个组件位置 大小 颜色
        pictureLabel.setBounds(10, 10, 280, 230);
        pictureLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        // pictureLabel.setIcon(null);  // 展示图片信息
        nowNumLabel.setBounds(40, 270, 100, 30);
        nowNumLabel.setFont(new Font("黑体", Font.PLAIN, 20));
        nowNumField.setBounds(150, 270, 100, 30);
        nowNumField.setFont(new Font("黑体", Font.BOLD, 20));
        nowNumField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        nowNumField.setEnabled(false);
        nowNumField.setHorizontalAlignment(JTextField.CENTER);

        totalCountLabel.setBounds(40, 310, 100, 30);
        totalCountLabel.setFont(new Font("黑体", Font.PLAIN, 20));
        totalCountField.setBounds(150, 310, 100, 30);
        totalCountField.setFont(new Font("黑体", Font.BOLD, 20));
        totalCountField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        totalCountField.setEnabled(false);
        totalCountField.setHorizontalAlignment(JTextField.CENTER);

        answerCountLabel.setBounds(40, 350, 100, 30);
        answerCountLabel.setFont(new Font("黑体", Font.PLAIN, 20));
        answerCountField.setBounds(150, 350, 100, 30);
        answerCountField.setFont(new Font("黑体", Font.BOLD, 20));
        answerCountField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        answerCountField.setEnabled(false);
        answerCountField.setHorizontalAlignment(JTextField.CENTER);

        unanswerCountLabel.setBounds(40, 390, 100, 30);
        unanswerCountLabel.setFont(new Font("黑体", Font.PLAIN, 20));
        unanswerCountField.setBounds(150, 390, 100, 30);
        unanswerCountField.setFont(new Font("黑体", Font.BOLD, 20));
        unanswerCountField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        unanswerCountField.setEnabled(false);
        unanswerCountField.setHorizontalAlignment(JTextField.CENTER);

        timeLabel.setBounds(90, 460, 150, 30);
        timeLabel.setFont(new Font("黑体", Font.PLAIN, 20));
        timeLabel.setForeground(Color.BLUE);
        realTimeLabel.setBounds(108, 490, 150, 30);
        realTimeLabel.setFont(new Font("黑体", Font.BOLD, 20));
        realTimeLabel.setForeground(Color.BLUE);
        //--------------------------------------------------------------------
        aButton.setBounds(40, 10, 120, 30);
        aButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));  // 点击按钮时，展示小手
        bButton.setBounds(190, 10, 120, 30);
        bButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cButton.setBounds(340, 10, 120, 30);
        cButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        dButton.setBounds(490, 10, 120, 30);
        dButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        prevButton.setBounds(40, 50, 100, 30);
        prevButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        nextButton.setBounds(510, 50, 100, 30);
        nextButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        submitButton.setBounds(276, 50, 100, 30);
        submitButton.setForeground(Color.RED);
        submitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        // 展示第一道考试题目
        this.showQuestionAndPicture();
        // 重新设置右侧message中的组件值--用变量控制
        nowNumField.setText(nowNum + 1 + "");
        totalCountField.setText(totalCount + "");
        answerCountField.setText(answerCount + "");
        unanswerCountField.setText(unanswerCount + "");

        realTimeLabel.setText(time + "");

    }

    @Override
    protected void addElement() {
        messagePanel.add(pictureLabel);
        messagePanel.add(nowNumLabel);
        messagePanel.add(nowNumField);
        messagePanel.add(totalCountLabel);
        messagePanel.add(totalCountField);
        messagePanel.add(answerCountLabel);
        messagePanel.add(answerCountField);
        messagePanel.add(unanswerCountLabel);
        messagePanel.add(unanswerCountField);
        messagePanel.add(timeLabel);
        messagePanel.add(realTimeLabel);
        //------------------------------------
        buttonPanel.add(aButton);
        buttonPanel.add(bButton);
        buttonPanel.add(cButton);
        buttonPanel.add(dButton);
        buttonPanel.add(prevButton);
        buttonPanel.add(submitButton);
        buttonPanel.add(nextButton);


        mainPanel.add(scrollPane);
        mainPanel.add(messagePanel);
        mainPanel.add(buttonPanel);
        this.add(mainPanel);

    }

    @Override
    protected void addListener() {
        // 创建一个监听器对象，用于提交按钮
        submitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // 提示是否提交确认框 -- 是0 否1 取消2
                int value = JOptionPane.showConfirmDialog(ExamFrame.this, "是否确认提交试卷");
                if (value == 0) {
                    // 倒计时时间停止--线程处理
                    timeControlThread.stopTimeThread(false);
                    // 所有按钮失效
                    ExamFrame.this.setOptionButtonEnabled(false);
                    prevButton.setEnabled(false);
                    nextButton.setEnabled(false);
                    // 让按钮颜色回归本色
                    ExamFrame.this.clearOptionButtonColor();
                    // 最终成绩的计算，展示在中间的文本域中
                    float score = ExamFrame.this.checkPaper();
                    examArea.setText("考试结束\n您最终的成绩为：" + score);
                }
            }
        });

        // 创建一个监听器对象，用于上一题按钮
        prevButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // 清除所有按钮的颜色
                ExamFrame.this.clearOptionButtonColor();
                // 还原四个选项按钮的状态，变成可用的
                ExamFrame.this.setOptionButtonEnabled(true);
                // 设置下一题按钮，变成可用的
                nextButton.setEnabled(true);
                // 当前题号减少一个
                nowNum--;

                // 如果当前题号为0，已经到达第一题，让上一题禁用
                if (nowNum == 0) {
                    prevButton.setEnabled(false);  // 禁用
                }
                // 还原之前这道题选择的是哪一个选项
                ExamFrame.this.restoreButton();

                // 显示题目和图片
                ExamFrame.this.showQuestionAndPicture();
                // 修改右侧题号，已答题和未答题
                nowNumField.setText(nowNum + 1 + "");
                answerCountField.setText(--answerCount + "");
                unanswerCountField.setText(++unanswerCount + "");

            }
        });

        // 创建一个监听器对象，用于下一题按钮
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 先清除所有选项按钮的颜色
                ExamFrame.this.clearOptionButtonColor();
                // 当前题目序号增加一个
                nowNum++;

                // 判断当前题目是否到达最后
                if (nowNum == totalCount) {  // 到达最后一道题了
                    examArea.setText("全部题目已经回答完毕\n请点击下方红色提交按钮");
                    // 全部题目都回答完毕，让下一个题目按钮失效
                    nextButton.setEnabled(false);  // 不可用
                    // 让全部选项按钮失效
                    ExamFrame.this.setOptionButtonEnabled(false);
                } else {  // 还没有到最后一题
                    // 调用自己封装的方法显示下一个题目和图片
                    ExamFrame.this.showQuestionAndPicture();
                    // 修改右侧当前的题号
                    nowNumField.setText(nowNum + 1 + "");
                }
                // 修改右侧当前的题号
                answerCountField.setText(++answerCount + "");
                unanswerCountField.setText(--unanswerCount + "");
            }
        });

        // 创建一个监听器对象，用于四个选项按钮
        ActionListener optionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 清楚之前所有选项按钮的颜色
                ExamFrame.this.clearOptionButtonColor();
                // 获取到哪一个按钮点击了
                JButton button = (JButton) e.getSource();  // 获取到哪一个按钮点击了
                // 让当前按钮颜色变化一下
                button.setBackground(Color.YELLOW);
                // 将当前按钮的选项存储在answers数组中
                // e.getActionCommand()
                answers[nowNum] = button.getText();

            }
        };
        // 将这个监听器对象绑定在四个选项按钮上
        aButton.addActionListener(optionListener);
        bButton.addActionListener(optionListener);
        cButton.addActionListener(optionListener);
        dButton.addActionListener(optionListener);

    }

    @Override
    protected void setFrameSelf() {
        this.setBounds(550, 200, 1005, 605);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);  // 不想让窗体拖拽大小
        this.setVisible(true);  // 最终展示整个窗体
        timeControlThread.start();  // 启动自定义的线程对象，进入就绪状态，处理时间
    }

    //-----------------------------------------------------------------------------------------------------------------

    // 设计一个内部类，处理时间倒计时问题
    private class TimeControlThread extends Thread {
        private boolean flag = true;  // 控制线程的运行

        public void stopTimeThread(boolean flag) {
            this.flag = flag;
        }

        @Override
        public void run() {

            // 将time进行一个格式转换 时:分:秒
            int hour = time / 60;
            int minute = time % 60;
            int second = 0;

            while (flag) {
                // 时间实现格式化
                StringBuilder timeString = new StringBuilder();
                // 处理小时
                if (hour >= 0 && hour < 10) {
                    timeString.append("0");
                }
                timeString.append(hour);
                timeString.append(":");

                // 处理分钟
                if (minute >= 0 && minute < 10) {
                    timeString.append("0");
                }
                timeString.append(minute);
                timeString.append(":");

                // 处理秒
                if (second >= 0 && second < 10) {
                    timeString.append("0");
                }
                timeString.append(second);

                // 操作realTimeLabel，处理时间的显示
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        realTimeLabel.setText(timeString.toString());
                    }
                });
                // realTimeLabel.setText(timeString.toString());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // 改变
                if (second > 0) {
                    second--;
                } else {  // second为0
                    if (minute > 0) {
                        minute--;
                        second = 59;
                    } else {
                        if (hour > 0) {
                            hour--;
                            minute = 59;
                            second = 59;
                        } else {
                            System.out.println("考试结束，时间截止");
                            // 时间显示为红色
                            realTimeLabel.setForeground(Color.RED);
                            ExamFrame.this.setOptionButtonEnabled(false);  // 所有选项按钮失效
                            prevButton.setEnabled(false);
                            nextButton.setEnabled(false);
                            // 弹出一个消息框，告知考试结束
                            JOptionPane.showMessageDialog(ExamFrame.this, "考试结束，请提交试卷");
                            break;
                        }
                    }
                }
            }
        }
    }

    // 设计一个方法，负责计算最终的成绩
    private float checkPaper() {
        float score = 100;
        int size = paper.size();
        for (int i = 0; i < size; i++) {
            Question question = paper.get(i);
            String realAnswer = question.getAnswer();
            if (!realAnswer.equals(answers[i])) {
                score -= (100 / size);
            }
        }
        return score;
    }

    // 设计一个方法，负责还原上一题的选项
    private void restoreButton() {
        // 获取当前题目的答案（已选择的那个）
        String answer = answers[nowNum];
        if (answer == null) {
            return;
        }
        switch (answer) {
            case "A":
                aButton.setBackground(Color.YELLOW);
                break;
            case "B":
                bButton.setBackground(Color.YELLOW);
                break;
            case "C":
                cButton.setBackground(Color.YELLOW);
                break;
            case "D":
                dButton.setBackground(Color.YELLOW);
                break;
            default:
                this.clearOptionButtonColor();
                break;
        }
    }

    // 设计一个方法，让所有选项按钮失效
    private void setOptionButtonEnabled(boolean key) {
        aButton.setEnabled(key);
        bButton.setEnabled(key);
        cButton.setEnabled(key);
        dButton.setEnabled(key);
    }


    // 设计一个方法，清楚所有的选项按钮颜色
    private void clearOptionButtonColor() {
        aButton.setBackground(null);
        bButton.setBackground(null);
        cButton.setBackground(null);
        dButton.setBackground(null);
    }


    // 设计一个方法，用来处理图片展示
    private ImageIcon drawImage(String path) {
        ImageIcon imageIcon = new ImageIcon(path);  // 通过给定的路径创建一个icon对象
        // 设置imageIcon对象内的image属性
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(280, 230, Image.SCALE_DEFAULT));
        // 将设置好的imageIcon对象返回
        return imageIcon;
    }


    // 设计一个方法，用来展示一道题目
    private void showQuestionAndPicture() {
        // 从paper中获取当前的一道题目
        Question question = paper.get(nowNum);
        // 获取当前question中的图片路径
        String picture = question.getPicture();  // 图片路径
        if (picture != null) {
            pictureLabel.setIcon(
                    this.drawImage("src\\myutil\\testgui\\ExamSystem\\dbfile\\image\\" + picture));
        } else {
            pictureLabel.setIcon(null);
        }
        // 处理题目中的标记 <br>表示换行
        examArea.setText((nowNum + 1) + "." + question.getTitle().replace("<br>", "\n    "));
    }
}
