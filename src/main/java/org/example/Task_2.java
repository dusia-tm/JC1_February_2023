package org.example;

public class Task_2 {
        public static void main(String[] args) {
int [] num = new int[2];
    num[0] = 20;
    num[1] = 55;
for (int i = 0; i<num.length; i++){
    num[i] = (int) (num[i] * 1.1);
    System.out.println(num[i]);
}
}
}