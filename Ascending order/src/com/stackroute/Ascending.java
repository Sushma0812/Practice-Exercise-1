package com.stackroute;
import java.util.Scanner;
public class Ascending{

    public static void main(String[] args) {

    Scanner s =new Scanner(System.in);
	int a = s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	int d=s.nextInt();
	if(a<b && a<c && a<d && b<c && b<d && c<d){
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	if(a<b && a<c && a<d && c<b && c<d && b<d){
		System.out.println(a+" "+c+" "+b+" "+d);


	}
	if(a<b && a<c && a<d && d<c && d<b && c<b){
		System.out.println(a+" "+d+" "+c+" "+b);


	}
	if(a<b && a<c && a<d && b<c && b<d && d<c){
		System.out.println(a+" "+b+" "+d+" "+c);

	}
	if(a<b && a<c && a<d && b<c && d<b && d<c){
		System.out.println(a+" "+d+" "+b+" "+c);


	}
	if(a<b && a<c && a<d && c<d && c<b && d<b){
		System.out.println(a+" "+c+" "+d+" "+b);


	}
	if(b<c && b<d && b<a && c<d && c<a && c<a){
		System.out.println(b+" "+c+" "+d+" "+a);


	}
	if(b<a && a<c && a<d && b<c && b<d && d<c){
		System.out.println(b+" "+a+" "+d+" "+c);


	}
	if(d<a && d<c && c<a && b<c && b<d && b<a){
		System.out.println(b+" "+d+" "+c+" "+a);


	}
	if(d<a && d<c && a<c && b<c && b<a && b<d){
		System.out.println(b+" "+d+" "+a+" "+c);


	}
	if(c<d && a<c && a<d && b<c && b<a && b<d){
		System.out.println(b+" "+a+" "+c+" "+d);


	}
	if(c<d && c<d && a<d && b<c && b<a && b<d){
		System.out.println(b+" "+c+" "+a+" "+d);


	}
	if(c<a && c<b && c<d && d<a && d<b && a<b){
		System.out.println(c+" "+d+" "+a+" "+b);


	}
	if(c<a && c<b && c<d && a<d && a<b && d<b){
		System.out.println(c+" "+a+" "+d+" "+b);


	}
	if(c<a && c<b && c<d && b<a && b<d && a<d){
		System.out.println(c+" "+b+" "+a+" "+d);


	}
	if(c<a && c<b && c<d && b<d && b<a && d<a){
		System.out.println(c+" "+b+" "+d+" "+a);


	}
	if(c<a && c<b && c<d && a<d && a<b && b<d){
		System.out.println(c+" "+a+" "+b+" "+d);


	}
	if(c<a && c<b && c<d && d<b && d<a && b<a){
		System.out.println(c+" "+d+" "+d+" "+a);


	}
	if(d<a && d<b && d<c && b<c && b<a && c<a){
		System.out.println(d+" "+b+" "+c+" "+a);


	}
	if(d<a && d<b && d<c && b<c && b<a && c<a){
		System.out.println(d+" "+a+" "+b+" "+c);

	}
	if(d<a && d<b && d<c && b<a && b<c && a<c){
		System.out.println(d+" "+b+" "+a+" "+c);


	}
	if(d<a && d<b && d<c && c<a && c<b && a<b){
		System.out.println(d+" "+c+" "+a+" "+b);


	}
	if(d<a && d<b && d<c && c<b && c<a && b<a){
		System.out.println(d+" "+c+" "+b+" "+a);


	}
	if(d<a && d<b && d<c && a<b && a<c && c<b){
		System.out.println(d+" "+a+" "+c+" "+b);


	}














	}
}
