package assertion.after;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortSample {
    private final int[] array;

    public SortSample(int[] data) {
        array = new int[data.length];
        System.arraycopy(data, 0, array, 0, data.length);
    }

    public void sort() {
        for (int i = 0; i < array.length - 1; i++) {
            int m = i;
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[m] > array[j]) {
                    m = j;
                }
            }
            assert isMin(m, i, array.length - 1);
            int v = array[m];
            array[m] = array[i];
            array[i] = v;
            assert isSorted(0, i + 1);
        }
    }

    private boolean isMin(int pos, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (array[pos] > array[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean isSorted(int start, int end) {
        for (int i = start; i < end; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ", "[ ", " ]"));
    }
}
