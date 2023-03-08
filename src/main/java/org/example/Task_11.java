package org.example;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(Math.max(a, b));
    }
}
