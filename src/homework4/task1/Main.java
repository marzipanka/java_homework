package homework4.task1;


//Задача 1: Массивы (Arrays)
//        Написать метод, который принимает массив целых чисел и возвращает сумму всех элементов массива.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = sumArray(numbers);
        System.out.println("Сумма элементов массива: " + sum);
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
