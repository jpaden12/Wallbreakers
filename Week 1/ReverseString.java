/* Leetcode #344
    Write a function that reverses a string. The input string is given as an array of characters char[].
*/
public String reverseString(String s) {
    String newString = "";
    if (s.length() == 0) {
        return newString;
    }
    else {
        char lastOne = s.charAt(0);
        for (int i = s.length() - 1; i > 0; i--) {
            newString += s.charAt(i);
        }
        newString += lastOne;
        return newString;
    }
    
}