class Pass_the_pillow {
    public static int passThePillow(int n, int time) {
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
    public static void main(String args[]){
        System.out.println(passThePillow(4,5));
    }
}
