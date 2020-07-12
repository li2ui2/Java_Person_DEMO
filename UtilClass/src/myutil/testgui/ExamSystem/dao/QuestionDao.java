package myutil.testgui.ExamSystem.dao;

import myutil.testgui.ExamSystem.domain.Question;
import myutil.testgui.ExamSystem.util.MySpring;
import myutil.testgui.ExamSystem.util.QuestionFileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 * @author LiWei
 * @date 2020/06/14 11:19
 */
public class QuestionDao {

    // 获取缓存对象
    private final QuestionFileReader reader = MySpring.getBean(
            "myutil.testgui.ExamSystem.util.QuestionFileReader");
    // 将缓存中的集合临时改为list集合，随机找寻元素的时候存在位置
    private final ArrayList<Question> questionBank = new ArrayList<>(reader.getQuestionBox());

    // 负责读取文件，抽取count道题目，随机生成一套试卷
    public ArrayList<Question> getPaper(int count) {
        HashSet<Question> paper = new HashSet<Question>();
        while (paper.size() != count) {
            Random r = new Random();  // 随机数对象 0-9
            int index = r.nextInt(questionBank.size());// [0,12)
            paper.add(this.questionBank.get(index));
        }
        return new ArrayList<Question>(paper);
    }
}
