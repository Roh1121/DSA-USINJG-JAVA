class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        String first,last;
        first=strs[0];
        last=strs[n-1];
        String prefix = "";
        for(int i=0;i<first.length();i++)
        {
            if(first.charAt(i)==last.charAt(i))
            {
                prefix=prefix+first.charAt(i);
            }
            else
            {
                break;
            }
        }
        return prefix;
    }
}
