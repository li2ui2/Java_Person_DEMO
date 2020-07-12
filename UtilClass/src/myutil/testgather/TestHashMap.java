package myutil.testgather;
import java.util.*;
import java.util.Set;

/**
 * @author LiWei
 * @date 2020/06/08 10:39
 */
public class TestHashMap {
    public static void main(String[] args) {
        // 创建一个HashMap对象
        HashMap<Integer, String> map = new HashMap<>();
        // 将一些key-value的关系存入集合map
        map.put(1,"aaa");
        map.put(2,"bbb");
        map.put(4,"ddd");
        map.put(3,"ccc");
        map.put(5,"eee");
        map.put(6,"fff");
        System.out.println(map);
        // map集合的遍历
        // 1.先获取map的所有key
        Set<Integer> keys = map.keySet();
        // 2.通过迭代器遍历keys
        for (Integer key : keys) {
            String value = map.get(key);
            System.out.println(key + "----" + value);
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "----" + value);
        }
    }
}
