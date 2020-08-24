package com.stackroute;
import java.util.Scanner;
public class Sumofelem{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr1[]=new int[10];
        int arr2[]=new int[10];
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();

        }
        for(int j=0;j<arr2.length;j++){
            arr2[j]=s.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    sum=sum+arr1[i];
                }

            }
        }
        System.out.println("Sum is"+sum);

    }
}
