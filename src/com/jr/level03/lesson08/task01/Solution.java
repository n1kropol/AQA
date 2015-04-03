package com.javarush.test.level03.lesson08.task01;

//import java.util.Scanner;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        //Scanner scanner = new Scanner(System.in);
        //String name = scanner.nextLine();
        //int year = scanner.nextInt();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        String name = reader.readLine();


        System.out.print(name+" захватит мир через "+ sAge+" лет. Му-ха-ха!");
    }
}