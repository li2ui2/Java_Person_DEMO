package myutil.teststring;

/**
 * @author LiWei
 * @date 2020/06/07 11:10
 */
public class TestStringBufferAndStringBuilder {
    public static void main(String[] args) {
        /*// 无参数构造方法，构建一个默认长度为16的对象 char[]
        // StringBuilder builder = new StringBuilder();
        // 利用给定的参数，构建一个自定义长度空间的对象 char[]
        // StringBuilder builder = new StringBuilder(20);
        // 利用带String参数的构造方法，默认数组长度为字符串长度+16
        // StringBuilder builder = new StringBuilder("abc");*/

        /*StringBuilder builder = new StringBuilder("abc");
        long time1 = System.currentTimeMillis();
        builder.append("a".repeat(200000));
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
        System.out.println(builder);*/

        StringBuilder builder = new StringBuilder("abcdefg");  // 3+16
        System.out.println(builder.capacity());
        System.out.println(builder.length());

        String value = builder.substring(2,5);
        System.out.println(value);
        System.out.println(builder);

        builder.delete(2,5);
        System.out.println(builder);

        builder.replace(1,4,"bcdef");
        System.out.println(builder);
        System.out.println(builder.reverse());
        builder.setCharAt(0,'a');
        System.out.println(builder);
    }
}
