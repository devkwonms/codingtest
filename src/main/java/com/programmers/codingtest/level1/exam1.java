package com.programmers.codingtest.level1;

import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        System.out.println("두 정수를 입력하세요.");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

        if(a > b){
            System.out.println("A");
        }else if(a < b){
            System.out.println("B");
        }else if(a == b){
            System.out.println("same");
        }

        sc.close();
    }
}
