package myutil.testgather;

import java.util.TreeSet;

/**
 * @author LiWei
 * @date 2020/06/07 22:04
 */
public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<String> stringSet = new TreeSet<>();
        stringSet.add(new String("lee1"));
        stringSet.add(new String("lee1"));
        stringSet.add(new String("lee3"));
        stringSet.add(new String("lee4"));
        stringSet.add(new String("lee5"));
        System.out.println(stringSet.size());

        TreeSet<Person> personSet = new TreeSet<>();
        personSet.add(new Person("lee1"));
        personSet.add(new Person("lee1"));
        personSet.add(new Person("lee3"));
        personSet.add(new Person("lee4"));
        personSet.add(new Person("lee5"));
        System.out.println(personSet.size());
        System.out.println(personSet);
    }
}
