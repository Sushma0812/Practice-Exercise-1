package com.stackroute;

import java.util.Scanner;

public class Averagee{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size");

        int size = s.nextInt();
        int array[] = new int[size];
        int sum=0;
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            array[i]=s.nextInt();
            sum=sum+array[i];
        }int avg =sum/size;
        System.out.println("Average of array elements is"+avg);
    }
}
