package contains;

/**
 * @author LiWei
 * @date 2020/05/28 10:16
 */
public class Wheel {
    public String brand;
    public int size;
    public String color;

    public Wheel() {}
    public Wheel(String brand, int size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public void turn() {
        System.out.println("车轮子可以旋转");
    }
}
