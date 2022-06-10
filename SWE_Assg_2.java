import java.util.Scanner;

import static java.lang.Math.abs;

public class SWE_Assg_2
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value :"); // this is for a value of polynomial
        int aValue = input.nextInt();
        System.out.println("Please enter b value :"); // this is for b value of polynomial
        int bValue = input.nextInt();
        System.out.println("Please enter c value :");// this is for c value of polynomial
        int cValue = input.nextInt();
        System.out.println("Please enter d value :"); //this is for d value of polynomial
        int dValue = input.nextInt();
        System.out.println("Please enter Delta value :"); //this is for Delta value
        double deltaValue = input.nextDouble();
        System.out.println("Please enter first point value :"); //this is for first point of range that we will calculate
        double x1 = input.nextDouble();
        System.out.println("Please enter second point value :"); // this is for second point of range that we will calculate
        double x2 = input.nextDouble();

        //this if is to prevent entering bigger delta value that range that user enter
        if (deltaValue > abs(x1 - x2)) {
            System.out.println("Delta value have to be smaller than " + abs(x1 - x2));
        }
        else {


            Polynomial p = new Polynomial(aValue, bValue, cValue, dValue); //polynomial constructer
            p.setDeltaX(deltaValue); // setting delta value
            double sum; //this is sum of area of rectangle that created with using delta value and function value
            sum = p.computeIntegral(x1, x2); // calling computeIntegral method
            System.out.println("Integral of " + x1 + " and " + x2 + " is : " + sum);
        }
    }
}
