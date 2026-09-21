class MinStack {
         Stack<Integer> st1 = new Stack<>();
         Stack<Integer> st2 = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        st1.add(value);
        if(st2.isEmpty() || value <= st2.peek())
        st2.add(value);
        else
           st2.add(st2.peek());
    }
    
    public void pop() {
       st1.remove(st1.size() - 1);
       st2.remove(st2.size() - 1);
    }
    
    public int top() {
        return st1.peek();
        
    }
    
    public int getMin() {
      return st2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */