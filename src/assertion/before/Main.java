package assertion.before;

import java.util.Random;

public class Main {
    private static final Random random = new Random(1234);

    private static void execute(int length) {
        int[] data = new int[length];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(data.length);
        }

        // 데이터 표시
        SortSample sorter = new SortSample(data);
        System.out.println("Before : " + sorter);

        // 정렬해서 표시
        sorter.sort();
        System.out.println("After : " + sorter + "\n");
    }

    public static void main(String[] args) {
        execute(10);
        execute(9);
        execute(8);
        execute(7);
        execute(6);
    }
}