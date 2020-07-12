package myutil.testgather;

import java.util.LinkedList;

/**
 * @author LiWei
 * @date 2020/06/07 20:47
 */
public class TestLinked {
    public static void main(String[] args) {
        /*// ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            arrayList.add("a");
        }
        long time2 = System.currentTimeMillis();
        System.out.println("arrayList向后追加元素时间为：" + (time2-time1));
        long time3 = System.currentTimeMillis();
        for (String v:arrayList) {
            System.out.println(v);
        }
        long time4 = System.currentTimeMillis();
        System.out.println("arrayList取元素时间为：" + (time4-time3));*/

        LinkedList<String> linkList = new LinkedList<>();
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            linkList.addLast("a");
        }
        long time2 = System.currentTimeMillis();
        System.out.println("arrayList向后追加元素时间为：" + (time2-time1));
    }
}
