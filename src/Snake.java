public class Snake {
    public int getHead() {
        return head;
    }

    public Snake(int head, int tail) {
        this.head = head;
        this.tail = tail;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    int head;
    int tail;

}
