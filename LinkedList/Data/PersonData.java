package LinkedList.Data;

public class PersonData {
    String name = "";
    String num = "";
    int age = 0;

    PersonData(String name, String num, int age){
        this.name = name;
        this.num = num;
        this.age = age;
    }

    public String toString() {
        return this.name+", "+String.valueOf(this.age)+", "+this.num;
    }
    
}
