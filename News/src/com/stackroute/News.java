package com.stackroute;
import java.util.Scanner;


public class News {
    public static int id;
    public static String title;
    public static String content;
    public static String category;
    public static String editor;

    public static void main(String[] args) {
        GetInput();
        Display();

    }
     static void GetInput()
    {
	Scanner s=new Scanner(System.in);
	id =s.nextInt();
	 title=s.nextLine();
	 content=s.nextLine();
	 category=s.nextLine();
	 editor=s.nextLine();
    }
    static void Display(){

        System.out.println("id is" +id);
        System.out.println("Title is" +title);
        System.out.println("Content is" +content);
        System.out.println("Category is" +category);
        System.out.println("Editor is" +editor);




    }
}
