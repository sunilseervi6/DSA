package BasicMath;

public class PalindromeNumber {
    public static boolean isPalindrome(int n){
        int reverse = 0;
        int num=n;
        while(n>0){
            int lastDigit = num%10;
            reverse = (reverse*10)+lastDigit;
            num/=10;
        }
        if(reverse == n){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        int n=1221;
        if(isPalindrome(n)){
        
            System.out.println("Its is a Palimdrome number");
        }
        else{
            System.out.println("It is not a Palindrome number");
        }
    }
}
