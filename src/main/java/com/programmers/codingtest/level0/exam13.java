package com.programmers.codingtest.level0;

public class exam13 {
    public static void main(String[]args){
        String my_string = "string";
        int k = 3;
        solution(my_string,k);
        
    }
    public static String solution(String my_string, int k) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < k; i++){
            answer.append(my_string);
        }
        System.out.println("answer = " + answer);
        return answer.toString();
    }
}
