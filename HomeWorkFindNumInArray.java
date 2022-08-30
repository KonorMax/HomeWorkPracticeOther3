package com.konor.HomeWorkPracticeOther3;

public class HomeWorkFindNumInArray {
    public static int lineFind(int[] arr, int elementToFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToFind)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr = lineFind(new int[]{12, 98, 56, 73, 6, 59, 6, 23, 85, 56}, 23);
        show(23, arr);
    }

    public static void show(int elementToFind, int index) {
        if (index == -1){
            System.out.println(elementToFind + " not find.");
        }
        else {
            System.out.println(elementToFind + " find at index: " + index);
        }
    }
}
