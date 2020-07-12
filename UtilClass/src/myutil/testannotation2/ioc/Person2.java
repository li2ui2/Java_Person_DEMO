package myutil.testannotation2.ioc;

/**
 * @author LiWei
 * @date 2020/06/12 15:14
 */
public class Person2 {

    private String name;
    private Integer age;
    private  String sex;

    @MyAnnotation({"李伟", "18", "男"})
    public Person2() {}

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
    // 利用反射技术实现了一个IOC，对象由别人来创建，创建同时自动注入属性信息
    // 自动注入属性信息-->String字符串  产生一个注解，携带这些信息


}
