package com.company;

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row : ");
        int row = sc.nextInt();
        System.out.println("Enter the Column : ");
        int column = sc.nextInt();

        System.out.println("Enter the value of matrix 1");
        int[][] array1 = new int[100][100];
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                array1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the value of matrix 2");
        int[][] array2 = new int[100][100];
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                array2[i][j]=sc.nextInt();
            }
        }

        int[][] answer = new int[100][100];
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
               for(int k=0;k<column;k++){
                   answer[i][j] += array1[i][k] * array2[k][j];
               }
            }
        }

        System.out.println("The answer is:");
        for(int i=0;i<row;i++){
            System.out.println();
            for (int j=0;j<column;j++){
                System.out.print(answer[i][j]+" ");
            }
        }
    }
}
