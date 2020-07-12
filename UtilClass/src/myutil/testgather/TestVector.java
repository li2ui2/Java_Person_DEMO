package myutil.testgather;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author LiWei
 * @date 2020/06/07 20:02
 */
public class TestVector {
    public static void main(String[] args) {
        /*Vector<String> vector = new Vector<> (4, 4);
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("d");
        System.out.println(vector);
        // System.out.println(vector.set(0, "z"));
        System.out.println(vector);

        *//*System.out.println(vector.size());  // 有效元素个数
        System.out.println(vector.capacity());  // 底层真实数组容量*//*

        for (int i = 0; i <= 22; i++) {
            vector.add("b");
            System.out.println(vector.size() + "--" + vector.capacity());
        }*/

        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search("b"));

        ArrayList<String> array = new ArrayList<> ();
        LinkedList<String> linked = new LinkedList<> (array);
    }
}
