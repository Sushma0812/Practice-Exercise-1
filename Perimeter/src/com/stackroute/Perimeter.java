package com.stackroute;

import java.util.Scanner;

public class Perimeter{

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int len =s.nextInt();
        int breadth =s.nextInt();
        int perimeter;
        perimeter=2*(len+breadth);
        System.out.println("Perimeter is"+perimeter);

	// write your code here
    }
}
