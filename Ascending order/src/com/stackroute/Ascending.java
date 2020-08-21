package com.stackroute;
import java.util.Scanner;
public class Ascending{

    public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
	int a = s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	int d=s.nextInt();
	if(a<b && a<c && a<d){
	    System.out.println(a+" "+b+" "+" "+c+" "+d);
    }if(b<a &&b<c && b<d){
	    System.out.println(b+" "+c+" "+d+" "+a);
        }
	if(c<a && c<b && c<d){
	    System.out.println(c+" "+a+" "+b+" "+d);
    }if(d<a && d<b && d<c){
	    System.out.println(d+" "+a+" "+b+" "+c);
        }

    }
}
