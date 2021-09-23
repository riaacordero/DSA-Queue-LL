package LinkedList;

import java.util.*;

import LinkedList.*;

public class Test {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();       // Built-In
        LNode node = new LNode();     // ADT

        // REVERSE-ENGINEERED ADT
        node.addAtFirst(12);
        node.addAtFirst(45);
        node.addAtFirst(7);
        node.addAtLast(45);
        node.addAtLast(17);
        System.out.println(node.traverse());
        node.addAtPosition(49, 2);
        System.out.println(node.traverse());
        node.deleteAtLast();    // error
        System.out.println(node.traverse());
        System.out.println(node.getFirst());
        System.out.println(node.getLast());
        System.out.println(node.get(3));



    }

}
