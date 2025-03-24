package org.example;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder (5);
        sb.append("HOWDY");
        sb.insert(0, ' ');
        sb.replace (3, 5, "LL");
        sb.insert (5, "Cow");
        sb.delete (2, 7);
        System.out.println(sb.length());

        Integer a = null;
        System.out.println(a <= 0);
    }
}