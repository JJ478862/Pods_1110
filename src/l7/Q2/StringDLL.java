package l7.Q2;


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
        return;
    }

    public String reverseToString() {
        Node node = this.tail;
        String result = "";
        while (node != null) {
            result = result + node.data + "->";
            node = node.previous;
        }
        if (result.endsWith("->"))
            return result.substring(0, result.length() - 2);
        return result;
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
