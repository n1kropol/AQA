package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum ;
        int  minimum;

        //Напишите тут ваш код
        int[] ar = new int[20];
        for (int i = 0; i < 20; i++)
        {
            ar[i] = Integer.parseInt(reader.readLine());
        }
        maximum = ar[0];
        minimum = ar[0];

        for (int i = 0; i < ar.length; i++)
        {
            if(ar[i] > maximum)
                maximum = ar[i];
            if(ar[i] < minimum)
                minimum = ar[i];
        }

        System.out.print(maximum+" "+minimum);
    }
}
