Viết lớp Circle trong Java, có thuộc tính:

x: double – tọa độ X của tâm

y: double – tọa độ Y của tâm

radius: double – bán kính (được khai báo protected để các lớp con có thể truy cập)

Các constructor:

Không tham số → tạo hình tròn mặc định

Có tham số (x, y, radius) → tạo hình tròn với tọa độ và bán kính cho trước

Các phương thức:

setRadius(double radius) → thay đổi bán kính

getRadius() → trả về bán kính

getArea() → trả về diện tích hình tròn (πr²)

toString() → trả về chuỗi dạng "(x, y, radius)"

Trong hàm main:

Tạo 1 đối tượng Circle

Gọi toString() và getArea() để in ra màn hình