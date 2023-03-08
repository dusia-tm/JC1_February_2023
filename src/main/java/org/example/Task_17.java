package org.example;

public class Task_17 {
    public static void main(String[] args) {

    int[] arr = {10, 7, 1, 4, 7, 4, 11};
    int max = arr[0];
     for(
    int i = 1;
    i<arr.length;i++)
    {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
System.out.println(max);
 }
}