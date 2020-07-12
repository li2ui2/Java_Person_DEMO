package myutil.testreflect.ioc;

import javax.swing.plaf.PanelUI;

/**
 * @author LiWei
 * @date 2020/06/11 21:19
 */
public class Question {
    private String title;
    private String answer;

    public Question() {}
    public Question(String title, String answer) {
        this.title = title;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "{" + this.title + "," + this.answer + "}";
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
