package myutil.teststring;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author LiWei
 * @date 2020/06/07 14:53
 */
public class TestRegex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = input.nextLine();
        // 第一个字母时必须时a，第二个字母时abc中的一个
        boolean b = str.matches("a[abc]");
        System.out.println(b);
        // 第一个字母必须时a，第二个字母为非abc的任意其他一个
        boolean b2 = str.matches("a[^abc]");
        System.out.println(b2);
        // 第一个字母必须时a，第二个时任意范围内的一个字母
        boolean b3 = str.matches("a[a-zA-z]");
        System.out.println(b3);

        // a-z都可以但不能b和c
        boolean b4 = str.matches("a[a-z&&[^bc]]");
        System.out.println(b4);

        // 所有的字串中找寻满足如下规则的信息，邮政编码
        String str2 = "123456abc123456abc123456abc";
        // 1.利用Pattern类创建一个模式，可以理解为一个正则表达式对象
        Pattern pattern = Pattern.compile("\\d{6}");
        // 2.需要提供一个字符串
        // 3.利用pattern模式对象创建一个匹配器
        Matcher matcher = pattern.matcher(str2);
        // 4.找寻字符串中出现满足上述格式的字串
        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
