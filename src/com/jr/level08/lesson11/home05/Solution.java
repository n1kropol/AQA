package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        for (int i = 0; i < s.length(); i++)
            list.add(s.substring(i,i+1));
        String t = "";
        for (int i = 0; i < list.size(); i++)
        {
            if (!list.get(i).equals(" "))
                if (i != 0 && (list.get(i-1).equals(" ")))
                {
                    t = list.get(i);
                    t = t.toUpperCase();
                    list.set(i, t);
                }
            System.out.print(list.get(i));
        }
        //Напишите тут ваш код
    }
}
