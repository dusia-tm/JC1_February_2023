package org.example;

import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите курс рубля: ");
        double rblCourse = scanner.nextDouble();
        System.out.println("Введите количество рублей: ");
        double rblCount = scanner.nextDouble();
            System.out.println("Вы можете купить "+ convert(rblCourse,rblCount)+" долларов.");
    }

    static double convert(double rblCourse, double count){
        return count/rblCourse;

    }
}
