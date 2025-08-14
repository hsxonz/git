public class Rectangle {
    private double x;
    private double y;
    protected double width;
    protected double height;

    // Constructor mặc định
    public Rectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    // Constructor có tham số
    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Setter kích thước
    public void setSize(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getter chiều rộng
    public double getWidth() {
        return this.width;
    }

    // Getter chiều cao
    public double getHeight() {
        return this.height;
    }

    // Tính diện tích
    public double getArea() {
        return width * height;
    }

    // Hiển thị thông tin
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + width + ", " + height + ")";
    }

    // Test
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2.0, 3.0, 5.0, 7.0);
        System.out.println("Thông tin hình chữ nhật: " + r.toString());
        System.out.println("Diện tích hình chữ nhật: " + r.getArea());
    }
}
