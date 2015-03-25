package com.company;

/**
 * Created by Admin on 25.03.15.
 */
public class Main2 {
    public static void main(String[] args) {
        //System.out.println(args[0]);
//////////////////////// task 1/////////////////////////////////
        if (args[0].equals("Hello") )
        //if (args[0] == "Hello")
            System.out.println("Class");
        else
            System.out.println("Good bye");
//////////////////////// task 2/////////////////////////////////
        if (args[0].equals("Hello") && args[1].equals("Class"))
            System.out.println("Success");
        else
            System.out.println("Good bye");
        int a = 10;
///////////////////////////test 3//////////////////////////////
        while(a < 15){
            System.out.println("a is: "+a);
            a++;
        }
        System.out.println("over loops");

        a = 10;
        while(true){
            System.out.println("a is: "+a);
            if (a > 15)
                break;
            a++;
        }
        System.out.println("over loops");


    }
}



