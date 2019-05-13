/* Leetcode #575 Distribute Candies
Given an integer array with even length, where different numbers 
in this array represent different kinds of candies. 
Each number means one candy of the corresponding kind.
You need to distribute these candies equally in number to brother and sister. 
 
Return the maximum number of kinds of candies the sister could gain.


*/
public int distributeCandies(int[] candies) {
    HashSet<Integer> candySet = new HashSet<>();
    for (int i: candies) {
        candyset.add(i);
    }
    return Math.min(candySet.size(), candies.length / 2);
}