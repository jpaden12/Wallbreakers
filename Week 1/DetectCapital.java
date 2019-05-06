/* Leetcode #520
    Given a word, you need to judge whether the usage of capitals in it is right or not.

    We define the usage of capitals in a word to be right when one of the following cases holds:

        All letters in this word are capitals, like "USA".
        All letters in this word are not capitals, like "leetcode".
        Only the first letter in this word is capital if it has more than one letter, like "Google".
        Otherwise, we define that this word doesn't use capitals in a right way.
*/
public boolean detectCapitalUse(String word) {
        if (word == null || word.length() == 1) {
            return true;
        } else if (!Character.isUpperCase(word.charAt(0)) && differentCase(word.charAt(1), word.charAt(0))) {
            return false;
        }
        
        for(int i = word.length() - 1; i > 1; i--) {
            if (differentCase(word.charAt(i), word.charAt(i - 1))) {
                System.out.println("Returning false");
                return false;
            }
        }
        return true;
        
    }
    private boolean differentCase(char after, char before) {
        int afterASCII = (int) after;
        int beforeASCII = (int) before;
        if (64 <= afterASCII && afterASCII <= 90) {
            return !(64 <= beforeASCII && beforeASCII <= 90);
        } else if (97 <= afterASCII  && afterASCII <= 122) {
            return !(97 <= beforeASCII && beforeASCII <= 122);
        }
        return true;
        
    }
