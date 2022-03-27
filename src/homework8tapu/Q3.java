package homework8tapu;
// Write a Java program that takes the user to provide a single character from the
//         alphabet. Print Vowel of Consonant, depending on the user input. If the user input
//         Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
//         error message.
//         For eg:
//         Input an alphabet: p
//         Expected Output:
//         Input letter is Consonant

import java.util.Scanner;

public class Q3 {
    public static void vowel() {
        int i = 0;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = scr.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                i++;
        }
        if (i == 1)

            System.out.println("Enter character " + ch + " is vowel");
        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("Entered character " + ch + " is consonent");
        else
            System.out.println("Not an alphabet");
    }

    public static void main(String[] args) {
        vowel();
    }
}
