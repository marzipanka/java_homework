package homework4.task5;

import java.util.LinkedList;
import java.util.Queue;

//Задача 5: Очереди (Queues)
//        Разработать метод, который использует очередь для ротации элементов массива вправо на n позиций.
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = 2;
        rotateArray(array, n);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void rotateArray(int[] array, int n) {
        int length = array.length;
        n = n % length;

        Queue<Integer> queue = new LinkedList<>();

        for (int num : array) {
            queue.offer(num);
        }

        for (int i = 0; i < n; i++) {
            int temp = queue.poll();
            queue.offer(temp);
        }

        for (int i = 0; i < length; i++) {
            array[i] = queue.poll();
        }
    }
}

