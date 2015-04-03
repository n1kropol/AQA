package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("a","b");
        map.put("b","a");
        map.put("c","d");
        map.put("e","f");

        map.put("f","e");
        map.put("g","e");
        map.put("h","b");
        map.put("j","a");
        map.put("k","a");
        map.put("l","b");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        int i = 0;
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String n = pair.getValue();
            if (n.equals(name))
                i++;

        }
        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        int i = 0;
        while (iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            String f = pair.getKey();
            if (f.equals(familiya))
                i++;
        }
        return i;

    }
}
