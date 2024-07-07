
class waterBottles{
    public static int numWaterBottles(int numBottles , int numExchange){
        int drank = numBottles;
        while(numBottles>=numExchange){
            int exchange = numBottles/ numExchange;
            int extraEmpty = numBottles % numExchange;
            drank+=exchange;
            numBottles = exchange + extraEmpty;
        }
        return drank;
    }
    public static void main(String[] args) {
        int numBottles = 15;
        int numExchange = 4;
        System.out.println(numWaterBottles(numBottles , numExchange));
    }
}