package kz.dzhumadilov.sorts;

import java.util.Arrays;

public class SelectionSort implements Sort {
    @Override
    public Integer[] sort(Integer[] integers) {
        for (int i = 0; i < integers.length; i++) {
            int minIndex = i;
            int minValue = integers[i];
            for (int j = i; j < integers.length; j++) {
                if (integers[j] < minValue) {
                    minValue = integers[j];
                    minIndex = j;
                }
            }
            int temps = integers[i];
            integers[i] = minValue;
            integers[minIndex] = temps;
            System.out.println(Arrays.toString((integers)));
        }
        return integers;
    }
}
