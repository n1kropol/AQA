package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String one = reader.readLine();
        int oneInt = Integer.parseInt(one);

        String two = reader.readLine();
        int twoInt = Integer.parseInt(two);

        String three = reader.readLine();
        int threeInt = Integer.parseInt(three);

        String four = reader.readLine();
        int fourInt = Integer.parseInt(four);

        // 1 2 3 4
        // 1 2 1 0

        if ( (oneInt > twoInt) && (oneInt > threeInt) && (oneInt > fourInt) )
            System.out.println(oneInt);

        else if ( (twoInt > oneInt ) && (twoInt > threeInt) && (twoInt > fourInt) )
            System.out.println(twoInt);

        else if ( (threeInt > oneInt) && (threeInt > twoInt ) && (threeInt > fourInt) )
            System.out.println(threeInt);

        else if ( (fourInt > oneInt) && (fourInt > twoInt ) && (fourInt > threeInt ) )
            System.out.println(fourInt);


    }
}
