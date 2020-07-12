package myutil.testreflect.method;

/**
 * @author LiWei
 * @date 2020/06/11 19:51
 */
public class Person extends Animal{

    public void eat() {
        System.out.println("Person不带参数的吃饭方法");
    }
    public String eat(String str) {
        System.out.println("Person带参数的吃饭方法");
        return str;
    }
    private void testPrivate() {
        System.out.println("Person类私有的方法");
    }

}
