class Solution {
    public int removeDuplicates(int[] nums) {
        int count1=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[count1]=nums[i];
                count1++;
            }
        }
        return count1;
    }
}
