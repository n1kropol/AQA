package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        //Напишите тут ваш код
        Map<String,String> map = new HashMap<String,String>();
/*        for (int i = 0; i < 10; i++)
        {
            map.put("f","i"+i);
        }*/
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("1","4");
        map.put("5","4");
        map.put("6","5");
        map.put("7","6");
        map.put("8","5");
        map.put("1","4");
        map.put("0","2");

        return map;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
