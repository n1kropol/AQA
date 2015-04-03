package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("0","1");
        map.put("1","3");
        map.put("2","1");
        map.put("3","2");
        map.put("4","3");
        map.put("5","1");
        map.put("6","2");
        map.put("7","4");
        map.put("8","5");
        map.put("9","2");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //Напишите тут ваш код
/*        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String t = pair.getValue();
            removeItemFromMapByValue(map,t);
        }*/
        ArrayList<String> values = new ArrayList<String>(map.values()); //http://help.javarush.ru/questions/6037/level08-lesson08-task05 не мое решение
        for (String name : values)
        {
            int w = 0;
            for (int i = 0; i < values.size(); i++)
            {
                if (name.equals(values.get(i))) w++;
                if (w > 1) removeItemFromMapByValue(map, name);
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                //System.out.println(pair.getValue());
                map.remove(pair.getKey());
        }

    }

/*    public static void main(String[] args)
    {
        removeTheFirstNameDuplicates(createMap());

    }*/
}
