package com.javarush.test.level09.lesson02.task05;

/* Метод должен возвращать результат – глубину его стек-трейса
Написать метод, который возвращает результат – глубину его стек трейса – количество методов в нем (количество элементов в списке). Это же число метод должен выводить на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
       // int t = getStackTraceDeep();
        //System.out.println(t);
        getStackTraceDeep();
    }
    public static int getStackTraceDeep()
    {
        //Напишите тут ваш код

        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        int count = 0;
        for (StackTraceElement el : stack)
            count++;
        System.out.println(count);
        return count;

    }
}
