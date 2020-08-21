package com.stackroute;
import java.util.Scanner;


public class News {

    public static void main(String[] args) {
        GetInput();
        Display();
    }
     static void GetInput()
    {
	Scanner s=new Scanner(System.in);
	int id =s.nextInt();
	String title=s.nextLine();
	String content=s.nextLine();
	String category=s.nextLine();
	String editor=s.nextLine();
    }
    Display(){
        System.out.println("id is"+id);
    }
}
