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
        int[] arr = {12, 11, 13, 5, 6, 7};
        MergeSort.sort(arr, 0, arr.length - 1);
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}