package ch02linkedlists;

import java.util.HashSet;

/**
 * 1. Write code to remove duplicates from an unsorted linked list.
 * 2. How would you solve this problem if a temporary buffer is not allowed?
 */
public class Q21RemoveDups {

    public static void removeDups(MyNode head) {
        HashSet<Integer> set = new HashSet<>();
        MyNode pre = null;
        MyNode p = head;
        while (p != null) {
            if (set.contains(p.data)) {
                pre.next = p.next;
            } else {
                set.add(p.data);
                pre = p;
            }
            p = p.next;
        }
    }


    // Without temporary buffer
    public static void removeDups2(MyNode head) {
        MyNode current = head;
        while (current != null) {
            MyNode runner = current;
            while (runner.next != null) {
                if (current.data == runner.next.data) {
                    if (runner.next.next != null){
                         runner.next = runner.next.next;
                    } else {
                        runner.next = null;
                    }
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}
