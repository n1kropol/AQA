package com.javarush.test.level08.lesson11.bonus01;

/**
 * Created by n1kropol on 31.03.2015.
 */
// use milimeters.
class Door {
    public int height;
    public int width;
    public Door(int h, int w) {
        this.height = h;
        this.width = w;
    }
    public static double squareMetersArea(int h, int w) {
        return (double)h*w/1000000;
    }
    public static int bindsAmount(int h) {
        return h / 1000;
    }
}
