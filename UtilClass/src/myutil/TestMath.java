package myutil;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.UUID;

/**
 * @author LiWei
 * @date 2020/06/05 20:05
 */
public class TestMath {

    public BigInteger factorial(int num) {
        BigInteger result = new BigInteger("1");
        for(int i = 1; i <= num; ++i) {
            result = result.multiply(new BigInteger(i+""));
        }
        return result;
    }

    public static void main(String[] args) {
        /*System.out.println(Math.ceil(1.4));
        System.out.println(Math.floor(1.4));
        System.out.println(Math.rint(1.4));
        System.out.println(Math.round(1.4));*/

        /*Random r = new Random();
        int value = r.nextInt();  // 随机产生一个整数
        System.out.println(value);  // -2147483648~2147483647

        int value2 = r.nextInt(10);
        System.out.println(value2);  // [0, 10)

        Float value3 = r.nextFloat();
        System.out.println(value3);

        Boolean value4 = r.nextBoolean();
        System.out.println(value4);

        // 随机产生5.0~10.9范围的小数
        float value5 = r.nextInt(6) + 5 + r.nextFloat();
        System.out.println(value5);

        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());  // 通常作为数据库表格主键

        BigInteger bi1 = new BigInteger("1234");
        BigInteger bi2 = new BigInteger("5678");
        System.out.println(bi1.add(bi2));
        System.out.println(bi2.subtract(bi1));
        System.out.println(bi2.multiply(bi1));
        System.out.println(bi2.divide(bi1));

        // 创建对象 调用计算阶乘的方法
        TestMath tm = new TestMath();
        BigInteger result = tm.factorial(55);
        System.out.println(result);*/

        BigDecimal bd = new BigDecimal("123456.789787241");
        bd = bd.setScale(2,BigDecimal.ROUND_UP);
        System.out.println(bd);

        DecimalFormat df = new DecimalFormat("000.#####");  // 0 #
        String v = df.format(12.3453213126);
        System.out.println(v);
    }
}
