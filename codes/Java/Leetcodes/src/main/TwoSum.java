class Solution {
    public int[] twoSum(int[] nums, int target) {
        
      Map <Integer,Integer> complements = new HashMap <> ();

      for(int i = 0 ; i < nums.length ; i++){
          Integer complementsIndex = complements.get(nums[i]);
          if(complementsIndex != null){
              return new int[] {i, complementsIndex};
          }

          complements.put(target - nums[i], i);
      }

    return nums;
    }
}