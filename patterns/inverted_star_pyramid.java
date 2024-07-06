class inverted_star_pyramid {
    static void apnacode(int n){
        for(int i=n ; i>0 ; i--){
            //for spaces
            for(int j=n ; j>i ; j --){
                System.out.print(" ");
            }
            //for stars
            for(int j=1 ; j<=2*i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();


        }
    }

    static void striver(int n){
        for (int i = 0; i < n; i++)
        {
        // For printing the spaces before stars in each row
            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }
       
        // For printing the stars in each row
            for(int j=0;j< 2*n -(2*i +1);j++){
            
                System.out.print("*");
            }
        
        // For printing the spaces after the stars in each row
            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }
       

        // As soon as the stars for each iteration are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        apnacode(n);
        striver(n);
        
    }
}
