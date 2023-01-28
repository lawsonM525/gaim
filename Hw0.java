package com.gradescope.hw0;

public class Hw0 {

    public static int addAll(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] testArr = {1, 2, 3, 4, 5};
        System.out.println(addAll(testArr));
    }
}
