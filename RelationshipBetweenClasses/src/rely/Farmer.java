package rely;

/**
 * @author LiWei
 * @date 2020/05/28 10:55
 */
public class Farmer {
    // 农夫养猪
    public Pig feedPig(int month) {
        Pig pig = new Pig("小花");
        pig.growUp(5);
        return pig;
    }
}
