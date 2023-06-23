package com.programmers.codingtest.level0;

public class exam12 {
    public static void main(String[]args){
        String [] animal = {"개","고양이","사슴","토끼","코끼리"};
        String answer = "";
        for(String s : animal){
            answer += s;
        }
        System.out.println("answer = " + answer);
    }
}
