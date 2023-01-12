class MinStack {
    stack : number[];
    minstack : number[];

    constructor() {
      this.stack  = [];
      this.minstack = [];
    }

    push(val: number): void {
      if(!this.stack.length){
        this.minstack.push(val);
    }
    else{
        let min = Math.min(val,this.minstack[this.minstack.length -1])
        this.minstack.push(min)
    }
    this.stack.push(val)
    }

    pop(): void {
      this.stack.pop()
      this.minstack.pop()
    }

    top(): number {
      return this.stack[this.stack.length -1];

    }

    getMin(): number {
      return this.minstack[this.minstack.length -1]

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */