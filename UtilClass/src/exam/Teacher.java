package exam;

import java.util.ArrayList;

/**
 * @author LiWei
 * @date 2020/06/08 16:45
 */
public class Teacher {
    // 负责批改卷子
    public int checkPaper(ArrayList<Question> paper, String[] answers) {
        System.out.println("正在生成考试成绩...");
        try {
            Thread.sleep(5000);
        }catch (Exception e) {
            e.printStackTrace();
        }

        int score = 0;
        for(int i = 0; i < paper.size(); ++i) {
            Question question = paper.get(i);
            if(question.getAnswer().equalsIgnoreCase(answers[i])){
                score += (100/paper.size());
            }
        }
        return score;

    }
}
