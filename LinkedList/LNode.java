package LinkedList;

import javax.swing.JOptionPane;

public class LNode {
    // Node contains: {data | address}
    // head = null (if node is empty)
    // Example: [45,78]
    // head->node {45 | next}, {78 | null}

    private Object data;
    private LNode head, next;

    public LNode(){
        next= head=null;     // Denotes node is an empty node
    }

    private void errorMsg(String msg){
        System.out.println(msg); // Terminal, test message
        // JOptionPane.showMessageDialog(null, msg, "Full", JOptionPane.ERROR_MESSAGE);
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addAtFirst(Object value){
        LNode newNode = new LNode();

        if (isEmpty()){
            newNode.data=value;
            newNode.next=null;
            head = newNode;
        }else{
            newNode.data=value;
            newNode.next=head;
            head = newNode;
        }
    }

    public String traverse(){
        String hold= "";
        if (isEmpty()){
            return "List is empty";
        } else{
            LNode link = head;
            while(link!=null){    // EOF (End of File loop - )
                hold+= " | "+link.data+"|->";
                link= link.next;
            }
        }
        return hold;
    }

    public void addAtLast(Object data){
        if (isEmpty()){
            addAtFirst(data);
        }else{
            LNode link=head;
            while(link.next!=null){
                link=link.next;
            }
            LNode newNode = new LNode();
            newNode.data = data;
            newNode.next = null;
            link.next = newNode;
        }
    }

    public int currentSize(){
        int counter = 1;
        if (isEmpty()){
            errorMsg("List is empty!");
        } else {
            LNode link = head;
            while(link.next!=null){
                link = link.next;
                counter++;
            }
        }
        return counter;
    }

    public void addAtPosition(Object data, int position){
        if (isEmpty()){
            errorMsg("List is Empty! Node is added at the beginning of the list.");
            addAtFirst(data);
        } else if (position==0){
            errorMsg("Node is added at the beginning");
            addAtFirst(data);
        } else if (position<0 || position>currentSize()){
            errorMsg(position+" is INVALID");
        } else{
            LNode visit, link;
            visit=link=head;
            int ctr=1;
            while (ctr!=position){
                link = link.next;
                ctr++;
            }
            while(link.next!=visit){
                visit=visit.next;
            }
            LNode newNode = new LNode();
            newNode.data=data;
            newNode.next=visit;
            link.next=newNode;
        }
    }

    public void deleteAtFirst(){
        if(isEmpty()){
            errorMsg("LinkedList is empty!");
        } else{
            LNode link = head;
            head=link.next;
        }
        System.out.println("Deleting successful!");
    }

    public void deleteAtLast(){
        if(isEmpty()){
            errorMsg("LinkedList is empty!");
        } else{
            LNode link1, link2;
            link1=head;
            while(link1.next.next!=null){
                link1 = link1.next;
            }
            link2 = link1.next;
            link1.next = null;
            System.out.println("Deleting successful!");
        }
    }

    public void deleteAtPosition(int position){
        if (isEmpty()){
            errorMsg("List is Empty! Add value first.");
        } else if (position==0){
            deleteAtFirst();
        } else if(position == currentSize()-1){
            deleteAtLast();
        } else if (position<0 || position>=currentSize()){
            errorMsg(position+" is INVALID");
        } else{
            LNode link=head;
            for (int i=0;i<position-1;i++){
                link = link.next;
            }
            link.next=link.next.next;
        }
    }
    
    public boolean isFound(Object data){
        return true;
    }

    public Object getFirst(){
        return head.data;
    }

    public Object getLast(){
        LNode link=head;
        while(link.next!=null){
            link=link.next;
        }
        return link.data;
    }

    public Object get(int position){
        LNode link=head;
        for (int i=0;i<position;i++){
            link = link.next;
        }
        link.next=link.next.next;
        return link.data;
    }
}
