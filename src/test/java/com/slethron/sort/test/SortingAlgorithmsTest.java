package com.slethron.sort.test;

import com.slethron.sort.SortingAlgorithms;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortingAlgorithmsTest {
    List<ComparableInteger> items;

    List<ComparableInteger> desiredResult = new ArrayList<>() {{
        add(new ComparableInteger(0));
        add(new ComparableInteger(1));
        add(new ComparableInteger(2));
        add(new ComparableInteger(3));
        add(new ComparableInteger(4));
        add(new ComparableInteger(5));
        add(new ComparableInteger(6));
    }};

    static class ComparableInteger implements Comparable<ComparableInteger> {
        Integer integer;

        ComparableInteger(Integer integer) {
            this.integer = integer;
        }

        @Override
        public int compareTo(ComparableInteger o) {
            if (integer.equals(o.integer)) {
                return 0;
            } else if (integer > o.integer) {
                return 1;
            }

            return - 1;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof ComparableInteger)) {
                return false;
            }

            return integer.equals(((ComparableInteger) o).integer);
        }
    }

    @Before
    public void init() {
        items = new ArrayList<ComparableInteger>() {{
            add(new ComparableInteger(2));
            add(new ComparableInteger(1));
            add(new ComparableInteger(3));
            add(new ComparableInteger(0));
            add(new ComparableInteger(5));
            add(new ComparableInteger(6));
            add(new ComparableInteger(4));
        }};
    }

    @Test
    public void bubbleSort() {
        SortingAlgorithms.bubbleSort(items);
        assertEquals(desiredResult, items);
    }

    @Test
    public void recursiveBubbleSort() {
        SortingAlgorithms.recursiveBubbleSort(items);
        assertEquals(desiredResult, items);
    }

    @Test
    public void insertionSort() {

    }
}
