package com.javacore;

//Задано дату у форматі dd.mm.yyyy. Вивести завтрашню дату
public class task6 {

    public static void main(String[] args)throws Exception{

       String date = "31.12.2016";
        int day = 0;
        int month = 0;
        int year = 0;


        String[] dateParts = date.split("\\.");


        day = Integer.parseInt(dateParts[0]);
        month = Integer.parseInt(dateParts[1]);
        year = Integer.parseInt(dateParts[2]);

        day = day + 1;



        if (day > 31&&month >= 1 ){
            day = 1;
            month = 2;
        }
        if (day > 28&&month >= 2 ){
            day = 1;
            month = 3;
        }
        if (day > 31&&month >= 3 ){
            day = 1;
            month = 4;
        }
        if (day > 30&&month >= 4 ){
            day = 1;
            month = 5;
        }
        if (day > 31&&month >= 5 ){
            day = 1;
            month = 6;
        }
        if (day > 30&&month >= 6 ){
            day = 1;
            month = 7;
        }
        if (day > 31&&month >= 7 ){
            day = 1;
            month = 8;
        }
        if (day > 31&&month >= 8 ){
            day = 1;
            month = 9;
        }
        if (day > 30&&month >= 9 ){
            day = 1;
            month = 10;
        }
        if (day > 31&&month >= 10 ){
            day = 1;
            month = 11;
        }
        if (day > 30&&month >= 11 ){
            day = 1;
            month = 12;
        }
        if (day >= 31&&month >= 12 ){
            day = 1;
            month = 1;
            year = 2017;
        }

        String day1 = Integer.toString(day);
        String month1 = Integer.toString(month);
        String year1 = Integer.toString(year);


       /* boolean con1 = day1.contains("1\\.");
        boolean con2 = day1.contains("2.");
        boolean con3 = day1.contains("3");
        boolean con4 = day1.contains("4");
        boolean con5 = day1.contains("5");
        boolean con6 = day1.contains("6");
        boolean con7 = day1.contains("7");
        boolean con8 = day1.contains("8");
        boolean con9 = day1.contains("9");
        boolean conn1 = month1.contains("1");
        boolean conn2 = month1.contains("2");
        boolean conn3 = month1.contains("3");
        boolean conn4 = month1.contains("4");
        boolean conn5 = month1.contains("5");
        boolean conn6 = month1.contains("6");
        boolean conn7 = month1.contains("7");
        boolean conn8 = month1.contains("8");
        boolean conn9 = month1.contains("9");
            day1 = "0" + day1;
            month1 = "0" + month1;
            */



        String date1 = day1+"."+month1+"."+year1;



        System.out.println(date1);



    }



}
