package contains;

/**
 * @author LiWei
 * @date 2020/05/28 10:19
 */
public class Car {
    public String brand;
    public String type;
    public String color;
    public Wheel wheel;

    public Car() {}
    public Car(String brand, String type, String color, Wheel wheel) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.wheel = wheel;  // 包含
    }

    public void showCar() {
        System.out.println("这是一辆" + brand + "牌" + type + "型号" + color + "的小汽车");
        System.out.println("车上搭载着" + wheel.brand + "牌的" + wheel.size + "尺寸" + wheel.color + "颜色的车轮子");
        wheel.turn();
    }
}
