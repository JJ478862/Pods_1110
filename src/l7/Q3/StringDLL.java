package l7.Q3;


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

    // you should copy your solution (the methods) from p1 and paste it here here

    public void add(int position, String data) {
        if (position == 0)
            this.addFirst(data);
        else {
            int current = 1;
            Node pre = this.head;
            while (pre != null && current < position) {
                pre = pre.next;
                current++;
            }
            if (pre != null) {
                Node node = new Node(data);
                node.next = pre.next;
                if (pre.next != null)
                    pre.next.previous = node;
                node.previous = pre;
                pre.next = node;
            }
        }
    }

    public String remove(int position) {
        if (position == 0) {
            String value = this.head.data;
            this.head = this.head.next;
            if (this.head == null) {
                this.head = null;
                this.tail = null;
            } else {
                this.head.previous = null;
            }
            return value;
        } else {
            int current = 0;
            Node pre = this.head;
            while (pre != null && current < position) {
                pre = pre.next;
                current++;
            }

            if (pre != null) {
                if (pre.next == null)
                    return removeLast();
                else {
                    String value = pre.data;
                    pre.previous.next = pre.next;
                    pre.next.previous = pre.previous;
                    return value;
                }
            }
            return null;
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
