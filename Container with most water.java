class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int width=right-left;
            int h=Math.min(height[right],height[left]);
            int area = width*h;
             max=Math.max(max, area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
