class Solution {
    public int lengthOfLastWord(String s) {
      ArrayList <String> result = new ArrayList <> ();
         String[] split = s.split(" ");

        for(String str : split){
            if(!str.isEmpty()){
                result.add(str);
            }
        }

        return result.get(result.size() - 1).length();  

    }
}


/// Other implementation using stack with peek

class Solution {
    public int lengthOfLastWord(String s) {
     Stack<String> stack = new Stack<>();
        String[]  words = s.split(" ");

        for(String n : words){
            stack.push(n);
        }

        return stack.isEmpty() ? 0 : stack.peek().length();

    }
}


///// Other implementation using stack with pop

class Solution {
    public int lengthOfLastWord(String s) {
     Stack<String> stack = new Stack<>();
        String[]  words = s.split(" ");

        for(String n : words){
            stack.push(n);
        }

        return stack.isEmpty() ? 0 : stack.pop().length();

    }
}