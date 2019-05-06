/* Leetcode #136
    Given a non-empty array of integers, every element appears twice except for one. Find that single one.
*/
public int singleNumber(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        if (!map.keySet().contains(nums[i])) {
            map.put(nums[i], 1);
        } else {
            map.put(nums[i], 2);
        }
    }
    for (int i = 0; i < nums.length; i++) {
        if (map.get(nums[i]) == 1) {
            return nums[i];
        }
    }
    return 0;