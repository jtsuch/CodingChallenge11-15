
public class Intersection {

    public boolean intersect(Linkedlist one, Linkedlist two) {

        while(one != null) {
            Linkedlist temp = two;

            while(temp != null) { 
                //System.out.println("One: "+one.val);
                //System.out.println("Two: "+temp.val);
                if(one == temp) {
                    return true;
                }
                temp = temp.next;
            }
            one = one.next;
        }
        return false;
    }
}