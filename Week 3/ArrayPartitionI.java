/*  Leetcode #561 Array Partition I
   Given an array of 2n integers, your task is to group these integers
    into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) 
    which makes sum of min(ai, bi) for all i from 1 to n as large as possible. 

*/
public int arrayPairSum(int[] nums) {
    if (nums.length == 0){
        return 0;
    }
    Arrays.sort(nums);
    int sum = 0;
    for ( int i = 0 ; i < nums.length; i = i + 2 ){
        sum = Math.min(nums[i],nums[i+1]) + sum;
    }
    return sum;
}