package myutil.testenum;

import java.text.MessageFormat;

/**
 * @author LiWei
 * @date 2020/07/24 21:36
 * @description 用于测试枚举类扩展是否成功
 */
public class TestMain {
    public static void main(String[] args) {
        invoke(StatusEnum.ENABLED);

        System.out.println();

        response(ResponseEnum.SUCCESS);
    }

    private static void response(IPairs pairs) {
        System.out.println(pairs.get() == ResponseEnum.SUCCESS);

        System.out.println(MessageFormat.format("key: {0}, value: {1}", pairs.key(), pairs.value()));
    }

    private static void invoke(IPairs pairs) {
        System.out.println(pairs.get() == StatusEnum.ENABLED);

        System.out.println(MessageFormat.format("key: {0}, value: {1}", pairs.key(), pairs.value()));
    }
}
