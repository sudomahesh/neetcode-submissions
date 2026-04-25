class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;

    public MinStack() {
        this.stack = new Stack();
        this.min = new Stack();
    }
    
    public void push(int val) {
        stack.push(val);

       if(min.isEmpty() || val <= min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        int pop = stack.pop();

        if(pop == min.peek())
            min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
