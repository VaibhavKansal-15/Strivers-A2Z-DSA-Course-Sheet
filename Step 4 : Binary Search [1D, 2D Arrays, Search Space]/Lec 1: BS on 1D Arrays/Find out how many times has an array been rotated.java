class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
        int start = 0;
        int end = nums.size() - 1;

        while (start <= end) {
            if (nums.get(start) <= nums.get(end)) {
                return start;
            }

            int mid = start + (end - start) / 2;
            int next = (mid + 1) % nums.size();
            int prev = (mid + nums.size() - 1) % nums.size();

            if (nums.get(mid) <= nums.get(next) && nums.get(mid) <= nums.get(prev)) {
                return mid;
            }

            if (nums.get(mid) >= nums.get(start)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
       return 0;
    }
}
