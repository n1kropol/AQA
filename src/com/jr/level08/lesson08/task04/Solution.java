package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));

        //Напишите тут ваш код
        map.put("2", new Date("JUNE 1 1982"));
        map.put("3", new Date("JUNE 1 1983"));
        map.put("4", new Date("JANUARY 1 1984"));
        map.put("5", new Date("JULY 1 1985"));
        map.put("6", new Date("JUNE 1 1986"));
        map.put("7", new Date("AUGUST 1 1987"));
        map.put("8", new Date("MARCH 1 1988"));
        map.put("9", new Date("FEBRUARY 1 1989"));
        map.put("10", new Date("JUNE 1 1990"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            //Date d = pair.getValue();
            if (pair.getValue().getMonth() >= 5 && pair.getValue().getMonth() <= 7){
                iterator.remove();
            }
        }
    }
/*    public static void main(String[] args) {
        System.out.println(createMap());
        removeAllSummerPeople(createMap());
    }*/
}
