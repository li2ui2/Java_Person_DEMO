package computer;

/**
 * @author LiWei
 * @date 2020/05/31 14:07
 */
public class Student {

    // 属性--学生的名字
    private String name;

    // 构造方法
    public Student() {}
    public Student(String name) {
        this.name = name;
    }

    // 获取学上姓名
    public String getStudentName() {
        return this.name;
    }

    // 依赖关系,学生使用电脑
    public void useCompute(Computer computer) {
        System.out.println(this.name + "开始使用电脑");
        computer.beOpen();
        computer.beUsing();
        computer.beClosed();
    }
}
