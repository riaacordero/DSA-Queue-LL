package LinkedList;

import java.util.*;

import LinkedList.*;

public class Test {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();       // Built-In
        LNode node = new LNode();     // ADT

        // REVERSE-ENGINEERED ADT
        node.addAtFirst(12);
        node.addAtFirst(24);
        node.addAtFirst(36);
        node.addAtFirst(48);
        System.out.println(node.traverse());
        node.deleteAtLast();
        System.out.println(node.traverse());




    }

}
