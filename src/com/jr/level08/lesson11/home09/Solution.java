package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws ParseException
    {
        isDateOdd("MARCH 30 2015");
    }

    public static boolean isDateOdd(String date) throws ParseException
    {
        Date recevedDate = new Date(date);
        //System.out.println(recevedDate);
        Date yearStartTime = new Date();
        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);
        long msTimeDistance = recevedDate.getTime() - yearStartTime.getTime();
        long msDays = 24*60*60*1000;
        int dayCount = (int)(msTimeDistance/msDays);
        //System.out.println(dayCount);
/*        if (dayCount % 2 == 0)
            return true;
        else
            return false;*/
        return (dayCount % 2 == 0);




/*
        SimpleDateFormat format = new SimpleDateFormat("MONTH DD YEAR");
//        format.applyPattern("dd.mm.yyyy");
        Date docDate= format.parse(docDate);
*/
/*

        String s="MAY 1 2013";
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("MONTH DAY YEAR");
        Date docDate= format.parse(s);
        System.out.println(docDate);
*/


        //return true;
    }
}
