package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isExit = false;
        int rez = 0;
        while (!isExit){
            String num = reader.readLine();
            if(num.equals("сумма")){
                break;
            } else {
                int nInt = Integer.parseInt(num);
                rez+=nInt;
            }
        }
        System.out.println(rez);
    }
}
