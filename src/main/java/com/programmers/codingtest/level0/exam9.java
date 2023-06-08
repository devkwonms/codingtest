package com.programmers.codingtest.level0;

import java.util.Scanner;

public class exam9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        if (n >= 1 && n <= 1000) {
//            if (n % 2 == 0) {
//                System.out.println(n + " is even");
//            } else if (n % 2 == 1) {
//                System.out.println(n + " is odd");
//
//            }
//        }
        System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd"));
    }

}
