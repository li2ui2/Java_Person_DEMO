package myutil.testenum;

/**
 * @author LiWei
 * @date 2020/07/24 21:32
 * @description 状态枚举类
 */
public enum StatusEnum implements IPairs<Integer, String, StatusEnum> {

    /**
     * 状态码枚举
     */
    DISABLED(0, "record has been disabled"),

    ENABLED(1, "record has been enabled"),

    DELETES(9, "record has been deleted")
    ;

    private final int code;

    private final String desc;

    StatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public StatusEnum get() {
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
