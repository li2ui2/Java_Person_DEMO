package computer;

/**
 * @author LiWei
 * @date 2020/05/31 14:06
 */
public class MachineRoom {

    // 机房与电脑之间是聚合关系，机房内有电脑
    public Computer[] computers = new Computer[5];  // 类的聚集，创建电脑类的数组


    // 设计一个程序块，用来给电脑数组进行初始化（赋值）
    {
        for(int i = 0; i < computers.length; ++i){
            computers[i] = new Computer(i+1);
        }

    }

    // 机房和学生之间是依赖关系，机房欢迎学生来使用
    public void welcomeStudent(Student student) {
        String studentName = student.getStudentName();
        System.out.println("欢饮" + studentName + "学生进入机房");
        // 学生进入机房后，找一台状态为关闭的电脑
        for (Computer computer : computers) {
            boolean computerState = computer.isUsed();
            if (!computerState) {
                student.useCompute(computer);
                break;
            }
        }

    }
}
