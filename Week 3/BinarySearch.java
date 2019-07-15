/* Leetcode #704
    Given a sorted (in ascending order) integer array nums of n elements and a target value,
    write a function to search target in nums. If target exists, then return its index, otherwise return -1.

*/
public int search(int[] nums, int target) {
    return search(nums, target, 0, nums.length - 1);
}

private int search(int[] nums, int target, int low, int high) {
    if (low > high) {
        return -1;
    } 
    int mid = (low + high) / 2;
    if (nums[mid] == target) {
        return mid;
    } else if (nums[mid] > target) {
        return search(nums, target, low, mid - 1);
    } else {
        return search(nums, target, mid + 1, high);
    }
}