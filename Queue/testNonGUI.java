package Queue;

public class testNonGUI {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(51);
        q.enqueue(120);


        System.out.println(q.display());
        System.out.println(q.dequeue()+" is removed.");
        System.out.println(q.display());
    }
    
}
