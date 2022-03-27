package homework8tapu;

import java.util.Scanner;

/* First And Last Digit Sum
        Write a method named sumFirstAndLastDigit with one parameter of type int called number.
        The method needs to find the first and the last digit of the parameter number passed to the method,
        using a loop and return the sum of the first and the last digit of that number.
        If the number is negative then the method needs to return -1 to indicate an invalid value.
        Example input/output
        * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
        * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
        * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
        gives us 0+0 and the sum is 0.
        * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
        gives us 5+5 and the sum is 10.
        * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
        NOTE: The method sumFirstAndLastDigit needs to be defined as public static*/
public class Q7FirstLastDigitSum {
    //method to find the sum of first and lastdigit
    public static int sumFirstAndLastDigit(int number) {

        //declare variable
        int lastDigit, firstDigit, divisor;
        int totalDigit = 0;
        int sum = 0;

        //find last digit
        lastDigit = number % 10;

        //find total number of digits
        totalDigit = findDigits(number);

        //calculator divisor value
        divisor = (int) Math.pow(10, totalDigit - 1);

        //find first digit
        firstDigit = number / divisor;

        //add value
        sum = firstDigit + lastDigit;
        return sum;
    }

    //method to find total number of digit
    private static int findDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    //declare main method
    public static void main(String[] args) {

        //declare variable
        int number = 0;
        int sum = 0;

        //create  scanner class object
        Scanner scan = new Scanner(System.in);

        //read input
        System.out.println("Enter an integer number : ");
        number = scan.nextInt();

        //find sum of digit of number
        sum = sumFirstAndLastDigit(number);

        //display result
        System.out.println("The sum of first & last " + "digit of the number" + number + " = " + sum);

        //close scanner class object
        scan.close();

    }
}


