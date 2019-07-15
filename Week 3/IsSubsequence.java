/* Leetcode #392 Is Subsequence
    Given a string s and a string t, check if s is subsequence of t

    10/14 Tests passed
*/
public boolean isSubsequence(String s, String t) {
    if (s.length() == 0) {
        return true; 
    }
    if (t.length() == 0) {
        return false; 
    }
    boolean[][] arr = new boolean[s.length()][t.length()];  
    
    //Fill out first row of table
    for (int i = 0; i < t.length(); i++) {
        if (t.substring(0, i).contains(s.substring(0, 1))) {
            arr[0][i] = true; 
        }
    }
    
    //Fill out rest of table
    for (int i = 1; i < s.length(); i++) {
        for (int j = 1; j < t.length(); j++) {
            
            if (arr[i][j - 1] == true) {
                arr[i][j] = true; 
            } else if (arr[i-1][j-1] == false) {
                arr[i][j] = false; 
            } else if (arr[i-1][j-1] == true) {
                arr[i][j] = s.charAt(i) == t.charAt(j); 
            }
        }
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.println(Arrays.toString(arr[i])); 
    }
    return arr[s.length() - 1][t.length() - 1]; 
}