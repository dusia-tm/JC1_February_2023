package org.example;

import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а: ");
        int a = scanner.nextInt();
        System.out.println("Введите число б: ");
        int b = scanner.nextInt();
        System.out.println("Введите шаг");
        int c = scanner.nextInt();
        if (c != 0) {
            if (a > b) {
                if (c < 0) {
                    for (int i = a; i >= b; i += c) {
                        System.out.println(i);
                    }
                } else {
                    System.out.println("При условии max меньше min - шаг должен быть отрицательным! ");
                }
            } else if (a < b) {
                if (c > 0) {
                    for (int i = a; i <= b; i += c) {
                        System.out.println(i);
                    }
                } else {
                    System.out.println("При условии min меньше max - шаг должен быть положительным! ");
                }
            }
        } else {
            System.out.println("Шаг не должен равняться нулю!");
        }
    }
}
