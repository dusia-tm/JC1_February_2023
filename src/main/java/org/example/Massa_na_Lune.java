package org.example;

import java.util.Scanner;

public class Massa_na_Lune {
    public static void main(String[] args) {
        double m,result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите вашу массу: ");
        m = scan.nextDouble();
        result = m*0.16;
        System.out.println("Ваш вес на Луне составляет " + result);
    }
}
