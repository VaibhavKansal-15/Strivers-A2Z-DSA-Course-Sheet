import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int max=nums[nums.length-1];
        list.add(max);
        for(int i=nums.length-2;i>=0;i--){
            if(max<nums[i]){
                max=nums[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
