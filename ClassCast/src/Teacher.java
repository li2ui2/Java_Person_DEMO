/**
 * @author LiWei
 * @date 2020/06/02 16:55
 */
public class Teacher extends Person{
    public String name = "子类的name属性";
    public void eate() {
        System.out.println("做老师的通常不按时吃饭");
    }
    public void teach() {
        System.out.println("做老师独有的方法，一般人不会讲课");
    }
}
