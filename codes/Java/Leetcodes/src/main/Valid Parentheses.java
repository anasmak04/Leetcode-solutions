class Solution {
    public boolean isValid(String s) {
            Stack <Character> stack = new Stack <> ();

            for(char c : s.toCharArray()){
                if(c == '(' || c == '[' || c == '{'){
                    stack.push(c);
                }

                else if(c == ')' && !stack.empty() && stack.peek() == '('){
                    stack.pop();
                }

                 else if(c == ']' && !stack.empty() && stack.peek() == '['){
                    stack.pop();
                }

                 else if(c == '}' && !stack.empty() && stack.peek() == '{'){
                    stack.pop();
                }

                else{
                    return false;
                }


            }

            return stack.empty();

    }
}


////////////// differnt implementation using ArrayList collection


class Solution {
    public boolean isValid(String s) {
            ArrayList <Character> list = new ArrayList <> ();

            for(char c : s.toCharArray()){
                if(c == '(' || c == '[' || c == '{'){
                    list.add(c);
                }

                else if(c == ')' && !list.isEmpty() && list.get(list.size() -1) == '('){
                    list.remove(list.size() -1);
                }

                 else if(c == ']' && !list.isEmpty() && list.get(list.size() -1) == '['){
                    list.remove(list.size() -1);
                }

                 else if(c == '}' && !list.isEmpty() && list.get(list.size() -1) == '{'){
                    list.remove(list.size() -1);
                }

                else {
                    return false;
                }
            }

            return list.isEmpty();

    }
}