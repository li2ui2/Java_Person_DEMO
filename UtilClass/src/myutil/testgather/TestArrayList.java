package myutil.testgather;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiWei
 * @date 2020/06/07 15:45
 */
public class TestArrayList {
    public static void main(String[] args) {
        // 泛型不能使用基本类型，若要使用基本类型，需要使用其对应的包装类
        /*ArrayList<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("ads");
        list.add("asda");
        list.add("tgrw");
        list.remove(0);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list);  //底层重写了toString方法

        // 集合的元素全部删掉
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.remove(0);
        }
        System.out.println(list);*/
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(50);
        list2.add(30);
        // 将list2中的所有元素添加到list1中
        list1.addAll(list2);  // 并集
        System.out.println(list1);

        list1.remove(Integer.valueOf(10));
        System.out.println(list1);

        list1.removeAll(list2);  // 差集
        System.out.println(list1);

        // list1.retainAll(list2);  // 交集
        // System.out.println(list1);

        list1.addAll(list2);

        list1.set(0, 100);
        System.out.println(list1);

        List<Integer> newList = list1.subList(2,4);
        System.out.println(newList);

        /*Object[] array = list1.toArray();
        for (Object o : array){
            Integer value = (Integer) o;
            System.out.println(value);
        }*/
        // 事先准备好一个空的数组，用于接收返回值
        Integer[] x = new Integer[list1.size()];
        list1.toArray(x);
        System.out.println(list1);
        System.out.println(x.length);

    }
}
