class Solution {
    public int singleNumber(int[] nums) {
        
        Set <Integer> single = new HashSet <> ();
        for(int i : nums){
            if(!single.contains(i)){
                single.add(i);
            }

            else{
                single.remove(i);
            }
        }

        for(int result : single){
            return result;
        }
    
        return -1;
    }   
}
