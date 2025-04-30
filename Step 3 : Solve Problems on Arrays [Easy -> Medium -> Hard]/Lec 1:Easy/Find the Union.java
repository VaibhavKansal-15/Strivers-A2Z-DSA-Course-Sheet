class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] nums=new int[n+m];
        for(int i=0;i<n;i++){
            nums[i]=nums1[i];
        }

        for(int j=0;j<m;j++){
            nums[n+j]=nums2[j];
        }

        Set<Integer> set=new TreeSet<>();
        for(int x:nums){
            set.add(x);
        }

        int[] result=new int[set.size()];
        int z=0;
        for(int val:set){
            result[z++]=val;
        }
        return result;
    }
}
