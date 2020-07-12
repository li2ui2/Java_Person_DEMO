package util;

/**
 * @author LiWei
 * @date 2020/06/02 14:47
 */
public class Node {
    public Node prev;
    public int item;
    public Node next;

    public Node(Node prev, int item, Node next) {
        this.prev = prev;
        this.item = item;
        this.next = next;
    }
}
