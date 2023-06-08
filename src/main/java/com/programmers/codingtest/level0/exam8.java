package com.programmers.codingtest.level0;

import java.util.Scanner;

public class exam8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder result = new StringBuilder();
        
        if(a.length()>=1 && a.length()<=10){
            for(char c : a.toCharArray())
                System.out.println(c);
        }
    }
}
