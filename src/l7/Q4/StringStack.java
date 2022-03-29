package l7.Q4;

public class StringStack {
    private StringDLL stack;

    public StringStack() {
        this.stack = new StringDLL();
    }

    public void push(String data) {
        this.stack.addFirst(data);
    }

    public String pop() {
        return this.stack.remove(0);
    }

    public String peek() {
        if (this.stack.getHead() == null)
            return null;
        return this.stack.getHead().data;
    }
}
