package com.programmers.codingtest.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Metal implements Comparable<Metal> {
    int weight;
    int pricePerWeight;

    public Metal(int weight, int pricePerWeight) {
        this.weight = weight;
        this.pricePerWeight = pricePerWeight;
    }

    @Override
    public int compareTo(Metal o) {
        return Integer.compare(o.pricePerWeight, this.pricePerWeight);
    }
}

public class exam4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int N = scanner.nextInt();

        List<Metal> metals = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int weight = scanner.nextInt();
            int price = scanner.nextInt();
            metals.add(new Metal(weight, price));
        }

        Collections.sort(metals);

        int totalPrice = 0;
        for (Metal metal : metals) {
            int weight = Math.min(W, metal.weight);
            totalPrice += weight * metal.pricePerWeight;
            W -= weight;
            if (W == 0) break;
        }

        System.out.println(totalPrice);
    }
}
