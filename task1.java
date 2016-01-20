package com.javacore;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class task1 {

    public static void main(String[] args){

        // Для заданої послідовності чисел знайти максимальне від’ємне число.

        int x = 55;
        int x1 = 35;
        int x2 = -115;
        int x3 = -65;
        int x4 = -22;
        int numm[] = new int[5];
        int max = 0;
        int maxV = 0;

        for (int i=0; i < 5; i++) {

            if (x > max) {

            } else numm[0] = x;
            if (x1 > max) {

            } else numm[1] = x1;
            if (x2 > max) {

            } else numm[2] = x2;
            if (x3 > max) {

            } else numm[3] = x3;
            if (x4 > max) {

            } else numm[4] = x4;

        }

        for (int i=0; i < 5; i++){
            System.out.println(numm[i]);
        }

        for (int i = 0; i < 5; i++){
            if (numm[i] < maxV&& numm[i] < 0 ){
                maxV = numm[i];
            }
        }

        System.out.println("maxV = " + maxV );











    }

}
