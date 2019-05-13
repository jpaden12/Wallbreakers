/* Leetcode #290 Word Pattern

    Given a pattern and a string str, find if str follows
    the same pattern.

    Here follow means a full match, such that there is a
    bijection between a letter in pattern and a non-empty word in str.

    Passes 18/33 Cases
*/
public boolean wordPattern(String pattern, String str) {
    if (pattern.equals(str)) {
        return false;
    }
    if (!str.contains(pattern)) {
        return false;
    }
    String originalPattern = pattern;
    String[] arr = str.split(" "); 
    for (int i = 0; i < pattern.length(); i++) {
        str = str.replaceAll(arr[i], pattern.charAt(i) + "");
    }
    str = str.replace(" ",""); 
    return str.equals(originalPattern); 
    
}