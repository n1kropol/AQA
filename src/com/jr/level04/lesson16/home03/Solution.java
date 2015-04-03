package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Boolean isExit = false;
        int rez = 0;
        while (!isExit){
            String s = reader.readLine();
            int num = Integer.parseInt(s);
            rez+=num;
            isExit = s.equals("-1");
        }
        System.out.println(rez);
    }
}
