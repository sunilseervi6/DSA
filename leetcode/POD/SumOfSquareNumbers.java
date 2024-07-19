//Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
//No.633
public class SumOfSquareNumbers {
    public static boolean judgeSquareSum(int c) {
        long a = 0;
        long b =(long) Math.sqrt(c);
        while(a<=b){
            long sum = a*a + b*b;
            if(sum == c){
                return true;
            }
            else if(sum<c){
                a++;
            }
            else{
                b--;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int c=5;
        if(judgeSquareSum(c)){
            System.out.println("There are two integers a and b such that a^2 + b^2 =c");
        }
        else{
            System.out.println("No such two integers present");
        }
    }
}