package singleton;

/**
 * @author LiWei
 * @date 2020/06/01 15:12
 */
public class TestMain {
    public static void main(String[] args) {
        SingleTon s = SingleTon.getSingleTon();
        SingleTon s2 = SingleTon.getSingleTon();
        System.out.println(s == s2);
        System.out.println(s.equals(s2));
        System.out.println(s);
        System.out.println(s2);
    }
}
