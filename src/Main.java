import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        int year = 2021;
        checTheYear(year);

        // Задание 2
        int clientDeviceYear = 2012;
        int clientOs = 1;
        installVersion(clientOs, clientDeviceYear);

        // Задание 3
        int deliveryDistance = 95;
        int day = 1;
        delivers(day, deliveryDistance);

        // Задание 4
        String doubles = "aabccddefgghiijjkk";
        doubleLetters(doubles);

        // Задание 5
        int[] arr = {3, 2, 1, 6, 5};
        flipOver(arr);

    }

    // Задание 1

    private static void checTheYear(int a) {
        boolean leapYear = a % 400 == 0 ||((a % 4 == 0) && (a % 100 != 0));
        if (leapYear) {
            System.out.println(a + " год является високосным.");
        } else {
            System.out.println(a + " год не является високосным.");
        }
    }
    // Задание 2
    private static void installVersion(int a, int b) {
        if (a == 1 && b >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (a == 1 && b < 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else if (a != 1 && b >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите облегчённую версию приложения для IOS по ссылке");
        }
    }

    // Задание 3

    private static int delivers(int a, int b) {
        if (b <= 20) {
            System.out.println("Понадобится дней: " + a);
        } else if (b <= 60) {
            System.out.println("Понадобится дней: " + (a + 1));
        } else if (b <= 100) {
            System.out.println("Понадобится дней: " + (a + 2));
        } else {
            System.out.println("Вы слишком далеко от нас))");
        }
        return a;
    }

    // Задание 4
    private static void doubleLetters(String sb) {
        char[] c = sb.toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            if(c[i] == c[i + 1]) {
                System.out.println("Задублирован символ - " + c[i]);
                return;
            }
        }
        System.out.println("В строке нет дублей");
    }

    // Задание 5
    private static void flipOver(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

}