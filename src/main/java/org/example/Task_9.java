package org.example;

public class Task_9 {
    public static void main(String[] args) {
    //Зададим переменные.
    System.out.println("Возьмём две переменные:");
    System.out.println("x = 25,  y = 15.");
    int x = 25;
    int y = 15;
    x = x ^ y;
    y = y ^ x;
    x = x ^ y;
    System.out.println(" х = " + x + ", y = " + y + ".");
}
}

