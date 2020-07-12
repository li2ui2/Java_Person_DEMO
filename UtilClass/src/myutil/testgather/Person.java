package myutil.testgather;

/**
 * @author LiWei
 * @date 2020/06/07 21:28
 */
public class Person implements Comparable<Person>{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    // 重写equals方法，将person放入set集合中，去掉重复
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj instanceof Person) {
            Person anotherPerson = (Person)obj;
            return this.name.equals((anotherPerson.name));
        }
        return false;
    }

    // 重写hashCode方法
    @Override
    public int hashCode() {
        // 两个person对象name属性一致，需要让hashCode返回值一致
        return this.name.hashCode();  // this.name为一个String
    }

    // 重写toString方法，让对象打印输出的时候直接输出对象的属性，而不是hashCode码
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("{");
        builder.append(this.name);
        builder.append("}");
        return new String(builder);
    }

    // 如果想让该对象存入TreeSet集合内，必须实现接口，重写这个方法
    @Override
    public int compareTo(Person o) {
        // 当前对象name和另一个对象name的compareTo结果
        return this.name.compareTo(o.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
