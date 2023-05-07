package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int RETURN_WITH_EMPTY_LIST = -1;
    Node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return RETURN_WITH_EMPTY_LIST;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return RETURN_WITH_EMPTY_LIST;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
