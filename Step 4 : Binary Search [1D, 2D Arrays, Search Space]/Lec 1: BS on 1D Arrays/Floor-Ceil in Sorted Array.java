class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int[] ans=new int[]{-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=x){
                ans[0]=nums[i];
            }
            if(nums[i]>=x){
                ans[1]=nums[i];
                break;
            }
        }
        return ans;
    }
}
