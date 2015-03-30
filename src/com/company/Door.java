package com.company;

/**
 * Created by Admin on 30.03.15.
 */
public class Door {
    public int height;
    public boolean isOpened;

    public Door(int h){
        height = h;
        isOpened = true;
    }
    public void close(){
        isOpened = false;
    }
    public void print(){
        System.out.println("door height is " + height);
        if(isOpened)
            System.out.println("Door is opened");
        else
            System.out.println("Door is closed");
    }
}
