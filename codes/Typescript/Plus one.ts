function plusOne(digits: number[]): number[] {
    for(let i = digits.length -1 ; i >=0 ; i--){
        if(digits[i] !==0){
            digits[i]+=1;
            return digits;
        }

        else{
            digits[i] = 0;
        }
    }

    return [1,...digits];
};