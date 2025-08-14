Viết lớp Rectangle trong Java, có thuộc tính:

x: double – tọa độ X của tâm

y: double – tọa độ Y của tâm

width: double – chiều rộng (được khai báo protected để các lớp con có thể truy cập)

height: double – chiều cao (được khai báo protected để các lớp con có thể truy cập)

Các constructor:

Không tham số → tạo hình chữ nhật mặc định

Có tham số (x, y, width, height) → tạo hình chữ nhật với tọa độ tâm và kích thước cho trước

Các phương thức:

setSize(double width, double height) → thay đổi kích thước

getWidth() → trả về chiều rộng

getHeight() → trả về chiều cao

getArea() → trả về diện tích hình chữ nhật (width×height)

toString() → trả về chuỗi dạng "(x, y, width, height)"

Trong hàm main:

Tạo 1 đối tượng Rectangle

Gọi toString() và getArea() để in ra màn hình

