class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] countChar = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
            countChar[s.charAt(i) - 'a']++;
            countChar[t.charAt(i) - 'a']--;
        }

        for(int check : countChar){
            if(check != 0) return false;
        }

        return true;
    }
}