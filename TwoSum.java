class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        int i = 0;
        int[] temp = new int[2];
        for (int x : nums) {
            map.put(x, i++);
        }
        for (int y = 0; y < nums.length; y++) {
            if (map.containsKey(target - nums[y]) && map.get(target - nums[y]) != y) {
                Integer x = map.get(target - nums[y]);
                temp[0] = x;
                temp[1] = y;
            }
        }
        return temp;
    }
    public static void main(String args[]) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        TwoSum Sum = new TwoSum();
        Sum.twoSum(nums, target);
    }
}
