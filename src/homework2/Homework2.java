package homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        sumAndSubtract();
        calculate();
        printMultiplicationTable(5);
        printChessBoard(5, 6);
    }

    //    Базовые операции в Java
    //    Задача 1: Сложение и вычитание чисел
    //    Напишите программу, которая принимает два числа с консоли, складывает их и выводит разность.
    private static void sumAndSubtract() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number");
        int num1 = scanner.nextInt();
        System.out.println("Type second number");
        int num2 = scanner.nextInt();
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
    }

    //    Задачи на if и switch
    //    Задача 2: Калькулятор с использованием switch
    //    Реализуйте простой калькулятор, который выполняет операции +, -, *, /, используя switch.
    private static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number");
        int num1 = scanner.nextInt();
        System.out.println("Type second number");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Type operation (+ - * /)");
        String operation = scanner.nextLine();

        switch (operation) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Division by 0 is forbidden");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Unknown operation");
                break;
        }
    }

    //    Задачи на for
    //    Задача 3: Таблица умножения для числа
    //    Пользователь вводит число. Выведите таблицу умножения для этого числа от 1 до 10.
    private static void printMultiplicationTable(int number) {
        System.out.println("Multiplication table for number: " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (i * number));
        }
    }

    //    Задачи на вложенные циклы
    //    Задача 5: Шахматная доска
    //    Выведите шахматную доску размером N x N, где клетки чередуются символами # и ..
    private static void printChessBoard(int x, int y) {
        boolean startLineWithHash = true;
        for (int i = 0; i < y; i++) {
            boolean shouldPrintHash = startLineWithHash;
            for (int j = 0; j < x; j++) {
                if (shouldPrintHash) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
                shouldPrintHash = !shouldPrintHash;
            }
            startLineWithHash = !startLineWithHash;
            System.out.print("\n");
        }
    }
}