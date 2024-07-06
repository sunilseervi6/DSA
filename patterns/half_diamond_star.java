class half_diamond_star {

    static void apnacode(int n){
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0 ;i<n-1 ;i++){
            for(int j=0 ; j<n-i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void striver(int n){
        //outer loop
        for(int i=1 ; i<2*n-1 ; i++){
            int stars=i;
            if(i>n){
                stars= 2*n-i;
            }
            for(int j=1 ;j<=stars ; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int n=7;
        apnacode(n);
        striver(n);
    }
    
}
