package org.example;

import java.util.Scanner;

public class Task_14 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число: ");
            int a = in.nextInt();
            int b = in.nextInt();
            if (a > b) {
                a = a + 3;
            } else if (a < b)
                b = b +8;
            System.out.println("a=" + a + "; b=" + b);
        }
}
