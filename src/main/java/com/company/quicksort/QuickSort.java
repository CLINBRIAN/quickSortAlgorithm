/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.quicksort;

/**
 *
 * @author kamau
 */
public class QuickSort {

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            //here we create partition of the array
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }

    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                //swap the values to create a new i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        //update the new values of i and j and then swapping them
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 5};
        quicksort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
