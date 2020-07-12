package myutil;
import	java.util.TimeZone;
import	java.util.Calendar;
import java.text.SimpleDateFormat;
import	java.util.Date;
import java.util.TimeZone;

/**
 * @author LiWei
 * @date 2020/06/05 21:34
 */
public class TestTime {
    public static void main(String[] args) {
        // 返回当前系统时间与计算机元年之间的毫秒值差
        // 计算机元年1970-1-1 00:80:00，中国的
        /*long time = System.currentTimeMillis();
        System.out.println(time);
        // 1591364218264
        // 1591364833353

        Date date1 = new Date();  // 默认就是用当前的系统时间构建的date对象
        Date date2 = new Date(1591364218264L);

        // System.out.println(date1);  // 输出是重写了toString，为格林威治格式的时间 Fri Jun 05 21:43:17 CST 2020
        // Fri Jun 05 21:43:17 CST 2020分别对应星期、月、日、时间、时区、年
        boolean x = date1.before(date2);
        boolean y = date1.after(date2);
        System.out.println(x + "---" + y);

        // date对象中应该有一个long的属性 time
        date1.setTime(1591364833353L);
        System.out.println(date1);
        System.out.println(date1.getTime());

        System.out.println(date2.compareTo(date1));  // 按照顺序比较 -1调用在前参数在后，1刚好相反

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = new Date();
        System.out.println(date);  // Fri Jun 05 21:57:01 CST 2020
        String v = sdf.format(date);
        System.out.println(v);*/

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();  // 系统当前时间的calendar对象
        System.out.println(calendar);  // java.util.GregorianCalendar[...]
        calendar.set(Calendar.YEAR, 2015);
        int year = calendar.get(Calendar.YEAR);  // 返回年
        int month = calendar.get(Calendar.MONTH);  // 返回月，从0开始数
        int day = calendar.get(Calendar.DAY_OF_MONTH);  // 返回日
        System.out.println(year + "-" + (month+1) + "-" + day);

        TimeZone tz = calendar.getTimeZone();
        // TimeZone ttz = TimeZone.getDefault();
        System.out.println(tz.getID());
        System.out.println(tz.getDisplayName());
    }
}
