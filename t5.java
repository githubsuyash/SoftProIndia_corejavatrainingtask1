//Write a java program to check given number is prime or not.
import java.util.*;
public class t5{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number");
long num =sc.nextLong();
if(num==1)
System.out.println("Not Prime");
int co=0;
for(long i=2;i<num;i++){
if(num%i==0){
co=1;
break;
}}
if(co==1)
System.out.println("Not Prime");
else
System.out.println("Prime");
}
}
