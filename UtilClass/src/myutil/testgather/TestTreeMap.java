package myutil.testgather;

import java.util.TreeMap;

/**
 * @author LiWei
 * @date 2020/06/08 16:28
 */
public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String> ();
        map.put(5, "e");  // map集合中的key需要可比较的，key的对象需要实现Comparable接口
        map.put(2, "b");
        map.put(3, "c");
        map.put(7, "g");
        map.put(1, "a");
        map.put(8, "h");
        map.put(9, "i");
        map.put(4, "d");
        map.put(6, "f");
        System.out.println(map);
    }
}
