package homework8tapu;

import java.util.Scanner;

/* Write a programme to input any number and check if it is prime or not.
        (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
        prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
        17.... are the prime numbers.)*/
public class Q12PrimeNumber {
    public static void Primenumber() {
        int prime;
        boolean isPrime = true;
        Scanner scr = new Scanner(System.in);//for user input
        System.out.println("Enter any number : ");
        int num = scr.nextInt();//read the input in console

        for (int i = 2; i <= num / 2; i++) {
            prime = num % i;
            if (prime == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) //nif the number is true then print tje number is prime otherwise number is not prime number
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + "is not a Prime Number");
    }

    public static void main(String[] args) {
        Primenumber();
    }
}
