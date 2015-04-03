package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //Напишите тут ваш код
        Map<String, Cat> map = new HashMap<String, Cat>();
        Cat first = new Cat("first");
        Cat second = new Cat("second");
        Cat third = new Cat("third");
        Cat fourth = new Cat("fourth");
        Cat fifth = new Cat("fifth");
        Cat sixth = new Cat("sixth");
        Cat seventh = new Cat("seventh");
        Cat eighth = new Cat("eighth");
        Cat ninth = new Cat("ninth");
        Cat tenth = new Cat("tenth");

        map.put("first", first);
        map.put("second", second);
        map.put("third", third);
        map.put("fourth", fourth);
        map.put("fifth", fifth);
        map.put("sixth", sixth);
        map.put("seventh", seventh);
        map.put("eighth", eighth);
        map.put("ninth", ninth);
        map.put("tenth", tenth);

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //Напишите тут ваш код
        Set<Cat> set = new HashSet<Cat>();
        for( Cat temp : map.values())
            set.add(temp);

        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }
}
