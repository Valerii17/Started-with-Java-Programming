package org.example.algorithmsDataStructures;

public class HeapSort {
    public void sort(int arr[]) {
        int n = arr.length;

        // Построение кучи (перегруппировка массива)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Извлечение элементов из кучи один за другим
        for (int i = n - 1; i > 0; i--) {
            // Перемещение текущего корня в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызов процедуры heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i; // Инициализация наибольшего элемента как корня
        int l = 2 * i + 1; // Левый = 2*i + 1
        int r = 2 * i + 2; // Правый = 2*i + 2

        // Если левый дочерний элемент больше корня
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // Если самый большой элемент не корень
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно heapify затронутая поддерево
            heapify(arr, n, largest);
        }
    }

    // Вспомогательный метод для вывода на экран массива
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

        public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);

        System.out.println("Отсортированный массив:");
        printArray(arr);
    }
}

