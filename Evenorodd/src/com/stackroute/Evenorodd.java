package com.stackroute;
import java.util.Scanner;
public class Evenorodd{

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
	int num;
	System.out.println("Enter a number");
	num=s.nextInt();
	if(num%2==0){
	    System.out.println("Given number is even");
    }
	else{
	    System.out.println("Given number is odd");
    }
    }
}
