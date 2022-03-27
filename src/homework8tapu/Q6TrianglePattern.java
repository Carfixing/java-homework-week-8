package homework8tapu;

import java.util.Scanner;

//Write a program in Java to display the pattern like a triangle with a number.
//        For eg.
//        Input number of rows: 10
//        Expected Output:
//        1
//        12
//        123
//        1234
//        12345
//        123456
//        1234567
//        12345678
//        123456789
//        12345678910
public class Q6TrianglePattern {

    public static void trianglenumber() {
        int i, j, r;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number of lines :  ");
        r = scr.nextInt();
        for (i = 1; i <= r; i++)//outer loop for number of row
        {
            for (j = 1; j <= i; j++)//inner loop for number of colum
            {
                System.out.print(j);
            }
            System.out.println("");//ending line after each row
        }
    }

    public static void main(String args[]) {
        trianglenumber();

    }
}
