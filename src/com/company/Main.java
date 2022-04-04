package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Double> e=new LinkedList<>();
        e.add(2.3);
        e.add(6.3);
        e.add(2.2);
        e.add(5.3);
        e.add(2.7);

        System.out.println(e.contains(2.3));
        System.out.println(e.pop());
        System.out.println(e);

        Iterator<Double> iterator=e.descendingIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
