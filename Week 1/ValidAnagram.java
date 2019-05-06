/* Leetcode #242
    Given two strings s and t , write a function to determine if t is an anagram of s.
*/
public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
        return false;
    } else if (s.length() == 1 && t.length() == 1 && s.charAt(0) != t.charAt(0)) {
        return false;
    }
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        Character letter = new Character(s.charAt(i));
        if (!map.keySet().contains(letter)) {
            map.put(letter, 1);
        } else {
            map.put(letter, map.get(letter) + 1);
        }
    }
    
    for (int i = 0; i < t.length(); i++) {
        Character otherLetter = new Character(t.charAt(i));
        if (!map.keySet().contains(otherLetter)) {
            return false;
        }
        map.put(otherLetter, map.get(otherLetter) - 1);
    }
    
    for (Character c: map.keySet()) {
        if ((map.get(c)) != 0) {
            return false;
        }
    }
    return true;
    
}