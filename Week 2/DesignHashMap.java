/* Leetcode #706 Design HashMap

    Design a HashMap without using any built-in hash table libraries.

    To be specific, your design should include these functions:

    put(key, value) : Insert a (key, value) pair into the HashMap. 
    If the value already exists in the HashMap, update the value.
    get(key): Returns the value to which the specified key is mapped, or -1 if 
    this map contains no mapping for the key.
    remove(key) : Remove the mapping for the value key if this map contains the 
    mapping for the key.

*/

class MyHashMap {

    /** Initialize your data structure here. */
    public MyHashMap() {
        backingArray = new int[1000000]; 
        Arrays.fill(backingArray, -1); 
    }
    
    int[] backingArray; 
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        backingArray[key] = value; 
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return backingArray[key]; 
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        backingArray[key] = -1; 
    }
}
