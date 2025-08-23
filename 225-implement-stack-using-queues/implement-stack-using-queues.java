class MyStack {
  public Queue<Integer> queue;
public Queue<Integer> queue1;
    public MyStack() {
        queue=new LinkedList<>();
       queue1=new LinkedList<>();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        while(queue.size()>1){
            queue1.add(queue.poll());
        }
        int top=queue.poll();
        Queue<Integer> temp=queue;
        queue=queue1;
        queue1=temp;
        return top;
    }
    
    public int top() {
        while(queue.size()>1){
            queue1.add(queue.poll());
        }
        int top=queue.poll();
        queue1.add(top);
        Queue<Integer> temp=queue;
        queue=queue1;
        queue1=temp;

        return top;
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */