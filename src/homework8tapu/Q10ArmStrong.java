package homework8tapu;


import java.util.Scanner;

/*Write a program to input any number and check if it Armstrong number or not
* 153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153*/
public class Q10ArmStrong {
    public static void armstrongno() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scr.nextInt();
        int ori, remainder, result = 0;
        ori = num;
        while (ori != 0) {
            remainder = ori % 10;
            result += Math.pow(remainder, 3);
            ori /= 10;
        }
        if (result == num)
            System.out.println(num + "is an Armstrong number ");
        else
            System.out.println(num + " is not an Armstrong number ");
    }

    public static void main(String[] args) {
        armstrongno();
    }
}
