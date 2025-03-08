class Solution {
    public int characterReplacement(String s, int k) {
        int[] occ = new int[26];
        int left=0;
        int res=0;
        int max=0;
         for(int right=0;right<s.length();right++){
            max=Math.max(max, ++occ[s.charAt(right) -'A']);
            if(right - left + 1 -max > k){
              occ[s.charAt(left) -'A']--;
             left++;
            }
             res=Math.max(res, right-left+1);
         }
        return res;
    }
}
