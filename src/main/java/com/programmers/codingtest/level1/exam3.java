package com.programmers.codingtest.level1;

import java.util.Scanner;

public class exam3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testNum = sc.nextInt();
        System.out.println("testNum = " + testNum);

        for(int i = 0; i < testNum; i++){

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println("Case #"+(i+1) + ": " + (num1 + num2));
        }

    }
}
