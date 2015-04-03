package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры Имя и два числа, вывести надпись:
name1 получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // System.out.println("Enter your name");
        String name = reader.readLine();

        //System.out.println("Enter your salary");
        String salary = reader.readLine();
        int salaryInt = Integer.parseInt(salary);

        //System.out.println("Enter years");
        String year = reader.readLine();
        int yearInt = Integer.parseInt(year);
        System.out.print(name+" получает "+salaryInt+" через "+yearInt+" лет.");

    }
}