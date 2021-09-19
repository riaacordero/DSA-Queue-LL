package Queue;
// Queue is a concrete method (contains a prototype and a body)
// Abstract methods are methods without a body

import javax.swing.JOptionPane;

public class TestQueue{
    public static void main(String[] args) {
        Queue q = new Queue(5);
        Object option = "";
    
        while (option!="End"){
            option = JOptionPane.showInputDialog(null, "Please choose ", "Example 1",
                JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Enqueue", "Dequeue", "End" }, "Enqueue");
            if (option=="Enqueue"){
                int val = Integer.parseInt(JOptionPane.showInputDialog("Enter data: "));
                q.enqueue(val);
                JOptionPane.showMessageDialog(null, "Inserted "+val+". New queue is:"+q.display());
                continue;
            } else if (option == "Dequeue"){
                q.dequeue();
                String msg = "New queue is:"+q.display();
                JOptionPane.showMessageDialog(null, msg);
                continue;
            } else {
                break;
            }

        }
    }
}