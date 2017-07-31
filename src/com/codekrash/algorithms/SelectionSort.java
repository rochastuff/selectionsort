package com.codekrash.algorithms;

import java.util.Arrays;

/**
 * Created by juanrocha on 7/30/17.
 */
public class SelectionSort {

    public static void main(String args[]) {

        int[] arrayUnordered = {14, 3, 65, 15, 85, 9, 56, 87};

        System.out.println("Original array: ");
        for(int number : arrayUnordered) {
            System.out.print(number + "\t");
        }

        int[] arrayOrdered = sort(arrayUnordered);
        System.out.println("\n\nSorted array: ");
        for(int number : arrayOrdered) {
            System.out.print(number + "\t");
        }

    }

    private static int[] sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index])
                    index = j;
            }

            int aux = array[index];
            array[index] = array[i];
            array[i] = aux;
        }

        return array;
    }

}
