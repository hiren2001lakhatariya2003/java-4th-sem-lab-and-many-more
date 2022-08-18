package com.company;

public class Lab_6_7 {
    public static void main(String[] args) {
        int a[]={1,4,6,12,3,2};
                for(int i=0;i<a.length;i++)
                {
                    int min=a[i];
                    int minindex= i;
                    for(int j=i+1;j< a.length;j++)
                    {
                        if(min > a[j])
                        {
                            min=a[j];
                            minindex = j;
                        }

                    }
                    if(minindex!=a[i])
                    {
                        a[minindex]=a[i];
                        a[i]=min;
                    }

                }
                for(int temp: a)
                {
                    System.out.print(temp + ", ");
                }
    }
}
