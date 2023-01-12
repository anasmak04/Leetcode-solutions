class MinStack {
        ArrayList <Integer> stack;
        ArrayList <Integer> Minstack;
    public MinStack() {
        stack = new ArrayList <> ();
        Minstack = new ArrayList <> ();
    }
    
    public void push(int val) {
        stack.add(val);

        if(Minstack.isEmpty() || val <= Minstack.get(Minstack.size() -1)){
            Minstack.add(val);
        }


    }
    
    public void pop() {
        int x = stack.remove(stack.size() -1);
        if (x == Minstack.get(Minstack.size() -1)){
            Minstack.remove(Minstack.size() -1);
        }
    }
    
    public int top() {
        return stack.get(Minstack.size() -1);
    }
    
    public int getMin() {
        return Minstack.get(Minstack.size() -1);
    }
}

