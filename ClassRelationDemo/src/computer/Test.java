package computer;

/**
 * @author LiWei
 * @date 2020/05/31 14:10
 */
public class Test {
    public static void main(String[] args) {
        MachineRoom room = new MachineRoom();
        Student student1 = new Student("LIUI");
        room.welcomeStudent(student1);

        Student student2 = new Student("LISI");
        room.welcomeStudent(student2);
    }
}
