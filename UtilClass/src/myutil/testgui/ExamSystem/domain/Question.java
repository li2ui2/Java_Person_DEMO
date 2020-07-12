package myutil.testgui.ExamSystem.domain;

/**
 * @author LiWei
 * @date 2020/06/14 11:17
 * domain实体，存储文件中的题目，增强可读性
 */
public class Question {
    private String title;  // 存储题干（题目+选项）
    private String answer;  // 存储答案
    private String picture;  // 存储图片路径

    public Question() {
    }

    public Question(String title, String answer) {
        this.title = title;
        this.answer = answer;
    }

    public Question(String title, String answer, String picture) {
        this.title = title;
        this.answer = answer;
        this.picture = picture;
    }

    // 重写Question类中的两个方法，equals hashCode
    // 想要将Question对象存入HashSet集合内，让set集合帮我们去掉重复元素
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Question) {
            Question anotherQuestion = (Question) obj;
            String thisTitle = this.title.substring(0, this.title.indexOf("<br>"));
            String anotherTitle = anotherQuestion.title.substring(0, anotherQuestion.title.indexOf("<br>"));
            return thisTitle.equals(anotherTitle);

        }
        return false;
    }

    @Override
    public int hashCode() {
        String thisTitle = this.title.substring(0, this.title.indexOf("<br>"));
        return thisTitle.hashCode();
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
