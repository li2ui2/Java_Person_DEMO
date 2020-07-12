package exam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author LiWei
 * @date 2020/06/08 16:45
 */
public class TestMain {
    public static void main(String[] args) {
        // 船舰考试机
        ExamMacnine machine = new ExamMacnine(); // 调用构造方法时，有一个块默认执行

        // 船舰学生对象来考试
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎进入考试系统\n请输入用户名：");
        String username = input.nextLine();
        System.out.println("请输入密码：");
        String password = input.nextLine();
        Student student = new Student(username, password);
        String result = machine.login(student.getUsername(), student.getPassword());
        if(result.equals("登录成功")) {
            System.out.println("登录成功\n" + student.getUsername() + "开始考试啦");

            ArrayList<Question> paper = machine.getPaper();  //考试机随机抽取一套试卷
            String[] answers = student.exam(paper);  // 学生考试

            Teacher teacher = new Teacher();
            int score = teacher.checkPaper(paper, answers);
            System.out.println(student.getUsername() + "最终的考试成绩为：" + score);
        }

    }
}
