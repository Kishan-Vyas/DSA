package Patterns;

import java.util.Scanner;

// A
// BC
// DEF
// GHIJ
// KLMNO

public class Character {
    public static void main(String[] args) {
        char ch = 'A';
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
