package com.javacore;

//Для двох заданих чисел x та n знайти x^n.
public class task5 {

    public static void main(String[] args) {

        int x = 3;
        int n = 5;
        int xn = 1;

        for (int i = 0; i < n; i++){
            xn = x*xn;
            System.out.println("qqq");
        }

        System.out.println(xn);

    }
}
