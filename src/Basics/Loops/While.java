package Basics.Loops;

public class While {
    public static void main(String[] args) {
    int i = 1;
    while(i<=10){
        System.out.print(i*i+" ");
        i++;
    }

    System.out.println();
   // fabonacci(7);
   // Reverse(232);
   Arstrome(10);
}

// fabonacci Series 
     public static void fabonacci(int n ) {
          int a = 0 ; int b = 1 ,c;
          int i = 0;
          System.out.print(a+"\t"+b+"\t");
          while (i<=n) {
             c = a+b ;
             System.out.print(c+"\t");
             a= b ;
             b = c ;
             i++;
          }
     }



    // Reverse A Number  && Pallindrom Number
    public static void Reverse(int n){
        int sum = 0 ,r ;
        int temp = n ;
        while(n!=0){
            r = n%10;
            sum = sum*10 + r ;
            n = n/10;
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println("Pallindrome Number");
        }else{
            System.out.println("Not A Pallindreom Number");
        }

    }
   //  Arstrome Number 
   public static void Arstrome(int i){
   for(int k = 0 ;k < 10 ; k++ ){
    int n=k;
    int sum = 0 , r;
    int temp = n;
    while (n!=0) {
         r = n%10;
         sum += (r*r*r);
         n = n/10;
    }
    if(temp==sum){
      System.out.print(temp+"\t");

   }
}

 }

}


