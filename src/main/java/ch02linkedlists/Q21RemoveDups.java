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


    public static void removeDups2(MyNode head){
        MyNode current = head;
        while(current != null){
            MyNode runner = current;
            while (runner.next != null) {
                if ( runner.data == runner.next.data){
                    runner.next = runner.next.next;
                }
                runner = runner.next;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        MyNode head = new MyNode(0);
        MyNode node1 = new MyNode(1);
        MyNode node2 = new MyNode(0);
        MyNode node3 = new MyNode(3);
        MyNode node4 = new MyNode(4);
        MyNode node5 = new MyNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        removeDups(head);

        MyNode.printNodes(head);

        removeDups2(head);

        MyNode.printNodes(head);
    }


}
