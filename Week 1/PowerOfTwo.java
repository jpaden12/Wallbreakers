/* Leetcode #231
    Given an integer, write a function to determine if it is a power of two.
*/
public boolean isPowerOfTwo(int n) {
    if (n == 0 || n < 0) {
        return false;
    } else {
        return (n & (n - 1)) == 0;
    }
}