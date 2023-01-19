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