package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        ArrayList<Human> list1 = new ArrayList<Human>();
        Human ded1 = new Human("ded1",true, 60,list1);
        Human baba1 = new Human("baba1", false, 60, list1);

        ArrayList<Human> list2 = new ArrayList<Human>();
        Human ded2 = new Human("ded2",true, 55,list2);
        Human baba2 = new Human("baba2", false, 55, list2);

        ArrayList<Human> list3 = new ArrayList<Human>();
        Human otets = new Human("otets",true, 30,list3);
        Human mat = new Human("mat", false, 25, list3);

        ArrayList<Human> list = new ArrayList<Human>();
        Human child1 = new Human("child1",true, 10,list);
        Human child2 = new Human("child2",true, 12,list);
        Human child3 = new Human("child3",false, 9,list);


        list1.add(otets);
        list2.add(mat);
        list3.add(child1);
        list3.add(child2);
        list3.add(child3);

        System.out.println(ded1);
        System.out.println(baba1);
        System.out.println(ded2);
        System.out.println(baba2);
        System.out.println(otets);
        System.out.println(mat);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        //Написать тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
