package myutil.testreflect.ioc;

/**
 * @author LiWei
 * @date 2020/06/11 21:23
 */
public class Person {
    private String name;
    private Integer age;  // 最好使用包装类
    private String sex;

    public Person() {}
    public Person(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" + this.name + "," + this.age + "," + this.sex + "}";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
