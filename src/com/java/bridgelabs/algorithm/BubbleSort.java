package com.java.bridgelabs.algorithm;

public class BubbleSort
{
    public static void main(String args[]) {

        System.out.println("Before Sorting Array : ");

        int array[] = {313, 12, 58, 458, 325, 16, 54, 45, 65};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        bubbleSort(array);
        System.out.println(" ");
        System.out.println("After Sorting Array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    public static void bubbleSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
