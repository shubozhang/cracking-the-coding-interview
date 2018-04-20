package ch02linkedlists;

/**
 * Created by vagrant on 4/3/18.
 */
public class MyNode {
    public MyNode next = null;
    public int data;

    public MyNode(int d) {
        data = d;
    }

    public static void appendToTail(MyNode head, int d) {
        MyNode end = new MyNode(d);
        MyNode n = head;

        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public static MyNode deleteNode(MyNode head, int d) {
        MyNode n = head;

        if (n.data == d) {
            return head.next; /* moved head*/
        }

        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head; /* head didn't change*/
            }
            n = n.next;
        }
        return head;
    }

    public static void printNodes(MyNode head) {
        MyNode itr = head;
        while (itr.next != null) {
            System.out.println(itr.data);
            itr = itr.next;
        }
        System.out.println(itr.data);
    }
}
