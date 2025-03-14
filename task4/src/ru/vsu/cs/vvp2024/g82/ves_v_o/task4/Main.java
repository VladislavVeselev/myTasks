package ru.vsu.cs.vvp2024.g82.ves_v_o.task4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n:");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 100; i <= 998; i++) {
            if (requirnment(i)) {
                count = count + 1;
            }
            if (count == n) {
                System.out.println(i);
                break;
            }
            if (n > 243){
                System.out.println(0);
                break;
            }
        }
    }
    public static boolean requirnment(int i){
        int firstDigit = i/100;
        int secondDigit = i/10%10;
        int thirdDigit = i%10;
        return ((firstDigit == secondDigit && thirdDigit != firstDigit)
                || (firstDigit == thirdDigit && thirdDigit != secondDigit)
                || (secondDigit == thirdDigit && firstDigit != thirdDigit));
        }

}
