package Queue;

import javax.swing.JOptionPane;

public class Queue {
    //FIFO (First-in, First-out)

    private int num[];
    private int front,rear,capacity;

    // ========= CONSTRUCTOR =========

    public Queue(){
        capacity=5;
        front=rear=-1;
        num=new int[capacity];
    }

    public Queue(int capacity){
        this.capacity=capacity;
        front=rear=-1;
        num=new int[capacity];
    }

   // ========= TRANSFORMERS =========    

    public void enqueue(int data){
        rear++;
        if(isFull()){
            errorMsg("Queue is full!");
        } else{
            front = 0;
            num[rear]=data;
        }
    }

    public int dequeue(){
        int val =0;
        if(isEmpty()){
            errorMsg("Queue is empty!");
        } else{
            val=num[front];
            for(int i=0;i<rear;i++){  //cascade delete
                num[i]=num[i+1];
            }
            rear--;  // hides the last/rear value
        }
        return val;
    }

    // ========= OBSERVERS =========    

    public String display(){
        String hold = "";
        for(int i=0;i<=rear;i++){  //cascade delete
            hold+=num[i]+" ";
        }
        return hold;
    }

    public boolean isEmpty(){
        return rear==-1;
    }

    public boolean isFull(){
        return rear==capacity-1;
    }

    private void errorMsg(String msg){
        JOptionPane.showMessageDialog(null, msg, "Full", JOptionPane.ERROR_MESSAGE);
    }

    public int frontVal(){
        return num[front];
    }

    public int rearVal(){
        return num[rear];
    }

    public int peek(){
        if (isEmpty()){
            errorMsg("Queue is empty!");
            return -1;
        } else{
            return num[front];
        }
    }

    public int last(){
        if (isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        } else{
            return num[rear];
        }    
    }

    public int getCurrentSize(){
        return capacity-(capacity-(rear+1));
    }

    public int getCapacity(){
        return capacity;
    }

}
