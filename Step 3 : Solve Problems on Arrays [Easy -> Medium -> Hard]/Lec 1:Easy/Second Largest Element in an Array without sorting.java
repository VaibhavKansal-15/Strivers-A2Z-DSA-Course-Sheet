class Solution {
    public int secondLargestElement(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        if(set.size()<2){
            return -1;
        }

        int max=Collections.max(set);
        set.remove(max);

        return Collections.max(set);
    }
}
