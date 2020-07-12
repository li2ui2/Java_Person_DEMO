package myutil.testannotation;

/**
 * @author LiWei
 * @date 2020/06/12 10:16
 */
public class Person2 {
    @MyAnnotation(test = "abc",value = 10)  // 我们定义一个注解对象，把abc值传递给注解，让他携带给别人
    public void eat() {

    }

}
