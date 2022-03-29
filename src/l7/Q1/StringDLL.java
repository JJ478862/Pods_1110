package l7.Q1;

public class StringDLL {

    protected Node head;
    protected Node tail;
    protected int size;

    public StringDLL() {
        head = null;
        tail = null;
        size = 0;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void addFirst(String data) {
        Node node = new Node(data);
        if (this.head == null && this.tail == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head.previous = node;
            this.head = node;
        }
    }

    public String removeLast() {
        if (this.tail == null)
            return null;
        else {
            Node node = this.tail;
            String value = node.data;
            this.tail = this.tail.previous;
            if (this.tail == null)
                this.head = null;
            else
                this.tail.next = null;
            return value;
        }
    }

    protected class Node {
        protected Node next;
        protected Node previous;
        protected String data;

        protected Node(String data) {
            this.data = data;
        }

    }
}
