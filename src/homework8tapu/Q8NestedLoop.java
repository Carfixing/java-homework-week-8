package homework8tapu;

/* Display right angle triangle of @ using nested for loops
        @
        @@
        @@@
        @@@@
        @@@@@*/
public class Q8NestedLoop {

    public static void righttriangle() {
        int i, j, row = 5;

        for (i = 0; i < row; i++) //outer loop for number of rows
        {
            for (j = 0; j <= i; j++) //  inner loop for columns
            {
                System.out.print("@"); // print star
            }
            System.out.println(); // ending line after each row
        }
    }

    public static void main(String args[]) {
        righttriangle();
    }
}





