package exam;
import	java.util.jar.Attributes.Name;
import java.util.HashMap;
import	java.util.Random;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author LiWei
 * @date 2020/06/08 16:44
 */
public class ExamMacnine {
    // 属性---记录学生的账号密码
    private final HashMap<String,String> userBox = new HashMap<String, String> ();
    {
        userBox.put("张三","123456");
        userBox.put("李四","123456");
        userBox.put("王五","123456");
    }

    // 属性--题库，存储Question对象，每一个对象是一道题目
    // 使用set集合来存储，如果题库进行扩充，产生重复的题目可以自动去掉了
    // hash集合遵循的的规则    equals和hashCode方法
    private final HashSet<Question> questionBank = new HashSet<Question>();
    // 利用块初始化hashset集合内的题目对象
    {
        questionBank.add(new Question("如下那个选项不是Java的基本数据类型\n\t" +
            "A.String\n\tB.int\n\tC.boolean\n\tD.short\n请输入正确答案：", "A"));

        questionBank.add(new Question("已知表达式int m[] = {0,1,2,3,4,5,6}; 下面那个表达式的值与数组的长度相等\n\t" +
                "A.m.length()\n\tB.m.length\n\tC.m.length()+1\n\tD.m.length+1\n请输入正确答案：", "B"));

        questionBank.add(new Question("下面那些声明是合法的？\n\t" +
                "A.long l = 4990\n\tB.int i = 4L\n\tC.float f = 1.1\n\tD.double d = 34.4\n请输入正确答案：", "AD"));

        questionBank.add(new Question("以下选项中选择正确的java表达式\n\t" +
                "A.int k=new String(“aa”)\n\tB.String str = String(“bb”)\n\t" +
                "C.char c=74;\n\tD.long j=8888;\n请输入正确答案：", "CD"));

        questionBank.add(new Question("以下哪些运算符是含有短路运算机制的？\n\t" +
                "A.&\n\tB.&&\n\tC.|\n\tD.||\n请输入正确答案：", "BD"));

        questionBank.add(new Question("在java中，无论测试条件是什么，下列（）循环将至少执行一次。\n\t" +
                "A.for\n\tB.do...while\n\tC.while\n\tD.while...do\n请输入正确答案：", "B"));

        questionBank.add(new Question("下面关于变量及其范围的陈述哪些是不正确的\n\t" +
                "A.实例变量是类的成员变量\n\tB.实例变量用关键字static声明\n\tC.在方法中定义的局部变量在该方法被执行时创建\n\t" +
                "D.局部变量在使用前必须被初始化\n请输入正确答案：", "BC"));

        questionBank.add(new Question("下列关于修饰符混用的说法，错误的是\n\t" +
                "A.abstract不能与final并列修饰同一个类\n\tB.abstract类中可以有private的成员\n\t" +
                "C.abstract方法必须在abstract类中\n\tD.static方法中能处理非static的属性\n请输入正确答案：", "D"));

        questionBank.add(new Question("执行完以下代码int [ ] x = new int[25]；后，以下哪项说明是正确的\n\t" +
                "A.x[24]为0\n\tB.x[24]未定义\n\tC.x[25]为0\n\tD.x[0]为空\n请输入正确答案：", "A"));

        questionBank.add(new Question("下列哪种说法是正确的\n\t" +
                "A.实例方法可直接调用超类的实例方法\n\tB.实例方法可直接调用超类的类方法\n\tC.实例方法可直接调用其他类的实例方法\n\t" +
                "D.实例方法可直接调用本类的类方法\n请输入正确答案：", "D"));
    }

    // 设计一个方法，随机生成试卷，5道题
    //     方法返回值--->试卷ArrayList<Question>，因为ArrayList便于轮询
    public ArrayList<Question> getPaper(){
        System.out.println("考试机正在随机成成试卷...");
        try {
            Thread.sleep(5000);
        }catch (Exception e) {
            e.printStackTrace();
        }

        // 随机抽取试卷的时候，试卷的题目应该是不重复的，应该使用set来存
        HashSet<Question> paper = new HashSet<> ();
        // 产生一个随机的序号来找寻题目，但题库是个set，没有序号，因此需要将题库转存成ArrayList格式
        ArrayList<Question> questionBank = new ArrayList<Question> (this.questionBank);
        // 随机抽题
        while (paper.size() != 5){
            int index = new Random().nextInt(this.questionBank.size());  // [0,10)
            paper.add(questionBank.get(index));
        }
        return new ArrayList<Question>(paper);
    }

    // 考试机中学生用户登录的方法
    public String login(String username, String password) {
        String realPasaword = this.userBox.get(username);
        if (realPasaword != null && realPasaword.equals(password)) {
            return "登录成功";
        }
        return "用户名或密码错误";
    }
}
