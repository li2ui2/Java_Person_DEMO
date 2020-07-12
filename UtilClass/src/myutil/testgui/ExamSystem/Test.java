package myutil.testgui.ExamSystem;

import myutil.testgui.ExamSystem.domain.Question;
import myutil.testgui.ExamSystem.service.QuestionService;
import myutil.testgui.ExamSystem.util.MySpring;
import myutil.testgui.ExamSystem.view.LoginFrame;

import java.util.ArrayList;


/**
 * @author LiWei
 * @date 2020/06/13 15:02
 */

public class Test {
    public static void main(String[] args) {
         new LoginFrame("考试系统-登录窗口");


        /*QuestionService service = MySpring.getBean("myutil.testgui.ExamSystem.service.QuestionService");
        ArrayList<Question> paper = service.getPaper(5);
        for(Question q : paper) {
            String title = q.getTitle().replace("<br>", "\n");
            System.out.println(title);
        }*/

        /*String message1 = "未编译之前的源文件后缀名?<br>#D";
        String message2 = "未编译之前的源文件后缀名?<br>java#D";
        String[] value1 = message1.split("#");
        String[] value2 = message2.split("#");
        Question question1 = new Question(value1[0],value1[1]);
        Question question2 = new Question(value2[0],value2[1]);
        System.out.println(question1.equals(question2));
        System.out.println(question1.hashCode());
        System.out.println(question2.hashCode());*/
    }
}
