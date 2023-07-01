package com.programmers.codingtest.level0;

public class exam19 {
    public static void main(String[]args){

        String ineq = ">";
        String eq = "=";
        int n = 20;
        int m = 50;

        solution(ineq,eq,n,m);
    }
    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if(ineq.equals("<")){
            if(eq.equals("=")){
                if(n <= m){
                    return 1;
                }else{
                    return 0;
                }
            }else if(eq.equals("!")){
                if(n < m){
                    return 1;
                }else{
                    return 0;
                }
            }
        }else if(ineq.equals(">")){
            if(eq.equals("=")){
                if(n >= m){
                    return 1;
                }else{
                    return 0;
                }
            }else if(eq.equals("!")){
                if(n > m){
                    return 1;
                }else{
                    return 0;
                }
            }
        }
        return answer;
    }
}
