package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //Напишите тут ваш код
    public String friend;

    public void initialize(String name){
        this.friend = name;
    }
    public void initialize(String name, String age){
        this.friend = name+age;
    }
    public void initialize(String name, String age, String sex){
        this.friend = name+age+sex;
    }
}
