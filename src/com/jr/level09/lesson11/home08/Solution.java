package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //Написать тут ваш код
        ArrayList<int[]> temp = new ArrayList<int[]>();
        int[] a ={0,1,2,3,4};
        temp.add(a);
        int[] b ={0,1};
        temp.add(b);
        int[] c ={0,1,2,3};
        temp.add(c);
        int[] d ={0,1,2,3,4,5,6};
        temp.add(d);
        int[] e={};
        temp.add(e);

        return temp;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
