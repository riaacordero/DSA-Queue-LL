package LinkedList;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();       // Built-In
        LinkedList node = new LinkedList();     // ADT
    
        // USING BUILT-IN
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(13);
        ll.addFirst(64);

        System.out.println(ll);

        // REVERSE-ENGINEERED ADT
        node.addAtFirst(5);
        node.addAtFirst(6);
        node.addAtFirst(13);
        node.addAtFirst(64);

        node.addAtLast("Hello");

        System.out.println(node.traverse());

        node.addAtLast("World");
        node.deleteFirst();
        System.out.println(node.traverse());


    }

}
