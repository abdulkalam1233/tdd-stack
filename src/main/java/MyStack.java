public class MyStack {

    private int size = 0;
    private int element[];
    private int maxSize;

    public MyStack(int maxSize) {
        element = new int[maxSize];
        this.maxSize = maxSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        if (size == maxSize) {
            throw new OverFlowException();
        }
        this.element[size++] = element;
    }

    int pop() {
        if (size == 0) {
            throw new UnderFlowException();
        }
        return element[--size];
    }

    public int getSize() {
        return size;
    }

    public class UnderFlowException extends RuntimeException {

    }

    public class OverFlowException extends RuntimeException {

    }
}
