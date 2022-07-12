
public class Linkedlist {

    int val;
    Linkedlist next;

    // Creating a LinkedList node without a child
    public Linkedlist(int val) {
        this.val = val;
        this.next = null;
    }

    // Creating a LinkedList node with a child
    public Linkedlist(int val, Linkedlist next) {
        this.val = val;
        this.next = next;
    }

    // The only needed setter method
    public void setNext(Linkedlist next) {
        this.next = next;
    }
}