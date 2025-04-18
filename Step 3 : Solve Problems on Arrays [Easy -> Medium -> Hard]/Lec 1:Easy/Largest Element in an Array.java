class Solution {
    public int largestElement(int[] nums) {
        int n=nums.length;
        int target=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>target){
                target=nums[i];
            }
        }
        return target;
    }
}
