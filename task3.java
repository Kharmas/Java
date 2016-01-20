package com.javacore;

//Для заданого числа знайти n!.
public class task3 {

    public static void main(String[] args) {


        int n = 1;


        for (int i =1; i <= 5; i++){

            n = i*n;
            System.out.println(i);
            System.out.println("!n = " + n);
        }

    }

}
