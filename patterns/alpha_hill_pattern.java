class alpha_hill_pattern{
    public static void main(String args[]){
        int N=5;
        for(int i=0;i<N;i++){
          
          // for printing the spaces.
          for(int j=0;j<N-i-1;j++){
              System.out.print(" ");
          }
          
          // for printing the characters.
          char ch = 'A';
          int breakpoint = (2*i+1)/2;
          for(int j=1;j<=2*i+1;j++){
              
              System.out.print(ch);
              if(j <= breakpoint) ch++;
              else ch--;
            }
          
          // for printing the spaces again.
          for(int j=0;j<N-i-1;j++){
              System.out.print(" ");
            }
          
          System.out.println();
        }
    }
}