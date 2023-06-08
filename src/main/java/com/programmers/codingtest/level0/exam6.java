package com.programmers.codingtest.level0;

import java.util.Scanner;

public class exam6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;

        if((a >=1 && a <= 100)&&(b >=1 && b <= 100))
        System.out.println(a+" + "+b+" = "+ c);
    }
}
