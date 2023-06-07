package com.programmers.codingtest.level0;

import java.util.Scanner;

public class exam4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요!");
        String str = sc.next();
        String reversed = reverseCase(str);
        System.out.println(reversed);

        // str 길이 변수 선언(초기화)
        int a = str.length();
    }
    public static String reverseCase(String str){
        StringBuilder result = new StringBuilder();
        // 향상된 for문을 사용하여 문자열을 각각의 문자형태의 배열로 받아 문자 갯수 만큼 돌려준다
        for(char c : str.toCharArray()){
            // 각각의 문자가 대문자인지 소문자인지 구분하여 반대로바꿔준후 Stringbuilder 형태의 result에 apend 해주는 조건문
            if(Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            }else if(Character.isUpperCase(c)){
                result.append(Character.toLowerCase(c));
            }else{
                result.append(c);
            }
        }
        return result.toString();
    }
}
