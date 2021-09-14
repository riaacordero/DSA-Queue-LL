package Queue;
// Queue is a concrete method (contains a prototype and a body)
// Abstract methods are methods without a body

public class TestQueue{
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(15);
        q.enqueue(51);
        q.enqueue(10);
        q.enqueue(52);
        System.out.println(q.display());
        System.out.println(q.dequeue()+" is removed.");
        System.out.println(q.display());
    }
}