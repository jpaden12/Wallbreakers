/* Leetcode #860 Lemonade Change #2
At a lemonade stand, each lemonade costs $5. 

Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).

Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.  
You must provide the correct change to each customer, so that the net transaction is that the customer pays $5.

Note that you don't have any change in hand at first.

Return true if and only if you can provide every customer with correct change.

*/
public boolean lemonadeChange(int[] bills) {
    List<Integer> billsList = Arrays.stream(bills).boxed().collect(Collectors.toList());
    List<Integer> changeNeeded = new ArrayList<>(bills.length); 
    Collections.sort(billsList, Collections.reverseOrder()); 
    for (Integer i: billsList) {
        if (i != 5) {
            changeNeeded.add(i - 5); 
        }
    }
    for (Integer amount: changeNeeded) {
        boolean changeMade = false;
        Integer index = 0; 
        while (!changeMade) {
            if (index > billsList.size() - 1) {
                return false; 
            }
            Integer currentBill = billsList.get(index); 
            if (currentBill > amount) {
                index += 1; 
            } else if (currentBill == amount) {
                changeMade = true; 
                billsList.remove(currentBill);
                amount = 0; 
                break; 
            } else {
                amount = amount - currentBill; 
                billsList.remove(currentBill); 
            }
        }
    }
    return true; 
    
}
