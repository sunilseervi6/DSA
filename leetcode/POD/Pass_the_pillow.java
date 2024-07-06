public class Pass_the_pillow {
    public int passThePillow(int n, int time) {
        int currentTime=0;
        int pillowPosition=1;
        boolean revDirection = false;
        while(currentTime < time){
            if(!revDirection){
                pillowPosition++;

            }
            else{
                pillowPosition--;
            }
            if(pillowPosition == 1 || pillowPosition == n){
                revDirection =! revDirection;
            }
            currentTime++;
        } 
        return pillowPosition;
        
    }
}
