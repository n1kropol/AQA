package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/
/*String sd = "Fri, 03 Oct 2008 05:52:30 GMT";
        SimpleDateFormat format = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z");
        Date date = format.parse(sd);
        System.out.println("Date : " + date);*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      //  String date = reader.readLine();
        Date dDate = new Date(reader.readLine());
        SimpleDateFormat dateFormat = null;
        //dateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
        dateFormat = new SimpleDateFormat();
        //SimpleDateFormat format = new SimpleDateFormat("MMM dd, yyyy");
        //Date rezDate = format.parse(String.valueOf(dDate));
        System.out.println(dateFormat.format( dDate ).toUpperCase());

    }
}
