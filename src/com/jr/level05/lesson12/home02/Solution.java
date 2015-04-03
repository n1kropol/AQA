package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        // Создай по два объекта каждого класса тут
        Man man1 = new Man("manOne",20,"BSSR");
        Man man2 = new Man("manTwo",25,"RSSR");

        Woman woman1 = new Woman("womanOne",20,"MSSR");
        Woman woman2 = new Woman("womanTwo",25,"ASSR");

        // Выведи их на экран тут
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    // Напиши тут свои классы
    public static class Man{
        public String name = "man";
        public int age = 20;
        public String address = "USSR";

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public Man(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Man(String name){
            this.name = name;
        }
    }
    public static class Woman{
        public String name;
        public int age;
        public String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public Woman(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Woman(String name){
            this.name = name;
        }
    }
}
