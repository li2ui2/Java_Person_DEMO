package myutil.testgather;

import java.util.HashSet;

/**
 * @author LiWei
 * @date 2020/06/07 21:06
 */
public class TestHashSet {
    public static void main(String[] args) {
        /*HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("V");
        hashSet.add("b");
        hashSet.add("S");
        hashSet.add("c");
        System.out.println(hashSet);

        // 先获取一个迭代器对象
        Iterator<String> it = hashSet.iterator();  // Iterator接口，多态的效果
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }*/

        HashSet<String> stringSet = new HashSet<>();
        stringSet.add(new String("lee1"));
        stringSet.add(new String("lee1"));
        stringSet.add(new String("lee3"));
        stringSet.add(new String("lee4"));
        stringSet.add(new String("lee5"));
        System.out.println(stringSet.size());

        HashSet<Person> personSet = new HashSet<>();
        personSet.add(new Person("lee1"));
        personSet.add(new Person("lee1"));
        personSet.add(new Person("lee3"));
        personSet.add(new Person("lee4"));
        personSet.add(new Person("lee5"));
        System.out.println(personSet.size());
        System.out.println(personSet);
    }
}
