package homework4.task3;

import java.util.ArrayList;
import java.util.List;

//Задача 3: Списки (Lists)
//        Разработать метод, который принимает список целых чисел и удаляет из него все четные числа.
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        removeEvenNumbers(numbers);
        System.out.println(numbers);
    }

    public static void removeEvenNumbers(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }
    }
}