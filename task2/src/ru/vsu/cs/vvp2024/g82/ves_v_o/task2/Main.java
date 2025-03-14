package ru.vsu.cs.vvp2024.g82.ves_v_o.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, r;
        System.out.println("Введите сторону квадрата");
        a = sc.nextDouble();
        System.out.println("Введите радиус круга");
        r = sc.nextDouble();
        double EPS = 1e-12;
        int n = 0;
        if (r >= radiusForFourCircle(a) - EPS) {
            n = 4;
            if (r >= radiusForThreeCircle(a) - EPS) {
                n = 3;
                if (r >= radiusForTwoCircle(a) - EPS) {
                    n = 2;
                    if (r >= radiusForOneCircle(a) - EPS) {
                        n = 1;
                    }
                }
            }

        }

        if (n == 0) {
            System.out.println("Круги не полностью закрыли квадрат");
        } else {
            System.out.println(n + " круг(а) закрыл(и) квадрат");
            System.out.println("Круги полностью закрыли квадрат");
        }

    }
    public static double radiusForOneCircle(double a){
        return Math.sqrt(2) * a / 2;
    }
    public static double radiusForTwoCircle(double a){
        return Math.sqrt(0.3125 * a * a);
    }
    public static double radiusForThreeCircle(double a){
        return Math.sqrt(5. / 18. * a * a);
    }
    public static double radiusForFourCircle(double a){
        return Math.sqrt(2) * a / 4;
    }


}