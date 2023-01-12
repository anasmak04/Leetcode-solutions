class MinStack {
    
    constructor(){
        this.stack = [];
        this.minstack = [];
    }


    push(element){
        if(!this.stack.length){
            this.minstack.push(element);
        }
        else{
            let min = Math.min(element,this.minstack[this.minstack.length -1])
            this.minstack.push(min)
        }
        this.stack.push(element)
    }


    pop(){
        this.stack.pop()
        this.minstack.pop()
    }


    top(){
        return this.stack[this.stack.length -1];
    }

    getMin(){
        return this.minstack[this.minstack.length -1]
    }

}