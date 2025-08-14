import java.util.Scanner;

public class Nguyento {
    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // số <= 1 không phải số nguyên tố
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; // nếu chia hết cho i thì không phải nguyên tố
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " là số nguyên tố");
        } else {
            System.out.println(n + " không phải là số nguyên tố");
        }

        sc.close();
    }
}
