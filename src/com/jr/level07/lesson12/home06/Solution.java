package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human gfather1 = new Human("дед1", true, 66, null, null);
        Human gfather2 = new Human("дед2", true, 65, null, null);
        Human gmother1 = new Human("баба1", false, 66, null, null);
        Human gmother2 = new Human("баба2", false, 65, null, null);
        Human father = new Human("father", true, 46, gfather1, gmother1);
        Human mother = new Human("mother", false, 45, gfather2, gmother2);
        Human child1 = new Human("child1", true, 26, father, mother);
        Human child2 = new Human("child2", true, 20, father, mother);
        Human child3 = new Human("child3", false, 16, father, mother);
        System.out.println(gfather1);
        System.out.println(gfather2);
        System.out.println(gmother1);
        System.out.println(gmother2);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
