package com.stackroute;
import java.util.Scanner;
public class Consecutive {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int flag=0;
        int arr1[] = new int[4];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        for(int i=0;i<arr1.length-1;i++){
                if(arr1[i]==(arr1[i+1])-1){
                    flag=0;
                }
                else{
                    flag=1;
                }
        }
        if(flag==0){
            System.out.println("Given numbers are consecutive");
        }
        else{
            System.out.println("Given numbers are not consecutive");
        }

    }
}
