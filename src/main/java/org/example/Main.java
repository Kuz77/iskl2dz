package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws EmptyStringException {

        float number = getFloatValue();
        System.out.println("Вы ввели число: " + number);
        String a = getStringValue();
        System.out.println("вы ввели строку"+ a);

    }





    //Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static float getFloatValue() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите дробное число: ");

            if (scanner.hasNextFloat()) {
                float number = scanner.nextFloat();
                return number;
            } else {
                System.out.println("Введено некорректное значение. Пожалуйста, попробуйте еще раз.");
                scanner.nextLine();
            }
        }
    }




    //Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static String getStringValue() throws EmptyStringException {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            throw new EmptyStringException("пустые строки вводить нельзя");
        }
        return input;
    }

}


//Задание 2
//        try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }

// Если мы не выйдет за пределы массива тут intArray[8], то упремся в ArithmeticException когда будем делить на 0,
// что бы исправить можно изменить int d = 1;



//Задание 3
//
//public static void main(String[] args) throws Exception {
//        try {
//        int a = 90;
//        int b = 3;
//        System.out.println(a / b);
//        printSum(23, 234);
//        int[] abc = { 1, 2 };
//        abc[3] = 9;
//        } catch (Throwable ex) {
//        System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//        System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//        System.out.println("Массив выходит за пределы своего размера!");
//        }
//        }
//public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//        }

// 1)обращаемся к abc[3], а его не существует
//2)в printSum есть исключение, оно не нужно
//3)Throwable ex нужно подвинуть вниз catch



//    public static void main1(String[] args) throws Exception {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = {1, 2};
//            abc[1] = 9;
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        }
//    }
//
//    public static void printSum(Integer a, Integer b) {
//        System.out.println(a + b);
//    }