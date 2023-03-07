class MyQueue {
  
    Stack <Integer> st;
    Stack <Integer> st2;
    public MyQueue() {
        st = new Stack <> ();
        st2 = new Stack <> ();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
         if(st2.empty()){
                while(!st.empty()){
                st2.push(st.pop());
            }
        
         }

        return st2.pop();
       
    }
    
    public int peek(){
       if(st2.empty()){
                while(!st.empty()){
                st2.push(st.pop());
        }
       }

        return st2.peek();
    }
    
    public boolean empty() {
        return st.empty() && st2.empty();
    }
}