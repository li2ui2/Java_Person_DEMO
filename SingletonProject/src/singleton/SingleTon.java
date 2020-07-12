package singleton;

/**
 * @author LiWei
 * @date 2020/06/01 15:12
 */
public class SingleTon {

    private SingleTon() {}

    private static SingleTon single;

    // 3.提供一个获取单个对象的方法给用户
    public static SingleTon getSingleTon() {
        if(single == null) {
            single = new SingleTon();
        }
        return single;  // 引用类型
    }
}
