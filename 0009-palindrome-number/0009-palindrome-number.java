import java.util.Scanner;

class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x;
        int reversed = 0;

        while (x != 0) {
            int rem = x % 10;
            reversed = reversed * 10 + rem;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = in.nextInt();

        if(isPalindrome(a)){
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is Not Palindrome");
        }
        in.close();
    }
}