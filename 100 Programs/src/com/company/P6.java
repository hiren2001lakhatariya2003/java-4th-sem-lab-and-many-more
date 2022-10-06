/* Program(6):~
Print a following pattern
1
1 2
1 2 3
1 2 3 4
*/
package com.company;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        for (int i=1;i<=number;i++) { //Row
            for (int j=1;j<=i;j++) { //Column
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
}
