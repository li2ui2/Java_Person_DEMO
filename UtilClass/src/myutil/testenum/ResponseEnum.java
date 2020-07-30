package myutil.testenum;

/**
 * @author LiWei
 * @date 2020/07/24 21:32
 * @description 响应枚举类
 */
public enum ResponseEnum implements IPairs<Integer, String, ResponseEnum> {

    /**
     * 响应状态：SUCCESS
     */
    SUCCESS(10000, "success"),
    /**
     * 响应状态：FAILED
     */
    FAILED(10001, "failed")
    ;

    private final int code;

    private final String desc;

    ResponseEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public ResponseEnum get() {
        return this;
    }

    @Override
    public Integer key() {
        return this.code;
    }

    @Override
    public String value() {
        return this.desc;
    }
}

