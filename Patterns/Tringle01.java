package Patterns;

import java.util.Scanner;

// 0
// 10
// 010
// 1010

public class Tringle01 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print((i+j)%2);
            }
            System.out.println();
        }
    }
}