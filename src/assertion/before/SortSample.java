package assertion.before;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortSample {
    private final int[] array;

    public SortSample(int[] data) {
        array = new int[data.length];
        System.arraycopy(data, 0, array, 0, data.length);
    }

    public void sort() {
        for(int i = 0; i < array.length - 1; i++) {
            int m = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[m] > array[j]) {
                    m = j;
                }
            }
            // 여기서 array[m]은 array[i] ~ array[array.length - 1]의 최솟값이어야 함
            int v = array[m];
            array[m] = array[i];
            array[i] = v;
            // 여기서 array[0] ~ array[i + 1]은 이미 정렬되어 있어야 함
        }
    }

    public String toString() {
        return Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ", "[ ", " ]"));
    }
}
