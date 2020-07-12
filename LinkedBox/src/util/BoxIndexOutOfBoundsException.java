package util;

/**
 * @author LiWei
 * @date 2020/05/27 15:04
 */
public class BoxIndexOutOfBoundsException extends RuntimeException {
    // 描述这个类是一个(我们自己的异常 is a 异常)异常
    // 继承extends 泛化（实现）implements
    public BoxIndexOutOfBoundsException() {

    }
    public BoxIndexOutOfBoundsException(String msg) {
        // msg提供给父类
        super(msg);
    }
}
