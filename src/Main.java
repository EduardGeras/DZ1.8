import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        int year = 2021;
        checkingTheYear(year);

        // Задание 2
        int clientDeviceYear = 2012;
        int clientOs = 1;
        applicationVersion(clientOs, clientDeviceYear);

        // Задание 3
        int deliveryDistance = 95;
        int day = 1;
        delivery(day, deliveryDistance);

        // Задание 4
        String doubles = "aabccddefgghiijjkk";
        doubleLetters(doubles);

        // Задание 5
        int[] arr = {3, 2, 1, 6, 5};
        flipOver(arr);

    }

    // Задание 1

    public static int checkingTheYear(int a) {
        boolean leapYear = (a % 4 == 0) && (a % 100 != 0);
        if (a % 400 == 0 || leapYear) {
            System.out.println(a + " год является високосным.");
            return a;
        } else {
            System.out.println(a + " год не является високосным.");
            return a;
        }
    }
    // Задание 2
    public static void applicationVersion(int a, int b) {
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

    public static void delivery(int a, int b) {
        if (b <= 20) {
            System.out.println("Понадобится дней: " + a);
        } else if (b <= 60) {
            System.out.println("Понадобится дней: " + (a + 1));
        } else if (b <= 100) {
            System.out.println("Понадобится дней: " + (a + 2));
        } else {
            System.out.println("Вы слишком далеко от нас))");
        }
    }

    // Задание 4
    public static void doubleLetters(String sb) {
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
    public static void flipOver(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

}