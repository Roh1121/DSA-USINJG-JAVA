class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
           return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int left=0;
        int right=0;
        int res=0;
        HashSet<Character> fag=new HashSet<>();
        while(right<s.length()){
            char c=s.charAt(right);
            while(fag.contains(c)){
                fag.remove(s.charAt(left));
                left++;
            }
            fag.add(c);
            res=Math.max(res,right-left+1);
            right++;
        }
        return res;
    }
}
