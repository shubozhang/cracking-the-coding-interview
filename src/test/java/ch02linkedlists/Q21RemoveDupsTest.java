package ch02linkedlists;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by vagrant on 6/11/18.
 */
public class Q21RemoveDupsTest {
    private MyNode head;

    @Before
    public void setup() {
        head = new MyNode(0);
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
    }


    @Test
    public void removeDups() throws Exception {
        Q21RemoveDups.removeDups(head);
        //assertTrue(MyNode.populateNodes(head))
        assertEquals(ListUtils.populateNodes(head), Arrays.asList(0, 1, 3, 4));


    }

    @Test
    public void removeDups2() throws Exception {
        MyNode.appendToTail(head, 1);

        Q21RemoveDups.removeDups2(head);

        assertEquals(ListUtils.populateNodes(head), Arrays.asList(0, 1, 3, 4));
    }

}