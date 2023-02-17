/* 
    Jacob Stephens - CSC 229
    Dr. Al Seesi   - February 13, 2023
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Take user input
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter nth degree of fibonacci sequence: ");
        int n = scnr.nextInt();
        scnr.close();

        // if n is not a positive integer
        if (n <= 0) {
            System.out.printf("Error: %d is not a positive integer.", n);
        }

        // valid input; calc fibonacci
        else {
            int int1 = 0;
            int int2 = 1;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                // exception case with nth degree 1
                if (n == 1) {
                    sum = 1;
                }
                // all other positive integer nth degrees
                else {
                    sum = int1 + int2;
                    int2 = int1;
                    int1 = sum;
                }
            }
            System.out.printf("Fibonacci Sum of %d is %d.", n, sum);

        }
    }
}