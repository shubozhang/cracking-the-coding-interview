package ch02linkedlists;

/**
 * Created by vagrant on 6/15/18.
 */
public abstract class AbstractTest {

    protected MyNode getHead(){

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

        return head;
    }
}
