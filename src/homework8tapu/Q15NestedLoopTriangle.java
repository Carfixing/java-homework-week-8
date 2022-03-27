package homework8tapu;
/* Display left angle triangle of * using nested for loops*/

import java.util.Scanner;

public class Q15NestedLoopTriangle {
    public static void lefttriangle(){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = scr.nextInt();

        for (int i=1;i<=a;i++)//for row
        {
            for (int k=1; k<=a-i+1;k++)//for space
            {
                System.out.print("");
            }
        for(int j=1; j<=i;j++)//for star
        {
            System.out.print("* ");
        }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        lefttriangle();
    }
}
