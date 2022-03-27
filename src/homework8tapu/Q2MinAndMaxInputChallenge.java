package homework8tapu;

import java.util.Scanner;

//Read the numbers from the console entered by the user and print the minimum
//        and maximum number the user has entered.
//        -Before the user enters the number, print the message Enter number:
//        -If the user enters an invalid number, break out of the loop and print the minimum and maximum
//        number.
//        Hint:
//        -Use an endless while loop.
//        -Create a class with the name MinAndMaxInputChallenge.
public class Q2MinAndMaxInputChallenge {
    public static void minmax() {
        Scanner scr = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (true) {
            System.out.println("Enter Number : ");
            boolean isAnInt = scr.hasNextInt();//syntax for integer number
            if (isAnInt) {
                int number = scr.nextInt();//store valid number
                if (number > max) {//if number is bigger than last Max number than store in max variable
                    max = number;
                }
                if (number < min) {//if number is smaller than last min number than store in min variable
                    min = number;
                }
            } else {
                System.out.println("Invalid Number  ");
                break;
            }
            scr.nextLine();
        }
        System.out.println("Maximum : = " + max + " and Minimum : = " + min);
        scr.close();
    }

    public static void main(String[] args) {
        minmax();
    }
}