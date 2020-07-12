package myutil.testannotation2;

/**
 * @author LiWei
 * @date 2020/06/12 14:42
 */
public class Person {

    @MyAnnotation(value= {"liwei","sex","18"})
    private String name;

    @MyAnnotation(value= {"liwei2","sex","18"})
    public void eat() {
        System.out.println("hello");
    }

}
