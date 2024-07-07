

public class pass_the_pillow2 {

    public static int passThePillow(int n, int time) {
        int totalRounds = time/(n-1);
        boolean revDir = (totalRounds % 2 != 0);
        if(revDir){
            return n - (time % (n-1));
        }
        else{
            return (time % (n-1))+1;
        }
        
        
    }
    public static void main(String args[]){
        System.out.print(passThePillow(4,5));
    }
}
