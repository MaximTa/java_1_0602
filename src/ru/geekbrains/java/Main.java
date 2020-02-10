package ru.geekbrains.java;

import java.util.Arrays;

public class Main {
    int a = 5;
    long l = 500000L;
    byte b = -100;
    short s = -10000;
    char ch = ')';
    boolean boo = true;
    float f = 11.54f;
    double d = 123.321;
    String str = "Java";
//задание
    public static int calc(int a, int b, int c, int d) {

        return a * (b + (c / d));
    }
    public static boolean between10v20(int t, int p) {
        if (((t + p) > 10) && ((t + p) <= 20)) {
            return true;
        } else {
            return false;
        }
    }
    public static void PositiveNegative(int x) {
        if (x >= 0) {
            System.out.println("Число х - положительное");
        } else {
            System.out.println("Число х - отрицательное");
        }
    }
    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
            return false;
    }
    public static void Privet(String name) {
        System.out.println("Привет, " + name + "!");
    }
    public static void isLeap(int x) {
        if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) {
            System.out.println("Год " + x +"- високосный");
        } else {
           System.out.println("Год " + x + "- не високосный");
        }
    }
    public static void main(String[] args) {
        System.out.println(calc(2, 4, 16, 8));
        System.out.println(between10v20(12, 4));
        PositiveNegative(-39);
        System.out.println(isNegative(12));
        Privet("Max");
        isLeap(2019);
    }
}