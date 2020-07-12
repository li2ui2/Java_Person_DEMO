package rely;

/**
 * @author LiWei
 * @date 2020/05/28 10:39
 */
public class Pig {
    private String name;
    private int weight = 20;

    public Pig() {}
    public Pig(String name) {
        this.name = name;
    }

    public void beKilled() {
        System.out.println(this.name + "被杀了");
    }

    public int growUp(int month) {
        for(int i = 0; i < month; i++){
            this.weight *= 2;
        }
        return this.weight;
    }

    public int getWeight() {
        return this.weight;
    }
    public String getName() {
        return this.name;
    }
}
