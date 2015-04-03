package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        //Написать тут ваш код. step 3 - пункт 3
        Iterator<Cat> itr = cats.iterator();
        //Cat cat = itr.next();
        itr.next();
        itr.remove();

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        //Написать тут ваш код. step 2 - пункт 2
        Set<Cat> set = new HashSet<Cat>();
        //Cat cat = new Cat();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        return set;
    }

    public static void printCats(Set<Cat> cats)
    {
        // step 4 - пункт 4
        for (Cat t : cats)
            System.out.println(t);
    }

    // step 1 - пункт 1
    public static class Cat{
/*        @Override
        public String toString()
        {
            return "Cat!";
        }*/

    }
}
