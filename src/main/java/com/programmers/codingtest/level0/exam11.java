package com.programmers.codingtest.level0;

public class exam11 {
    public static void main(String[]args){
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        System.out.println(solution(str1,str2));
    }

    public static String solution(String str1, String str2) {
        String answer = "";
//        for(int i =0; i < str1.length(); i++){
//            System.out.print();
//        }
        answer = str1 + str2;
        System.out.println("answer = " + answer);
        return answer;
    }
}
