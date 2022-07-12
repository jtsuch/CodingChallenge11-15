
class Testing {
    // Use the main method to test the examples
    public static void main(String[] args) {

        // First create the Linked Lists
        Linkedlist four = new Linkedlist(4);
        Linkedlist three = new Linkedlist(3, four);
        Linkedlist two = new Linkedlist(2, three);
        Linkedlist one = new Linkedlist(1, two);

        Linkedlist six = new Linkedlist(6, three);
        Linkedlist five = new Linkedlist(5, six);

        printTwoLists(one, five);

        Intersection i = new Intersection();

        // Testing True Intersection
        System.out.println("Testing Intersections: (Expected True)");
        System.out.println(i.intersect(one, five));

        // Testing False Intersection
        Linkedlist fakeFour = new Linkedlist(4);
        Linkedlist fakeThree = new Linkedlist(3, fakeFour);
        Linkedlist fakeTwo = new Linkedlist(2, fakeThree);
        Linkedlist fakeOne = new Linkedlist(1, fakeTwo);

        printTwoLists(one, fakeOne);

        System.out.println("Testing Intersections: (Expected False)");
        System.out.println(i.intersect(one, fakeOne));


        // Now testing for loops
        Loopdetection l = new Loopdetection();

        // Giving it a loop at 2
        four.setNext(two); 

        System.out.println("Testing For Loops: (Expected 2)");
        System.out.println(l.findloop(one).val);

        // Changing start of loop to the head
        four.setNext(one);

        System.out.println("Testing For Loops: (Expected 1)");
        System.out.println(l.findloop(one).val);
        
    }

    public static void printTwoLists(Linkedlist one, Linkedlist two) {
        System.out.println("List One:\tList Two:");
        while(one != null || two != null) {
            if(one != null) {
                System.out.print(one.val);
                one = one.next;
            }
            System.out.print("\t\t");
            if(two != null) {
                System.out.println(two.val);
                two = two.next;
            }
        }
    }

}