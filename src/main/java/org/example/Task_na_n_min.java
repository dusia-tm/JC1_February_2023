package org.example;

import java.util.Scanner;

public class Task_na_n_min {
    public static void main(String[] args) {
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите дни: ");
            int n = in.nextInt();
            int h = n * 24;
            int m = (n * 24)*60;
            int s = ((n * 24)*60)*60;
            System.out.println(("часов=" + h + "минут=" + m + "секунд=" + s));
        }
    }
}
