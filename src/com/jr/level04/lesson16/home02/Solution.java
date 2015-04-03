package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String one = reader.readLine();
        String two = reader.readLine();
        String three = reader.readLine();
        int a = Integer.parseInt(one);
        int b = Integer.parseInt(two);
        int c = Integer.parseInt(three);

        if (((a > b) && (a < c)) ||(a < b) && (a > c))
            System.out.println(a);
        else if (((b > a) && (b < c)) || ((b < a) && (b > c)))
            System.out.println(b);
        else if (((c > a) && (c < b)) || ((c < a) && (c > b)))
            System.out.println(c);
//////////////////////////////////////
        if ((a == b) && (a > c))
            System.out.println(a);
        else if ((a == b) && (a < c))
            System.out.println(a);

        if ((b == c) && (b > a))
            System.out.println(b);
        else if ((b == c) && (b < a))
            System.out.println(b);

        if ((c == a) && (c > a))
            System.out.println(c);
        else if ((c == a) && (c < b))
            System.out.println(c);

        if ((a == b) && (b == c) && (a == c))
            System.out.println(a);


    }
}
