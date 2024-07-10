class increasing_level_triangle{
    public static void main(String args[]){
        int n=4;
        for(int i=0 ; i<n ; i++){
            for(char ch='A'; ch <='A'+i ; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}