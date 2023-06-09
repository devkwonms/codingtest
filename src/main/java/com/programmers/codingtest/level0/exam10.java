package com.programmers.codingtest.level0;

public class exam10 {
    public static void main(String[]args){
        String a = "He11oWor1d";
        String b = "lloWorl";
        int c = 2;

        exam10 obj = new exam10();
        obj.solution(a, b, c);
    }
    public String solution(String my_string, String overwrite_string, int s) {
        String result = my_string.substring(0, s)
                + overwrite_string + my_string.substring(s+overwrite_string.length());
        System.out.println("result = " + result);
        return result;
    }
}
