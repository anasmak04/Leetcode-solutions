/////// first implementation using arraylist collection

class Solution {
    public String removeDuplicates(String s) {
      ArrayList <Character> mylist = new ArrayList <> ();

      for(char c : s.toCharArray()){
          if(!mylist.isEmpty() &&  mylist.get(mylist.size() - 1) == c){
              mylist.remove(mylist.size() -1);
          }

          else{
              mylist.add(c);
          }
      }

      StringBuilder sb = new StringBuilder();
      for(char str : mylist){
          sb.append(str);
      }

      return sb.toString();


    }

    
}



////////////// Another implementation using built-in stack class


class Solution {
    public String removeDuplicates(String s) {
       Stack <Character> Mystack = new Stack <> ();

        for(char c : s.toCharArray()){
            if(!Mystack.empty() && Mystack.peek() == c){
                Mystack.pop();
            }

            else{
                Mystack.push(c);
            }

        }

        StringBuilder sb = new StringBuilder();

        for(char str : Mystack){
            sb.append(str);
        }

       return  sb.toString();

    }

    
}