package ch02linkedlists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vagrant on 6/11/18.
 */
public class ListUtils {


    public static List<Integer> populateNodes(MyNode head) {
        List<Integer> res = new ArrayList<>();
        MyNode itr = head;
        while (itr.next != null) {
            res.add(itr.data);
            itr = itr.next;
        }
        res.add(itr.data);

        return res;
    }

}
