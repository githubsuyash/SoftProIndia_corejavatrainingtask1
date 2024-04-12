//WAP to find root of Quadratic Equation ax^2+bx+c=0
import java.util.*;
public class t1{

public static void main (String Args[]){

Scanner sc= new Scanner (System.in);
System.out.println("Enter the coefficent of x^2");
double a= sc.nextDouble();

System.out.println("Enter the coefficent of x");
double b= sc.nextDouble();

System.out.println("Enter the value of c");
double c= sc.nextDouble();

        double firstroot, secondroot;

       
        double det = b * b - 4 * a * c;

        
        if (det > 0) {

            firstroot = (-b + Math.sqrt(det)) / (2 * a);
            secondroot = (-b - Math.sqrt(det)) / (2 * a);

            System.out.format(
                "First Root = %.2f and Second Root = %.2f",
                firstroot, secondroot);
        }

       
        else if (det == 0) {

         
            firstroot = secondroot = -b / (2 * a);

            System.out.format(
                "First Root = Second Root = %.2f;",
                firstroot);
        }

        
        else {

            double real = -b / (2 * a);

            double imaginary = Math.sqrt(-det) / (2 * a);

            System.out.printf("First Root = %.2f+%.2fi",
                              real, imaginary);
            System.out.printf("\nSecond Root = %.2f-%.2fi",
                              real, imaginary);
        }
    }
}