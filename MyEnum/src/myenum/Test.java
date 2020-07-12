package myenum;

import java.util.Scanner;

/**
 * @author LiWei
 * @date 2020/06/04 10:30
 */
public class Test {
    public static void main(String[] args) {
        /*Day day = Day.monday;
        // day为一个枚举类型的对象，默认继承Object
        // 除了继承自Object类的方法外，还有一些其他方法，证明我们自己创建的enum类型，默认继承Enum
        // 因此我们自己定义的每一个enum类型，都会默认继承Enum，间接继承Object
        Day[] days = Day.values();  // 获取所有的枚举对象
        for(Day d:days){
            System.out.println(d.name()+"--"+d.ordinal());
        }

        Day d = Day.valueOf("monday");
        System.out.println(d.name()+"--"+d.ordinal());*/
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个星期的英文单词：");
        String key = input.nextLine();
        Day day = Day.valueOf(key);
        switch (day) {  // JDK1.5之前int(byte short) char 1.6enum 1.7String
            case monday:
                System.out.println("您输入的是星期一");
                break;
            case tuesday:
                System.out.println("您输入的是星期二");
                break;
            case wednesday:
                System.out.println("您输入的是星期三");
                break;
            case thursday:
                System.out.println("您输入的是星期四");
                break;
            case friday:
                System.out.println("您输入的是星期五");
                break;
            case saturday:
                System.out.println("您输入的是星期六");
                break;
            case sunday:
                System.out.println("您输入的是星期日");
                break;
            default:
                System.out.println("出错");
                break;
        }

    }
}
