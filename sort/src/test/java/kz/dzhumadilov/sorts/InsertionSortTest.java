package kz.dzhumadilov.sorts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    Integer[] integers;

    @BeforeEach
    void setUp() {
        integers = new Integer[]{8, 2, 7, 3, 6, 1, 5};
    }

    @Test
    void sort() {
        Sort sort = new InsertionSort();
        System.out.println(Arrays.toString(sort.sort(integers)));

    }
}