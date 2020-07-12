/**
 * @author LiWei
 * @date 2020/05/26 21:25
 */
public class TestOverLoad {
    public void test() {
        System.out.println("执行了test方法带不参数");
    }
    public void test(boolean b) {
        System.out.println("执行了test方法带boolean参数"+b);
    }
    public void test(int i) {
        System.out.println("执行了test方法带int参数"+i);
    }
    /*public void test(char c) {
        System.out.println("执行了test方法带char参数"+c);
    }*/
    public void test(String s) {
        System.out.println("执行了test方法带String参数"+s);
    }
    public void test(int...x) {
        // x本质为一个数组 int[] x={1,2,3,4};
        System.out.println("执行了test方法携带动态参数列表");
        for (int value : x) {
            System.out.println(value);
        }
    }

    public static void main(String[] args){
        TestOverLoad to = new TestOverLoad();
        to.test(1,2,3,4);
    }
}
