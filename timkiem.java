import java.util.Scanner;

public class timkiem {

    // Hàm tìm kiếm tuyến tính
    public static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // Trả về vị trí tìm thấy
            }
        }
        return -1; // Không tìm thấy
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử N
        System.out.print("Nhập số lượng phần tử N (0 < N <= 1000): ");
        int N = sc.nextInt();

        // Kiểm tra điều kiện N
        if (N <= 0 || N > 1000) {
            System.out.println("Giá trị N không hợp lệ!");
            return;
        }

        // Nhập mảng gồm N phần tử
        int[] arr = new int[N];
        System.out.println("Nhập " + N + " phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Nhập giá trị cần tìm
        System.out.print("Nhập giá trị x cần tìm: ");
        int x = sc.nextInt();

        // Gọi hàm tìm kiếm
        int pos = search(arr, x);

        // In kết quả
        if (pos != -1) {
            System.out.println("Tìm thấy " + x + " tại vị trí index = " + pos);
        } else {
            System.out.println(x + " không tồn tại trong mảng");
        }
    }
}


