package homework8tapu;

import java.util.Scanner;

//Even Digit Sum
//        Write a method named getEvenDigitSum with one parameter of type int called number.
//        The method should return the sum of the even digits within the number.
//        If the number is negative, the method should return -1 to indicate an invalid value.
//        EXAMPLE INPUT/OUTPUT:
//        * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
//        * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
//        * getEvenDigitSum(-22); → should return -1 since the number is negative
//        NOTE: The method getEvenDigitSum should be defined as public static
//12. Write a programme to input any number and check if it is prime or no
public class Q11EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int total = 0;
        if (number > 0) {
            while (number != 0) {

                int even = number % 10;

                if (even % 2 == 0) {
                    total += even;
                }
                number /= 10;
            }
            System.out.println("Answer is :  "+ total);
        }else {
            System.out.println("invalid number  -1 ");
        }
        return -1;
    }

    public static void main(String[] args) {
        // user input
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num1 = scr.nextInt();
        getEvenDigitSum(num1);

    }
}
