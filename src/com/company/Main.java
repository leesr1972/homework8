package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static boolean defineLeapYear (int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static void informClient (int typeOfOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (typeOfOS == 0) {
            if (deviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке ...");
            }
            else System.out.println("Установите приложение для iOS по ссылке ...");
        }
        if (typeOfOS == 1) {
            if (deviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке ...");
            }
            else System.out.println("Установите приложение для Android по ссылке ...");
        }
        if (typeOfOS != 0 && typeOfOS != 1) {
            System.out.println("У Вас неверно введен номер операционной системы.");
        }
        if (deviceYear > currentYear) {
            System.out.println("У Вас неверно введен год выпуска Вашего устройства.");
        }
    }

    public static void informClientAboutDelivery(int distance) {
        if (distance <= 20) {
            System.out.println("Мы доставим Вашу карту завтра!");
        }
        if (distance > 20 && distance <= 60) {
            System.out.println("Мы доставим Вашу карту послезавтра!");
        }
        if (distance > 60 && distance <= 100) {
            System.out.println("Мы доставим Вашу карту в течение 3-х дней!");
        }
        if (distance > 100) {
            System.out.println("К сожалению мы не сможем доставить Вам карту, так как Вы слишком далеко живете.");
        }
    }

    public static void searchForDouble(String doneString) {
        for (int i = 0; i < doneString.length() - 1; i++) {
            char a = doneString.charAt(i);
            char b = doneString.charAt(i + 1);
            if (a == b) {
                System.out.println("В Вашей строке дублируется " + (i + 1) + "-й символ!");
                return;
            }
        }
        System.out.println("В Вашей строке символы не дублируются!");
    }

    public static void invertArray(int[] arr) {
        if (arr.length <= 1) {
            System.out.println("Ваш массив инвертировать невозможно!");
            return;
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        // write your code here
        int year = 1900;
        if (defineLeapYear(year)) {
            System.out.println(year + " год является високосным.");
        }
        else System.out.println(year + " год не является високосным.");

        System.out.println();
        int clientDeviceOS = 0;
        int clientDeviceYear = 2015;
        informClient(clientDeviceOS, clientDeviceYear);

        System.out.println();
        int deliveryDistance = 10;
        informClientAboutDelivery(deliveryDistance);

        System.out.println();
        String lineToCheck = "aabccddefgghiijjkk";
        searchForDouble(lineToCheck);

        System.out.println();
        int[] arr1 = {3, 2, 1, 6, 5};
        invertArray(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}

