package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //Напишите тут ваш код
    public double top = 0.0;
    public double left = 0.0;
    public double width = 0.0;
    public double height = 0.0;

    public Rectangle(double left, double top, double width, double height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public Rectangle(double left, double top){
        this.left = left;
        this.top = top;
    }
    public Rectangle(double left, double top, double width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }
    public Rectangle(Rectangle rect){
        this.left = rect.left;
        this.top = rect.top;
        this.width = rect.width;
        this.height = rect.height;
    }

}
