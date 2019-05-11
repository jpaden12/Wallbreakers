/* Leetcode #438 Find all anagrams in String 

    Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

    Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

    The order of output does not matter.

    Passes 34/36 Cases
*/
public List<Integer> findAnagrams(String s, String p) {
    List<Integer> anagrams = new ArrayList<>(); 
    if (s.equals(p)) {
        anagrams.add(0); 
        return anagrams; 
    }
    
    int anagramLength = p.length(); 
    
    HashMap<Character, Integer> frequency = populate(p); 
    for (int i = 0; i < s.length(); i++) {
        if (i + anagramLength <= s.length()) {
            String substring = s.substring(i, i + anagramLength);  
            if (populate(substring).equals(frequency)) {
                anagrams.add(i); 
            }
        }
    }
    return anagrams; 
}
    
private HashMap<Character, Integer> populate(String str) {
    HashMap<Character, Integer> charFrequencies = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
        Character current = str.charAt(i); 
        if (charFrequencies.containsKey(current)) {
            charFrequencies.put(current, charFrequencies.get(current) + 1); 
        } else {
            charFrequencies.put(current, 1); 
        }
    }
    return charFrequencies; 
}