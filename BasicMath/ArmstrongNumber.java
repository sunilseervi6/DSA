package BasicMath;


//An Amrstrong number is a number that is equal to the sum of its own digits 
//each raised to the power of the number of digits.
class ArmstrongNumber{
    public static boolean isArmstrong(int n){
        //no. of digits of n
        int num=n;
        int k=(int)(Math.log10(num)+1);
        //int k = String.valueOf(num).length();
        int sum = 0;
        while(num>0){
            int lastDigit = num%10;
            sum += Math.pow(lastDigit , k);
            num=num/10;
        }
        return sum == n ? true :false;
    }
    public static void main(String[] args) {
        int n =153;
        if(isArmstrong(n)){
            System.out.println("It is an Armstrong number");
        }
        else{
            System.out.println("It is not an Armstrong number");
        }
    }
}