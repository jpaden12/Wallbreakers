/* Leetcode #829 Most Common Word
    Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.  
    It is guaranteed there is at least one word that isn't banned, and that the answer is unique.

    Words in the list of banned words are given in lowercase, and free of punctuation.  
    Words in the paragraph are not case sensitive.  The answer is in lowercase.

    45/47 Cases Passed
*/
public String mostCommonWord(String paragraph, String[] banned) {
    paragraph = paragraph.toLowerCase(); 
    TreeMap<String, Integer> frequency = new TreeMap<>(); 
    paragraph = paragraph.replaceAll("\\p{Punct}", "");
    
    String[] words = paragraph.split(" "); 
    for (String word: words) {
        if (!Arrays.asList(banned).contains(word)) {
            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1); 
            } else {
                frequency.put(word, 1); 
            }
        } 
    }

    String greatest = frequency.firstKey();
    Integer greatestValue = frequency.get(greatest); 
    for (String word: frequency.keySet()) {
        if (frequency.get(word) > greatestValue) {
            greatest = word; 
        }
    }
    return greatest; 
    
}