# Merge Sort в Java

Этот проект демонстрирует пример реализации сортировки слиянием (merge sort) на языке Java.

## Структура проекта

- src

- MergeSort.java

- README.md

## Как использовать

Программа включает в себя класс `MergeSort`, который содержит методы для сортировки массива с использованием сортировки слиянием.

### Пример использования

```java
public class Main {

    public static void main(String[] args) {
        int[] A = {5, 2, 4, 6, 1, 3, 2, 6};

        MergeSort.sort(A, 0, A.length - 1);

        System.out.print("Sorted array: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }

}