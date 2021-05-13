package com.gfs.codechallenge;

import java.util.Arrays;

public class Statistics {

    public static long computeMean(long[] list, float standardDeviation) {
        long accumulator = 0;
        float adjustment = (100 - standardDeviation) / 100;
        final double size = list.length * adjustment;

        Arrays.sort(list);

        for (int index = 0; index < size; index++) {
            accumulator += list[index];
        }

        return (long) (accumulator / size);
    }

    public static long computeMedian(long[] list) {
        Arrays.sort(list);
        final int size = list.length;
        long median = 0;

        if ((size % 2 != 0)) {
            median = list[((size - 1) / 2)];
        } else if (size != 1 && size % 2 == 0) {
            double a = (size) / 2 - 0.5;
            int a2 = (int) Math.ceil(a);
            double b = (size) / 2 - 0.5;
            int b2 = (int) Math.floor(b);
            median = (list[a2] + list[b2]) / 2;
        } else if (size == 1) {
            median = list[0];
        }
        return median;
    }

    public static long computeMode(long[] list) {
        long popularity1 = 0;
        long popularity2 = 0;
        long array_item;
        long mode = 0;
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            array_item = list[i];
            for (int j = 0; j < list.length; j++) {
                if (array_item == list[j]) {
                    popularity1++;
                }
            }
            if (popularity1 >= popularity2) {
                mode = array_item;
                popularity2 = popularity1;
            }

            popularity1 = 0;
        }

        return mode;
    }
}
