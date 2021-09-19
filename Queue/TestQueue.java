package Queue;
// Queue is a concrete method (contains a prototype and a body)
// Abstract methods are methods without a body

import javax.swing.JOptionPane;

public class TestQueue{
    public static void main(String[] args) {
        Queue q = new Queue(5);
        Object option = "";
    
        while (option!="End"){
            option = JOptionPane.showInputDialog(null, "Please choose ", "Queue ADT",
                JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Enqueue", "Dequeue", "End" }, "Enqueue");
                
            if (option=="Enqueue"){
                String msg ="";
                if (q.isFull()){
                    msg= "Queue is full! Try dequeuing.";
                    JOptionPane.showMessageDialog(null, msg, "Dialog",
                        JOptionPane.ERROR_MESSAGE);
                } else{
                    int val = Integer.parseInt(JOptionPane.showInputDialog("Enter data: "));
                    q.enqueue(val);
                    msg = "Inserted "+val+"\nEmpty: "+q.isEmpty()+"\nFull: "+q.isFull()+"\nCapacity: "+q.getCapacity()+"\nCurrent size: "+q.getCurrentSize()+"\nPeek: "+q.peek()+"\nLast: "+q.last()+"\nCurrent Elements: "+q.display();
                    JOptionPane.showMessageDialog(null, msg);
                }
                continue;
            } else if (option == "Dequeue"){
                String msg ="";
                if (q.isEmpty()){
                    msg= "Queue is empty! Try enqueuing.";
                    JOptionPane.showMessageDialog(null, msg, "Dialog",
                        JOptionPane.ERROR_MESSAGE);
                }else{
                    q.dequeue();
                    msg = "\nEmpty: "+q.isEmpty()+"\nFull: "+q.isFull()+"\nCapacity: "+q.getCapacity()+"\nCurrent size: "+q.getCurrentSize()+"\nPeek: "+q.peek()+"\nLast: "+q.last()+"\nCurrent Elements: "+q.display();
                    JOptionPane.showMessageDialog(null, msg);
                }
                continue;
            } else {
                break;
            }

        }
    }
}