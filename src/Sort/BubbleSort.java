package Sort;

/**
 * Bubble Sort
 * Repeatedly swapping pairs of the adjacent elements if they are in the wrong order.
 * @author Sunkwon Kim <kimsu@merrimack.edu>
 * @version 1.0.0
 * @since week 2 of csc6301
 */

import java.util.LinkedList;

/**
 * Traverse the array from first to last element.
 * Swap adjacent elements if the current element is greater than the next element.
 */
public class BubbleSort {
    /**
     * Traverse the array from first to last element
     * Swap adjacent elements if the current element is greater than the next element.
     * @param arr String array to be sorted in ascending order
     */
    public void sort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for (int i=0; i < n; i++) {
            for (int j=0; j < (n-1); j++) {
                if (arr[j] > arr[j+1]){
                    // swap elements
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    /**
     * The element of the array to be displayed in ascending order.
     * @param arr String array
     */
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * The args to be sorted in ascending order.
     * The sorted array displays array elements in order.
     *
     * @param args String array to be sorted and displayed
     */
    public static void main(String[] args) {
        BubbleSort object = new BubbleSort();
        int[] arr = {2, 45, 37, 21, 31, 50, 29, 22, 67, 88, 56};
        object.sort(arr);
        System.out.println("Sorted Array");
        object.printArray(arr);
    }
}

