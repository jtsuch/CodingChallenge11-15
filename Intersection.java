
public class Intersection {

    public Linkedlist intersect(Linkedlist one, Linkedlist two) {

        while(one != null) {
            Linkedlist temp = two;

            while(temp != null) { 
                if(one == temp) {
                    return temp;
                }
                temp = temp.next;
            }
            one = one.next;
        }
        return null;
    }
}