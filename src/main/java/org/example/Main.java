package org.example;

public class Main {
    public static int changeNumber(Integer number) {
        return number + 2;
    }
    public static void main(String[] args) {
        Integer number = 205;
        number =  changeNumber(number);
        System.out.println("Hello, World! " + number);
    }
}