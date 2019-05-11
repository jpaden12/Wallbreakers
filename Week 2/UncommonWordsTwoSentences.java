/* Leetcode #884
    We are given two sentences A and B.  (A sentence is a string of space separated words.  
    Each word consists only of lowercase letters.)

    A word is uncommon if it appears exactly once in one of the sentences, 
    and does not appear in the other sentence.

    Return a list of all uncommon words. 

    You may return the list in any order.
*/

public String[] uncommonFromSentences(String A, String B) {
        List<String> uncommon = new ArrayList<>(); 
        
        
        String[] sentenceA = A.split(" ");
        Arrays.sort(sentenceA); 
        Map<String, Integer> mapA = new HashMap<>(); 
        
        String[] sentenceB = B.split(" ");
        Arrays.sort(sentenceB); 
        Map<String, Integer> mapB = new HashMap<>(); 
        
        for (String str: sentenceA) {
            if (mapA.containsKey(str)) {
                mapA.put(str, mapA.get(str) + 1); 
            } else {
                mapA.put(str, 1); 
            }
        }
        
        for (String str: sentenceB) {
            if (mapB.containsKey(str)) {
                mapB.put(str, mapB.get(str) + 1); 
            } else {
                mapB.put(str, 1); 
            }
        }
        
        for (String str: mapA.keySet()) {
            if (mapA.get(str) == 1 && !mapB.containsKey(str)) {
                uncommon.add(str); 
            }
        }
        
        for (String str: mapB.keySet()) {
            if (mapB.get(str) == 1 && !mapA.containsKey(str)) {
                uncommon.add(str); 
            }
        }
        
        return uncommon.toArray(new String[uncommon.size()]); 