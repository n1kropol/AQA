package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        public String name = "";
        public int height;
        public int weight;
        public boolean sex;
        public String nationality;
        public String job = "";
//1
        public Human(String name, int height, int weight, boolean sex, String nationality, String job)
        {
            this.name = name;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
            this.nationality = nationality;
            this.job = job;
        }
//2
        public Human(String name, int height, int weight)
        {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
//3
        public Human(String name, int height, int weight, boolean sex, String nationality)
        {
            this.name = name;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
            this.nationality = nationality;
        }
//4
        public Human(int height, int weight, boolean sex)
        {
            this.height = height;
            this.weight = weight;
            this.sex = sex;
        }
//5
        public Human(int height, int weight, boolean sex, String nationality)
        {
            this.height = height;
            this.weight = weight;
            this.sex = sex;
            this.nationality = nationality;
        }
//6
        public Human(int height, int weight, boolean sex, String nationality, String job)
        {
            this.height = height;
            this.weight = weight;
            this.sex = sex;
            this.nationality = nationality;
            this.job = job;
        }
//7

        public Human(String name)
        {
            this.name = name;
        }
//8

        public Human(String name, String nationality, String job)
        {
            this.name = name;
            this.nationality = nationality;
            this.job = job;
        }
//9

        public Human(String name, boolean sex, String job, String nationality)
        {
            this.name = name;
            this.sex = sex;
            this.job = job;
            this.nationality = nationality;
        }
//10

        public Human(String name, String job)
        {
            this.name = name;
            this.job = job;
        }
    }
}
