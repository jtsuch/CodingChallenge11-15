import java.util.*;

public class Loopdetection {

    public Linkedlist findloop(Linkedlist head) {

        // A list containing all nodes that have already been found
        List<Linkedlist> found = new ArrayList<>();

        while(head != null) {
            if(found.contains(head)) return head;
            found.add(head);
            head = head.next;
        }

        return null;
    }


}