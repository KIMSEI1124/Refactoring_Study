package removeControlFlag;

public class DontUseBreakAndReturn {
    private static void useFlag() {
        int i = 0;
        boolean flag = true;
        while (flag) {
            if (i == 10) {
                flag = false;
            }
            i++;
        }
    }

    private static void dontUseFlag() {
        int i = 0;
        while (true) {
            if (i == 10) {
                break;
            }
            i++;
        }
    }
}
