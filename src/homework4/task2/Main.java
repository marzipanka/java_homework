package homework4.task2;

//Задача 2: Строки (Strings)
//        Создать функцию, которая принимает строку и возвращает её в обратном порядке.
public class Main {
    public static void main(String[] args) {
        String input = "Hello world";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}