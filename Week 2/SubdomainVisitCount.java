/* Leetcode #811 Subdomain Visit Count
    A website domain like "discuss.leetcode.com" consists of various subdomains.
    At the top level, we have "com", at the next level, we have "leetcode.com", 
    and at the lowest level, "discuss.leetcode.com". When we visit a domain like 
    "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and
    "com" implicitly.

    Now, call a "count-paired domain" to be a count (representing the number of 
    visits this domain received), followed by a space, followed by the address. An example 
    of a count-paired domain might be "9001 discuss.leetcode.com".

    We are given a list cpdomains of count-paired domains. We would like a list of 
    count-paired domains, (in the same format as the input, and in any order), that 
    explicitly counts the number of visits to each subdomain.
*/

public List<String> subdomainVisits(String[] cpdomains) {
    Map<String, Integer> visits = new HashMap<>(); 
    for (int i = 0; i < cpdomains.length; i++) {
        String[] numberAndDomain = cpdomains[i].split(" "); 
        
        String[] subdomains = numberAndDomain[1].split("\\."); 
        for (int j = 0; j < subdomains.length; j++) {
            String[] subarray = Arrays.copyOfRange(subdomains, j, subdomains.length);   
            String complete = String.join(".", subarray); 
            if (visits.containsKey(complete)) {
                visits.put(complete, visits.get(complete) + Integer.parseInt(numberAndDomain[0])); 
            } else {
                visits.put(complete, Integer.valueOf(numberAndDomain[0])); 
            }
        } 
    }
    List<String> finalList = new ArrayList<>(); 
    for (String str: visits.keySet()) {
        finalList.add(visits.get(str) + " " + str); 
    }
    return finalList; 
}

