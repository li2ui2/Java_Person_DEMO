package myutil.testenum;

/**
 * @author LiWei
 * @date 2020/07/24 21:32
 * @description 枚举类接口，扩展枚举
 */
public interface IPairs<K, V, C extends Enum> {
    /**
     * 返回枚举对象
     * */
    C get();

    /**
     * 返回枚举项的 key
     * */
    K key();

    /**
     * 返回枚举项的 value
     * */
    V value();
}

