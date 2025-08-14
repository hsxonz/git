Viết lớp Triangle trong Java, có thuộc tính:

x: double – tọa độ X của tâm

y: double – tọa độ Y của tâm

base: double – chiều dài đáy (được khai báo protected để các lớp con có thể truy cập)

height: double – chiều cao (được khai báo protected để các lớp con có thể truy cập)

Các constructor:

Không tham số → tạo tam giác mặc định

Có tham số (x, y, base, height) → tạo tam giác với tọa độ tâm và kích thước cho trước

Các phương thức:

setSize(double base, double height) → thay đổi kích thước

getBase() → trả về chiều dài đáy

getHeight() → trả về chiều cao

getArea() → trả về diện tích tam giác (0.5×base×height)

toString() → trả về chuỗi dạng "(x, y, base, height)"

Trong hàm main:

Tạo 1 đối tượng Triangle

Gọi toString() và getArea() để in ra màn hình