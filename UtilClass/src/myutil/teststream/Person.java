package myutil.teststream;

import java.io.Serializable;

/**
 * @author LiWei
 * @date 2020/06/09 22:00
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -5415722498595098615L;
    private String name;
    private int age;

    public Person(){}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + "," + this.age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("人类吃饭的方法");
    }
}
