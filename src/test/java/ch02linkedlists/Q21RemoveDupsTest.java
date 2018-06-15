package ch02linkedlists;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by vagrant on 6/11/18.
 */
public class Q21RemoveDupsTest extends AbstractTest {

    private MyNode head;

    @Before
    public void setup() {
        head = getHead();
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