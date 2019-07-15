/* Leetcode #860 Lemonade Change
At a lemonade stand, each lemonade costs $5. 

Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).

Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.  
You must provide the correct change to each customer, so that the net transaction is that the customer pays $5.

Note that you don't have any change in hand at first.

Return true if and only if you can provide every customer with correct change.

*/
public boolean lemonadeChange(int[] bills) {
    int fives = 0;
    int tens = 0; 
    for(int i = 0; i < bills.length; i++) {
        if(bills[i] == 5) {
            fives++;
        }
        if(bills[i] == 10) {
            if(fives > 0) {
                fives--;
                tens++;
            } else {
                return false;
            }
        }
        if(bills[i] == 20) {
            if(tens > 0 && fives > 0) {
                fives--;
                tens--;
            } else if(fives > 2) {
                fives = fives - 3;
            } else {
                return false;
            }
        }
    }
    return true;
}