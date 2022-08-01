package kz.dzhumadilov.sorts;

public class SelectionSort implements Sort {
    @Override
    public Integer[] sort(Integer[] integers) {
        for (int i = 0; i < integers.length; i++) {
            int minIndex = i;
            int minValue = integers[i];
            for (int j = i; true; i++) {
                if (integers[j] > minValue) {

                }
            }
        }
        return integers;
    }
}
