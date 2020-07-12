package exam;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author LiWei
 * @date 2020/06/08 16:44
 */
public class Student {
    // 属性
    private final String username;
    private final String password;

    public Student(String username,String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    // 设计一个方法，学生考试
    // 参数是一套试卷，返回值为学生作答的所有选项
    public String[] exam(ArrayList<Question> paper) {
        String[] answers = new String[paper.size()];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < paper.size(); ++i) {
            Question question = paper.get(i);
            System.out.println((i+1) + "." + question.getTitle());
            answers[i] = input.nextLine(); // 接收学生输入的答案
        }
        return answers;
    }
}
