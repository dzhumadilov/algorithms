package kz.dzhumadilov.sorts;


import java.util.Arrays;

public class BubbleSort implements Sort {

    @Override
    public Integer[] sort(Integer[] integers) {
        int t = integers.length - 1;
        while (t >= 0) {
            for (int i = integers.length - 1; i > 0; i--) {
                if (integers[i] < integers[i - 1]) {
                    int temp = integers[i - 1];
                    integers[i - 1] = integers[i];
                    integers[i] = temp;
                }
            }
            t--;
            System.out.println(Arrays.toString(integers));
        }
        return integers;
    }
}
