package com.slethron.sort;

import java.util.List;

public class SortingAlgorithms {
    public static <E extends Comparable<E>> void bubbleSort(List<E> items) {
        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for (var i = 0; i < items.size() - 1; i++) {
                if (items.get(i).compareTo(items.get(i + 1)) > 0) {
                    var temp = items.get(i);
                    items.set(i, items.get(i + 1));
                    items.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }

    public static <E extends Comparable<E>> void recursiveBubbleSort(List<E> items) {
        if (items.size() == 1) {
            return;
        }

        for (var i = 0; i < items.size(); i++) {
            if (items.get(i).compareTo(items.get(i + 1)) > 0) {
                var temp = items.get(i);
                items.set(i, items.get(i + 1));
                items.set(i + 1, temp);
            }
        }

        recursiveBubbleSort(items);
    }
}
