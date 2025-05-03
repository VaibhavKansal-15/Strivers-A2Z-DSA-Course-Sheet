class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }

        int max=1;
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        for(int a:set){
            if(!set.contains(a-1)){
                int count=1;
                int b=a;
                while(set.contains(b+1)){
                    count+=1;
                    b+=1;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}
