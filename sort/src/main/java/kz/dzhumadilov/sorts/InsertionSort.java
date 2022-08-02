package kz.dzhumadilov.sorts;

import java.util.Arrays;

public class InsertionSort implements Sort {
    @Override
    public Integer[] sort(Integer[] integers) {
        for (int i = 1; i < integers.length; i++) {
            int minValue = integers[i];
            int j = i - 1;
            while (j >= 0 && integers[j] > minValue) {
                integers[j + 1] = integers[j];
                j--;
            }
            integers[j+1]=minValue;
            System.out.println(Arrays.toString((integers)));
        }
        return integers;
    }
}
