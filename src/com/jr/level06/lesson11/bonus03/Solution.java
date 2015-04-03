package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //Напишите тут ваш код
        int[] ar = new int[5];
        for (int i = 0; i < 5; i++)
        {
            ar[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 5; i++) {
            int j;
            for (j = 0; j < 4; j++) {
                if(ar[j] > ar[j+1]){
                    int temp = ar[j+1];
                    ar[j+1] = ar[j];
                    ar[j] = temp;
                }
            }
            j = 0;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(ar[i]);
        }
    }
}
