class Solution {
    public void rotateArrayByOne(int[] nums) {
        int n=nums.length;
        if (n == 0) return;
        int[] arr=new int[n];
        for(int i=1;i<=n;i++){
            arr[i-1]=nums[i];
        }
        arr[n-1]=nums[0];
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
    }
}
