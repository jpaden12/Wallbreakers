/* Leetcode #705 Design HashSet

    Design a HashSet without using any built-in hash table libraries.
    To be specific, your design should include these functions:

    add(value): Insert a value into the HashSet. 
    contains(value) : Return whether the value exists in the HashSet or not.
    remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.
*/
class MyHashSet {

    /** Initialize your data structure here. */
    public MyHashSet() {
        backingArray = new int[1000000]; 
        Arrays.fill(backingArray, -1); 
        
    }
    int[] backingArray; 
    public void add(int key) {
        backingArray[key] = key; 
    }
    
    public void remove(int key) {
        backingArray[key] = -1; 
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return backingArray[key] != -1; 
    }
}