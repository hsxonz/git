public class Square {
    private double x;
    private double y;
    protected double side;

    // Constructor mặc định
    public Square() {
        this.x = 0;
        this.y = 0;
        this.side = 0;
    }

    // Constructor có tham số
    public Square(double x, double y, double side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }

    // Setter cạnh
    public void setSide(double side) {
        this.side = side;
    }

    // Getter cạnh
    public double getSide() {
        return this.side;
    }

    // Tính diện tích
    public double getArea() {
        return side * side;
    }

    // Hiển thị thông tin
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + side + ")";
    }

    // Test
    public static void main(String[] args) {
        Square s = new Square(1.0, 1.0, 4.0);
        System.out.println("Thông tin hình vuông: " + s.toString());
        System.out.println("Diện tích hình vuông: " + s.getArea());
    }
}

