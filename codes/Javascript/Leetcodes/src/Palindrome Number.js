var isPalindrome = function(x) {
    const reverseX  = x.toString().split('').reverse().join('');
   return x == reverseX ? true : false
};