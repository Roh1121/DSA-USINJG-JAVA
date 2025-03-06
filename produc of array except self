class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans= new int[nums.length];
        Arrays.fill(ans,1);
        int pre=1,pos=1;
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=pre;
            pre=nums[i]*pre;
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            ans[i]=ans[i]*pos;
            pos=nums[i]*pos;
        }
        return ans;
    }
}
