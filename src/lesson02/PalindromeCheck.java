package lesson02;

//Saed Jaber,ID:208480632
public class PalindromeCheck {
    public static boolean isPalindrome(String word) {
        boolean isPalindrome = true;
        int len = word.length() - 1;
        for (int i = 0; i <= len; i++) {
            if (word.charAt(i) != word.charAt(len - i)) {
                isPalindrome = false;
                break;
            }

        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        System.out.println("Palindrome:" + isPalindrome("abba"));
        System.out.println("Palindrome:" + isPalindrome("kahwfgvjwyervl"));


    }

}
