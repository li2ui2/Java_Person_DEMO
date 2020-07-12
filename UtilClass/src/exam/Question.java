package exam;

/**
 * @author LiWei
 * @date 2020/06/08 16:48
 */
public class Question {
    private final String title;  // 题目
    private final String answer;  // 答案

    public Question(String title, String answer) {
        this.title = title;
        this.answer = answer;
    }

    // 重写方法，将默认比较题目对象的地址规则改成比较题干，题干一致，则认为是同一个题目
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Question) {
            Question anotherQuestion = (Question) obj;
            return this.title.equals(anotherQuestion.title);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.title.hashCode();
    }

    public String getTitle() {
        return this.title;
    }
    public String getAnswer() {
        return answer;
    }
}
