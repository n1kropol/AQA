package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 01.04.15.
 */
public class MailLists {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        List<String> f = new ArrayList<String>();
        f.add("Hello ");
        f.add("class");
        f.add(".");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(f.get(0));
        System.out.println(f.get(1));
        System.out.println(f.get(2));
        System.out.println(a.length);
        System.out.println(f.size());
    }
}
