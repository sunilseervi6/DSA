package BasicMath;

class CountDigits{
    public static void count(int n){
        int count =0;
        while(n>0){
            count++;
            n/=10;

        }
        System.out.println("The count of a Number:" + count);

    }
    public static void countOptimized(int n){
        int count = (int)(Math.log10(n)+1);
        System.out.println("The count of a number" + count);
        int k = String.valueOf(n).length();
        System.out.println("The count of a number" + k);


    }
    public static void main(String[] args) {
        int n=1234554;
        count(n);
        countOptimized(n);

    }
}