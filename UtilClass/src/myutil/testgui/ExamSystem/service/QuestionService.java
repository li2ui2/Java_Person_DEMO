package myutil.testgui.ExamSystem.service;

import myutil.testgui.ExamSystem.dao.QuestionDao;
import myutil.testgui.ExamSystem.domain.Question;
import myutil.testgui.ExamSystem.util.MySpring;

import java.util.ArrayList;

/**
 * @author LiWei
 * @date 2020/06/14 13:18
 */
public class QuestionService {
    // 在service需要一个底层的dao支持
    private final QuestionDao dao = MySpring.getBean("myutil.testgui.ExamSystem.dao.QuestionDao");

    // 设计一个方法，获取随机长生的试卷
    public ArrayList<Question> getPaper(int count) {
        return dao.getPaper(count);
    }

}
