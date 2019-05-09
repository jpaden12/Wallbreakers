/* Leetcode #205 Isomorphic Strings
    Given two strings s and t, determine if they are isomorphic.

    Two strings are isomorphic if the characters in s can be replaced to get t.

    All occurrences of a character must be replaced with another character while preserving
    the order of characters. No two characters may map to the same character but a character may map to itself.
    26/30 Cases passed
*/
public boolean isIsomorphic(String s, String t) {
        if (s.equals(t)) {
            return true; 
        }
        if (s.length() != t.length()) {
            return false; 
        }
        if (s == null ^ t == null) {
            return false;
        }
        char[] sArr = s.toCharArray(); 
        Arrays.sort(sArr);  
        
        char[] tArr = t.toCharArray(); 
        Arrays.sort(tArr); 
        
        s = new String(sArr); 
        t = new String(tArr);
        if (s.compareTo(t) == 0) {
            return false; 
        }
        
        HashMap<Character, Integer> string1 = new HashMap<>(); 
        HashMap<Character, Integer> string2 = new HashMap<>(); 
        string1 = populate(s, string1); 
        string2 = populate(t, string2); 
        
        return string1.values().containsAll(string2.values()) &&                            
            string2.values().containsAll(string1.values());    
        
    }
    
    private HashMap<Character, Integer> 
        populate(String str, HashMap<Character, Integer> map) {
        
        for (int i = 0; i < str.length(); i++) {
            if (map.keySet().contains(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1); 
            } else {
                map.put(str.charAt(i), 1); 
            }
        }
        return map; 
    }