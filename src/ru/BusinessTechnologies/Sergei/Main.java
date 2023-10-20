package ru.BusinessTechnologies.Sergei;

import ru.BusinessTechnologies.Sergei.sorting.MergeSort;

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