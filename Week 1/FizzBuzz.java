/* Leetcode #412
    Write a program that outputs the string representation of numbers from 1 to n.

    But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
    For numbers which are multiples of both three and five output “FizzBuzz”.
*/
public List<String> fizzBuzz(int n) {
    ArrayList<String> list = new ArrayList<>();
    for (int i = 1; i < n + 1; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            list.add("FizzBuzz");
        } else if (i % 3 == 0) {
            list.add("Fizz");
        } else if (i % 5 == 0) {
            list.add("Buzz");
        } else {
            list.add("" + i);
        }
    }
    return list;
}