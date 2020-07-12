package myenum;

/**
 * @author LiWei
 * @date 2020/06/04 10:28
 */
public enum Day {
    // 描述了七个当前类对象
    monday("星期1", 1), tuesday("星期2", 2), wednesday, thursday, friday, saturday, sunday;
    private String name;
    private int index;
    private Day() { }
    private Day(String name, int index) {
        this.name = name;
        this.index = index;
    }
}
