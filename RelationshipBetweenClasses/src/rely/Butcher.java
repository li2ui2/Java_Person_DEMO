package rely;

/**
 * @author LiWei
 * @date 2020/05/28 10:42
 */
public class Butcher {
    // 屠夫杀猪
    public void killPig(Pig pig) {
        System.out.println("屠夫执行了杀猪方法");
        String pigName = pig.getName();
        int pigWeight = pig.getWeight();
        System.out.println(pigName + "的体重为：" + pigWeight);
        pig.beKilled();
    }
}
