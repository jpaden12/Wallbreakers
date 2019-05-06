/* Leetcode #416
    The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

    Given two integers x and y, calculate the Hamming distance.
*/
public int hammingDistance(int x, int y) {
    int different = 0;
    while (x > 0 || y > 0) {
        if (((x ^ y) & 1) == 1) {
            different++;
        }
        x = x >> 1;
        y = y >> 1;
    }
    return different;
}