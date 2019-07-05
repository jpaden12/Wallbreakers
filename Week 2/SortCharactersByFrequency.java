/* Leetcode #451 Sort Characters By Frequency

Given a string, sort it in decreasing order based on the frequency of characters.

34/35 Test Cases Passed
*/
public String frequencySort(String s) {
    Map<Character, Integer> frequencies = new HashMap<>(); 
    
    for (int i = 0; i < s.length(); i++) {
        if (frequencies.containsKey(new Character(s.charAt(i)))) {
            frequencies.put(s.charAt(i), frequencies.get(s.charAt(i)) + 1); 
        } else {
            frequencies.put(s.charAt(i), 1); 
        }
    } 
    
    Character[] stringArray = s.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
    
    Arrays.sort(stringArray, new Comparator<Character>() {
        @Override
        public int compare(Character c1, Character c2) {
            Character a = c1; 
            if (frequencies.get(c1) < frequencies.get(c2)) {
                return 1; 
            } else if (frequencies.get(c1) == frequencies.get(c2)){
                return c1.compareTo(c2);
            } else {
                return -1;
            }
        }
    });
    
    return Arrays.stream(stringArray).map(Object::toString).collect(Collectors.joining());
    
}