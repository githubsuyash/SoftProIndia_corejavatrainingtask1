
// Write a java program to convert binary number to its decimal equivalent

import java.util.*;
public class t4{
public static void main(String args[]){

Scanner sc= new Scanner(System.in);
System.out.println("Enter the Binary number");

long num= sc.nextLong();

   long i = 0,ans =0, rem=0;
        while (num != 0) {
 
   	
            rem = num % 10;
// for invalid check
if(rem>1){
ans=0;
System.out.println("Enter the valid binary number");
break;
}
else{
            num /= 10;
 
            ans += rem * Math.pow(2, i);
            i++;
 }       }
 
        System.out.println("Decimal Equivalent of number is " + ans);
    


}
}
