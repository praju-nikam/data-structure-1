package com.java.bridgelabs.algorithm;

public class InsertionSort
{
    public static void main(String[] args) {
        String[] array = {"vishal", "atul", "vikas", "vaibhav"};

        System.out.println("Before Sorting Array : ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }

        System.out.println("\n");
        System.out.println("After Sorting Array : ");
        String sortedArray[] = insertionSort(array);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + "   ");
        }
    }

    public static String[] insertionSort(String array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            String key = array[j];
            int i = j-1;
            while (key.compareTo(array[i]) > 0) {
                array[j] = array[i];
                i--;
            }
            array[i+1] = key;
        }
        return array;
    }
}
