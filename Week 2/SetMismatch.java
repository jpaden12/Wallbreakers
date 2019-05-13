/* Leetcode #645 Set Mismatch
    The set S originally contains numbers from 1 to n. But unfortunately, due to the data error, 
    one of the numbers in the set got duplicated to another number in the set, which results in repetition
    of one number and loss of another number.

    Given an array nums representing the data status of this set after the error.
    Your task is to firstly find the number occurs twice and then find the number 
    that is missing. Return them in the form of an array.
*/

public int[] findErrorNums(int[] nums) {
    int[] numbers = new int[2];
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for (int i = 0; i < nums.length; i++) {
        if (map.keySet().contains(nums[i])) {
            map.put(nums[i], 2);
            numbers[0] = nums[i];
        } else {
            map.put(nums[i], 1);
        }
    }
    
    for (int i = 0; i < nums.length + 1; i++) {
        if (!map.keySet().contains(i)) {
            numbers[1] = i;
        }
    }
    return numbers;  
}
