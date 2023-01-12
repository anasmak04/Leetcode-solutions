function search(nums: number[], target: number): number {

    for(let i = 0 ; i < nums.length ; i++){
        if(nums[i] == target){
            return i;
        }
    }

    return -1;
};