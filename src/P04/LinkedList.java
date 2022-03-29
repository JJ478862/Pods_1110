package P04;

public class LinkedList {
    Node head;
    Node tail;

    protected  class Node {
        String data ;
        Node next;
    }

    public void addFirst(String s) {
        Node node = new Node();
        node.data = s;
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        }
        else {
            node.next = this.head;
            this.head = node;
        }
    }

    public String toString(){
        String result = "";
        Node n = head;
        while(n != null){
            result += n.data + " -> ";
            n = n.next;
        }
        return result;
    }
}
