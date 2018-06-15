package ch02linkedlists;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vagrant on 6/15/18.
 */
public class Q22KthElementTest extends AbstractTest{
    private MyNode head;

    @Before
    public void setup() {
        head = getHead();
    }


    @Test
    public void getKth() throws Exception {
    }

    @Test
    public void printList() throws Exception {
        Q22KthElement.printList(head, 10);
    }

    @Test
    public void getKthToLast() throws Exception{
        MyNode res = Q22KthElement.getKthToLast(head, 3);
        assertTrue(res.data == 3);
    }

}