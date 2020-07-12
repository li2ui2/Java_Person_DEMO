package myutil.testgui.ExamSystem.util;

import java.io.BufferedReader;

import myutil.testgui.ExamSystem.domain.Question;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * @author LiWei
 * @date 2020/06/14 13:04
 * <p>
 * 程序执行时，将文件中的所有题目，一次性读取出来
 */
public class QuestionFileReader {
    private final HashSet<Question> questionBox = new HashSet<>();

    {
        BufferedReader reader = null;
        try {
            // 1.创建一个文件输入流，读取文件(题库) 一行一行读取  title#answer
            reader = new BufferedReader(
                    new FileReader("src\\myutil\\testgui\\ExamSystem\\dbfile\\Question.txt"));
            String message = reader.readLine();
            while (message != null) {
                String[] values = message.split("#");
                if (values.length == 2) {
                    questionBox.add(new Question(values[0], values[1]));
                } else if (values.length == 3) {
                    questionBox.add(new Question(values[0], values[1], values[2]));
                }

                message = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public HashSet<Question> getQuestionBox() {
        return questionBox;
    }


}
