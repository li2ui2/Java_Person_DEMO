package myutil.testexception;

/**
 * @author LiWei
 * @date 2020/06/08 20:42
 */
public class TestThrowable {

    // 自定义异常
    public void testMyException() {
        System.out.println("测试自定义异常的方法执行啦");
        if(3>2) {
            throw new TestMyException();
        }
    }
    public void testMyException2() throws TestMyException2{
        System.out.println("测试自定义异常的方法执行啦");
        if(3>2) {
            throw new TestMyException2("说明一下异常的具体问题");
        }
    }

    public void testException() {
        try {
            System.out.println("try开始");

            String str = null;
            str.length();  // NullPointerException

            String str2 = "abc";
            str.charAt(10);
            System.out.println("try结束");
        }catch (NullPointerException e) {
            // e.printStackTrace();
            System.out.println("捕获到了空指针异常");
        }catch (StringIndexOutOfBoundsException e) {
            // e.printStackTrace();
            System.out.println("捕获到字符串越界异常");
        }catch (Exception e) {
            e.printStackTrace();  // 打印输出异常的名字
            System.out.println("捕获到其他异常");
        }finally {
            System.out.println("finally我被执行了");
        }
    }

    public void testException2() throws NullPointerException, StringIndexOutOfBoundsException{
        String str = null;
        str.length();
        String str2 = "abc";
        str.charAt(10);
    }

    public static void main(String[] args) {

        // 整数除以0抛出异常为ArithmeticException
        // 小数除以0输出结果为Infinity
        // System.out.println(10.0/0);
        // new TestThrowable().testException();
        /*try {
            TestThrowable tt = new TestThrowable();
            tt.testException2();
        }catch (Exception e) {
            System.out.println("捕获到了空指针异常");
        }*/

        /*TestThrowable tt = new TestThrowable();
        tt.testMyException();*/

        TestThrowable tt = new TestThrowable();
        try {
            tt.testMyException2();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("发生自定义异常啦");
        }
    }

}
