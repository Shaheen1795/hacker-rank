import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int NoOfdigits(long i){
        int count = 0 ;
        long j = i ;  
        while((j/10)!=0){
            j = j/10; 
            count+=1 ;
            }
        return(count+1);
  
    }
   static int spt(String s, int d ){
       int pointer = s.length()-1 ;
       String k = s ; 
       while((k.length()!=d)&&(pointer>0)){

           k = s.substring(pointer);
           pointer--;       
       }
       return pointer ; 
   }
    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {
        int l = 0 ; 
        int r = 0 ;  
        int total = 0  ; 
        int flag = -1 ; 
        for(long i=p; i<=q ; i++){
            int d = NoOfdigits(i);
            long number = NoOfdigits(i*i);
            if(number==2*d || number == (2*d-1)){
                if(number==1){
                    if(i==i*i){
                        flag+=1; 
                        System.out.print(i+" ");
                    }
                }
                else if(number==2){
                 String sq = String.valueOf(i*i) ;
                 l = Character.getNumericValue(sq.charAt(0));
                 r = Integer.parseInt(sq.substring(d));
                 total = l+r ; 
                 if(total==i){
                 flag+=1;  
                 System.out.print(i+" ");}
                 }
                 else if(number>2){
                 String sq = String.valueOf(i*i) ;
                 int split = spt(sq,d);
                 if(split>0){
                      l = Integer.parseInt(sq.substring(0,split+1));
                      r = Integer.parseInt(sq.substring(split+1));
                      total = l+r ; 
                     if(total==i){
                     flag+=1;
                     System.out.print(total+" ");}
                 }

                 }
                 
            }
               
        }
        if(flag<0)
         System.out.println("INVALID RANGE");
    }

    
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
