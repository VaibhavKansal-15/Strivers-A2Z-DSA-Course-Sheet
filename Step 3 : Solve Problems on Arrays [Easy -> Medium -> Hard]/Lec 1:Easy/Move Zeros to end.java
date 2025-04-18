class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1){
            return;
        }
    
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }

        while(count<nums.length){
            nums[count]=0;
            count++;
        }
    }
}
