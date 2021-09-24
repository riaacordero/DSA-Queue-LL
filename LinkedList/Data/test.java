package LinkedList.Data;

public class test {
    public static void main(String[] args) {
        LNode ll = new LNode();

        PersonData p1 = new PersonData("Ria", "09496979279", 19);
        PersonData p2 = new PersonData("Ned", "09696969696", 20);
        PersonData p3 = new PersonData("Hernan", "09123456789", 19);

        ll.addAtFirst(p1);
        ll.addAtFirst(p2);
        ll.addAtFirst(p3);
        System.out.println(ll.traverse());
    }
    
}
