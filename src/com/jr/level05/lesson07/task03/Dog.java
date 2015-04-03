package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //Напишите тут ваш код
    public String name;
    public double height;
    public String color;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, double height){
        this.name = name;
        this.height = height;
    }
    public void initialize(String name, double height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
