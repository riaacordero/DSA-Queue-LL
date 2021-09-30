package LinkedList.Data;

public class test {
    public static void main(String[] args) {
        LNode ll = new LNode();

        PersonData p1 = new PersonData("Ria", "09496979279", 19);
        PersonData p2 = new PersonData("Neil", "09696969696", 20);
        PersonData p3 = new PersonData("Hernan", "09123456789", 19);
        PersonData p4 = new PersonData("Gerome", "098376543210", 19);
        PersonData p5 = new PersonData("Rendell", "09128734657", 19);


        ll.addAtFirst(p1);
        ll.addAtFirst(p2);
        ll.addAtFirst(p3);
        System.out.println(ll.traverse());
        ll.addAtLast(p4);
        ll.addAtPosition(p5,1);
        System.out.println(ll.traverse());
        ll.deleteAtLast();
        System.out.println(ll.traverse());
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
    }
    
}
