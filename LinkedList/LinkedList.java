package LinkedList;

public class LinkedList {
    // Node contains: {data | address}
    // head = null (if node is empty)
    // Example: [45,78]
    // head->node {45 | next}, {78 | null}

    private Object data;
    private LinkedList head, next;

    LinkedList(){
        next= head=null;     // Denotes node is an empty node
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addAtFirst(Object data){
        LinkedList newNode = new LinkedList();
        newNode.data=data;

        if (isEmpty()){
            newNode.next=null;
            head = newNode;
        }else{
            newNode.next=head;
            head = newNode;
        }
    }

    public void addAtLast(Object data){
        LinkedList newNode = new LinkedList();
        if (isEmpty()){
            addAtFirst(data);
        }else{
            LinkedList link=head;
            while(link.next!=null){
                link=link.next;
            }
            newNode.data = data;
            newNode.next = null;
            link.next = newNode;
        }
    }

    public void deleteFirst(){
        LinkedList link = head;
        head=link.next;
    }

    public String traverse(){
        String hold= "";
        if (isEmpty()){
            return "LinkedList is empty";
        } else{
            LinkedList link = head;
            while(link!=null){    // EOF (End of File loop - )
                hold+= link.data+" | "+link.next+"\n";
                link= link.next;

            }
        }
        return hold;
    }

    public void addFirst(int i) {
    }
    
}
