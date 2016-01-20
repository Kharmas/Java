package com.javacore;

//Для заданого масиву просумувати всі додатні числа, від’ємні - перемножити
public class task2 {

    public static void main(String[] args) {


        int[] mas = {10,-2,7,-6};
        int sum = 0;
        int mno = 1;

        for (int i = 0; i< 4; i++){
            if (mas[i] > 0){
                sum  = sum + mas[i];
            } else if ( mas[i] < 0){
                mno = mas[i] * mno;
            }

        }
        System.out.println( "sum = " + sum + " mno = " + mno );



    }

}
