package kz.dzhumadilov.sorts;

import kz.dzhumadilov.sorts.BubbleSort;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BubbleSortTest {
    private static Integer[] integers;

    @BeforeAll
    public static void init() {
        integers = new Integer[]{8, 2, 7, 3, 6, 1, 5};
    }

    @Test
    void sort() {
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sort(integers)));
    }
}