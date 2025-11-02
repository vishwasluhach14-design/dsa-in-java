package loops;

public class divsibleby3andodd {
    static void main() {
        for (int i = 1; i <= 100; i = i + 2) {
            if (i % 3 == 0) System.out.print(i + " ");
        }
    }
}
