package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
       // List<String> addresses = new ArrayList<String>();
        Map<String,String> map = new HashMap<String,String>();
        while (true)
        {
            String town = reader.readLine();
            if (town.isEmpty() && town.isEmpty()) break;
            String family = reader.readLine();

            //addresses.add(family);
            map.put(town, family);
        }
       // System.out.println("-----");
        //read home number
        //int houseNumber = Integer.parseInt(reader.readLine());
        String findTown = reader.readLine();

        //if (0 <= houseNumber && houseNumber < addresses.size())
/*        if(map.containsKey(findTown))
        {
            //String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }*/
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            if (pair.getKey().equals(findTown))
            {
                System.out.println(pair.getValue());
                break;
            }
        }

    }
}
