package com.stackroute;
import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        float f,c;
        int n;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        System.out.println("S.No"+"     "+"Temperature(Celsius)"+"     "+"Temperature(Fahrenheit)");
        for(int i=1;i<=n;i++){
            c=s.nextInt();
            f=(((c*9)/5))+32;
            System.out.println(i+"     "+c+"     "+f);
        }

    }
}
