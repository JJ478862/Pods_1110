package P04.Q2;

import java.util.LinkedList;

public class Stack {
    private LinkedList<Student> people;

    public Stack(){
        people = new LinkedList<>();
    }

    public void push(Student p) {
        this.people.addFirst(p);
    }

    public Student pop() {
        if (this.people.size() == 0){
            return null;
        }
        return this.people.removeFirst();
    }

    public Student peek() {
        if (this.people.size() == 0){
            return null;
        }
        return this.people.get(0);
    }

    public int size(){
        return people.size();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("bottom ");
        for (Student p :
                people) {
            sb.append(p);
            sb.append(" - ");
        }
        sb.append("top");
        return sb.toString();
    }
}