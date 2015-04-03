package com.javarush.test.level08.lesson08.task02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Integer> set2 = new HashSet<Integer>();
        set2 = removeAllNumbersMoreThan10(createSet());
        for (Integer el : set2)
            System.out.println(el);
    }
    public static HashSet<Integer> createSet()
    {
        //Напишите тут ваш код
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++)
        {
            set.add(i);
        }
        return (HashSet<Integer>)set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //Напишите тут ваш код
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()) {
            Integer num = itr.next();
            if (num > 10)
                itr.remove();
        }

        return set;
    }
}
