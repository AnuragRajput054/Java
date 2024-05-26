package BackTracking;



class MazzProblem {
    public static void main(String[] args){
          System.out.println("Hello World");
          System.out.println(count(3,3));
         // path("", 3, 3);

        boolean[][] board = {
          {true , true, true},
          {true , false , true},
          {true , true, true},
        };
          pathWithAbstaction("", board, 0, 0);

    }
    // This Will return all the path from sourch to the destination. 
    static int count(int r, int c){
         if(r==1 || c==1){
              return 1 ;
         }
         int left = count(r-1,c);
         int right = count(r,c-1);
         return left+right;
    }
      // path with Diagonals 
    static void path(String p , int r , int c){
       
       if(r==1 && c==1){
               System.out.println(p);
               return;
       }
       if (r>1 && c > 1) {
             path(p+'D', r - 1, c -1 );
       }
       if (r>1) {
          path(p+'V', r-1, c);
       }
       if (c>1) {
            path(p+'H', r, c-1);
       }

    }

    //Mazz Problem with Abstraction 

    static void pathWithAbstaction(String p , boolean[][] mazz ,int r , int c ){

            if(r== mazz.length-1 && c==mazz[0].length-1){
               System.out.println(p+"");
               return;
            }
           if (!mazz[r][c]) return;
           
         
            if(r<mazz.length-1){
               pathWithAbstaction( p+ "D",mazz, r+1, c);
            }
            if (c<mazz[0].length-1 ) {
                pathWithAbstaction(p+"R",mazz,  r, c+1);
            }

    }


   
}