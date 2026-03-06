class myStack {
    private int maxSize;
    private int[] arr;
    private int top;
    
    public myStack(int n) {
        this.maxSize = n;
        this.arr = new int[maxSize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int x) {
        if(!isFull()) {
            arr[++top] = x;
        }
    }

    public void pop() {
        if(!isEmpty()) {
            top--;
        }
    }

    public int peek() {
        if(!isEmpty()) {
            return arr[top];
        }
        return -1;
    }
}
