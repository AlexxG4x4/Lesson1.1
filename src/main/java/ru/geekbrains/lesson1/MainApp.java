package ru.geekbrains.lesson1;

public class MainApp {
    byte b = 1;
    short s = 2;
    int c = 152;
    long l = 787987L;
    float f = 1.5f;
    double d = 150.25;
    char ch = 55;
    boolean bool = false;

    public static void main (String[] args) {
        System.out.println(calculate(5, 6, 4, 9));
        System.out.println(task10and20(5,18));
        inPositiveOrNegative (-50);
        System.out.println(negativeORpositive (0));
        name ("Андрей");

    }
    public static int calculate (int a, int b, int c, int d){
        return a * (b + (c/d));
    }
    public static boolean task10and20 (int x1, int x2){
        int sum = x1 + x2;
        return sum >= 10 && sum <+ 20;
        }

    public static void inPositiveOrNegative(int x) {
        if (x >= 0){
            System.out.println( "Число положительное");
        }
        else {
            System.out.println ("Число отрицательное");
        }
    }
    public static boolean negativeORpositive (int x3){
        return x3 < 0;
        }
    public static void name (String name) {
        System.out.println("Привет, " + name + "!");
    }
}
