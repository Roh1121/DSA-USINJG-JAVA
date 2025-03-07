class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> res =new ArrayList<>();
       for(int i=0;i<nums.length && nums[i]<=0;i++){
           if(i==0 || nums[i]!=nums[i-1]){
            twoSum2(nums,i,res);
           }
       }
       return res;
    }
    void twoSum2(int[] nums,int i,List<List<Integer>> res){
        int left=i+1;
        int right=nums.length-1;

        while(left<right)
        {
            int tar = nums[i] + nums[left] + nums[right];
            if(tar<0){
                left++;
            }
            else if(tar>0){
                right--;
            }
            else{
                res.add(Arrays.asList(nums[i],nums[left++],nums[right--]));
                while(left<right && nums[left]==nums[left-1])
                left++; 
            }
        }
    }
}
