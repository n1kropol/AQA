package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int[] ar = new int[3];

        String oneStr = reader.readLine();
        int a = Integer.parseInt(oneStr);
        String twoStr = reader.readLine();
        int b = Integer.parseInt(twoStr);
        String threeStr = reader.readLine();
        int c = Integer.parseInt(threeStr);

        if ((a > b) && (a > c))
        {
            if (b > c)
            {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            } else
            {
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            }
        } else if ((b > a) && (b > c))
        {
            if (a > c)
            {
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            } else
            {
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            }
        } else
            if (a > b) {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            } else {
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }


/*
        int temp;
        // 3 2 1
        for (int j = 0; j < ar.length-1; j++)
        {

            for (int i = 0; i < ar.length-1; i++)
            {

                if (ar[i] > ar[i+1])
                {
                    temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;
                }
            }
        }
*/



    }
}
