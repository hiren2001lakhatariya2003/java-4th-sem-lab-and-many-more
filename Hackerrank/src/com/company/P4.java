/*You are given q queries in the form of a,b and n. For each query, print the series corresponding to the given a,b , and n values as a single line of  space-separated integers.
 */
/*The first line contains an integer q denoting zthe number of queries.
Each line i of the q subsequent lines contains three space-separated integers describing the respective ai,bi , and ni values for that query.*/

/*Sample Input
2
0 2 10
5 3 5*/

/*Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98*/

package com.company;
import java.util.Scanner;
public class P4 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            double a = in.nextInt();
            double b = in.nextInt();
            double n = in.nextInt();
            double sum=0;

            for(int j=0;j<n;j++)
            {

                double sums=(Math.pow(2,j) * b);
                sum+=sums;
                System.out.print(((int)a+(int)sum) + " ");

            }
            System.out.println();
        }
    }    }

