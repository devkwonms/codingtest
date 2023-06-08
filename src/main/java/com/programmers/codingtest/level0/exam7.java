package com.programmers.codingtest.level0;

import java.util.Scanner;

public class exam7 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();

        String str2 = sc.next();
        
        StringBuilder result = new StringBuilder();

        // 입력하는 문자열 변수의 길이 제한 조건문 설정
        if((str1.length()>=1 &&str1.length() <=10) &&(str2.length()>=1 &&str2.length() <=10)){
            // 향상된 for문을 통해 미리 공백을 제거시킨 각각의 문자 하나하나를 배열형태로 담아낸 뒤 StringBuilder 자료형의 변수에 append 하여 결과추출
            for(char c : (str1+str2).trim().toCharArray()){
                result.append(c);
            }
            System.out.println(result);
        }


    }
}
