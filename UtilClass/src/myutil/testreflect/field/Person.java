package myutil.testreflect.field;

/**
 * @author LiWei
 * @date 2020/06/11 16:13
 */
public class Person extends Animal{

    private String name;
    public int age;

    /*public Person(int age) {

    }*/

    @Override
    public String toString() {
        return "{"+name+","+age+"}";
    }

}
