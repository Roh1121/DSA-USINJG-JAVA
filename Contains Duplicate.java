class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seennums = new HashSet<>();
        for(int num:nums)
        {
            if(seennums.contains(num))
            {
                return true;
            }
            seennums.add(num);
        }
        return false;
    }
}
