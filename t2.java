//WAP to calculate electricity bill

import java.util.*;

public class t2{

public static void main(String args[]){

Scanner sc= new Scanner(System.in);

System.out.println("Enter the total units of bill");

double bill= sc.nextDouble();

if(bill<=150)
System.out.println("The total bill is " + bill*2.4);
else if (bill>150 && bill<=300) 
System.out.println("The total bill is "+ bill*3.00);
else
System.out.println("The total bill is "+ bill*3.20);

}
}