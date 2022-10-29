//Program(27):~ WAP to sort an Array using Counting sort.
package com.company;

import java.util.Scanner;

public class P27Pending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array:");
        int size = sc.nextInt();

        int arrayA[] = new int[size+1];
        int max = 0;
        int flag = 0;
        System.out.println("Enter the values");
        for(int i=1;i<size+1;i++) {

            System.out.print("array["+i+"] : ");
            arrayA[i]=sc.nextInt();
            if(arrayA[i]>max) {
                max=arrayA[i];
            }

        }

        int temp[] = new int[max+1]; //

        for(int i=1;i<max+1;i++) {
            for(int j=1;j<size+1;j++) {
                if(i==arrayA[j])
                    temp[i]++;
            }
            temp[i]+=temp[i-1];

        }
        int arrayB[] =  new int[size+1];
        for(int i=size;i>0;i--) {
            arrayB[temp[arrayA[i]]] = arrayA[i];// main logic for implement the value of array to arrab
            temp[arrayA[i]] = temp[arrayA[i]];
            if (arrayB[i] == 0) {
                flag+=1;
            }
        }

        if(flag>0)
        {
            System.out.print("0 ");
            for(int i =1;i<size;i++)
            {
                System.out.print(arrayB[i]+" ");
            }
        }
        else
        {
            for(int i =1;i<size+1;i++)
            {
                System.out.print(arrayB[i]+" ");
            }
        }

    }
}
