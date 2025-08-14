import java.util.Scanner;

public class Cau3 {
    // Insertion Sort tăng dần
    static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    // Đọc một số nguyên, yêu cầu nhập lại nếu sai
    static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
            System.out.println("Không hợp lệ, hãy nhập số nguyên.");
            sc.next(); // bỏ token sai
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc N hợp lệ trong [0, 1000]
        int N;
        while (true) {
            N = readInt(sc, "Nhập N (0..1000): ");
            if (0 <= N && N <= 1000) break;
            System.out.println("N không hợp lệ, hãy nhập lại (0 ≤ N ≤ 1000).");
        }

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = readInt(sc, "a[" + i + "] = ");
        }

        insertionSort(a);

        // In kết quả
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i > 0) sb.append(' ');
            sb.append(a[i]);
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
