package ch02linkedlists;

import java.util.ArrayList;
import java.util.List;

/**
 * Questions:
 * Implement an algorithm to find the kth to last element of a singly linked list
 */
public class Q22KthElement {


    public static MyNode getKth(MyNode head, int k) {
        if (head == null || k < 0) {
            return null;
        }
        List<MyNode> nodes = new ArrayList<>();
        MyNode cur = head;
        while (cur.next != null) {
            nodes.add(cur);
            cur = cur.next;
        }
        nodes.add(cur);

        if (k > nodes.size()) {
            return null;
        } else {
            return nodes.get(nodes.size() - k);
        }
    }

    public static int printList(MyNode head, int k) {
        if (head == null) {
            return 0;
        }
        int index = printList(head.next, k) + 1;
        if (index == k) {
            System.out.println("k: " + head.data);
        }
        return index;
    }

    public static MyNode getKthToLast(MyNode head, int k) {
        int i = 0;
        return getKthToLastHelper(head, k, i);
    }

    private static MyNode getKthToLastHelper(MyNode head, int k, int i) {
        if (head == null) {
            return null;
        }
        MyNode res = getKthToLastHelper(head.next, k, ++i);
        if (k == i) {

            return head;
        }
        return null;
    }
}
