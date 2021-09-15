package Queue;
public class Queue {
    //FIFO (First-in, First-out)

    private int num[];
    private int front,rear,capacity;

    public Queue(){
        capacity=5;
        front=rear=1;
        num=new int[capacity];
    }

    public Queue(int capacity){
        this.capacity=capacity;
        front=rear=-1;
        num=new int[capacity];
    }

    public boolean isEmpty(){
        return rear==-1;
    }

    public boolean isFull(){
        return rear==capacity-1;
    }

    public void enqueue(int data){
        rear++;
        if(isEmpty()){
            System.out.println("Queue is empty!");
        } else{
            front = 0;
            num[rear]=data;
        }
    }

    public int dequeue(){
        int val =0;
        if(isFull()){
            System.out.println("Queue is full!");
        } else{
            val=num[front];
            for(int i=0;i<rear;i++){  //cascade delete
                num[i]=num[i+1];
            }
            rear--;  // hides the last/rear value
        }
        return val;
    }

    public String display(){
        String hold = "";
        for(int i=0;i<rear;i++){  //cascade delete
            hold+=num[i]+" ";
        }
        return hold;
    }
}
