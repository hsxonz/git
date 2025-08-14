Viết lớp Square trong Java, có thuộc tính:

x: double – tọa độ X của tâm

y: double – tọa độ Y của tâm

side: double – độ dài cạnh (được khai báo protected để các lớp con có thể truy cập)

Các constructor:

Không tham số → tạo hình vuông mặc định

Có tham số (x, y, side) → tạo hình vuông với tọa độ tâm và độ dài cạnh cho trước

Các phương thức:

setSide(double side) → thay đổi độ dài cạnh

getSide() → trả về độ dài cạnh

getArea() → trả về diện tích hình vuông  (side * side)

toString() → trả về chuỗi dạng "(x, y, side)"

Trong hàm main:

Tạo 1 đối tượng Square

Gọi toString() và getArea() để in ra màn hình