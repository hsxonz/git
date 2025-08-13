-- Tạo bảng KhachHang
CREATE TABLE KhachHang (
  id TEXT PRIMARY KEY,
  ten TEXT,
  diaChi TEXT,
  soDienThoai TEXT
);

-- Tạo bảng Xe
CREATE TABLE Xe (
  id TEXT PRIMARY KEY,
  loaiXe TEXT,
  tinhTrang TEXT,
  giaThue REAL
);

-- Tạo bảng HopDong
CREATE TABLE HopDong (
  id TEXT PRIMARY KEY,
  ngayBatDau DATE,
  ngayKetThuc DATE,
  idKhachHang TEXT,
  idXe TEXT,
  FOREIGN KEY (idKhachHang) REFERENCES KhachHang(id),
  FOREIGN KEY (idXe) REFERENCES Xe(id)
);

-- Truy vấn danh sách xe còn trống
SELECT * FROM Xe WHERE tinhTrang = 'Con trong';

-- Truy vấn hợp đồng của khách hàng
SELECT * FROM HopDong WHERE idKhachHang = 'KH001';

-- Truy vấn lịch sử thuê xe của khách hàng
SELECT HopDong.*, Xe.loaiXe 
FROM HopDong JOIN Xe ON HopDong.idXe = Xe.id 
WHERE HopDong.idKhachHang = 'KH001';


1. Các lệnh SQL thông dụng
---------------------------

- SELECT
  > Truy vấn dữ liệu từ bảng.
  > Ví dụ: SELECT * FROM Customers;

- WHERE
  > Lọc dữ liệu theo điều kiện.
  > Ví dụ: SELECT * FROM Customers WHERE age > 30;

- INSERT INTO
  > Thêm dữ liệu mới vào bảng.
  > Ví dụ: INSERT INTO Customers (name, age) VALUES ('John', 25);

- UPDATE
  > Cập nhật dữ liệu trong bảng.
  > Ví dụ: UPDATE Customers SET age = 26 WHERE name = 'John';

- DELETE
  > Xóa dữ liệu từ bảng.
  > Ví dụ: DELETE FROM Customers WHERE age < 18;

- CREATE TABLE
  > Tạo bảng mới.
  > Ví dụ:
    CREATE TABLE Customers (
      id INT PRIMARY KEY,
      name VARCHAR(100),
      age INT
    );

- ALTER TABLE
  > Thay đổi cấu trúc bảng (thêm cột, sửa cột).
  > Ví dụ: ALTER TABLE Customers ADD email VARCHAR(255);

- DROP TABLE
  > Xóa bảng khỏi cơ sở dữ liệu.
  > Ví dụ: DROP TABLE Customers;

- JOIN
  > Kết hợp dữ liệu từ nhiều bảng dựa trên điều kiện chung.
  > Ví dụ:
    SELECT Orders.id, Customers.name
    FROM Orders
    INNER JOIN Customers ON Orders.customer_id = Customers.id;

- GROUP BY
  > Gom nhóm dữ liệu theo trường.
  > Ví dụ: SELECT age, COUNT(*) FROM Customers GROUP BY age;

- ORDER BY
  > Sắp xếp dữ liệu theo trường (ASC tăng dần, DESC giảm dần).
  > Ví dụ: SELECT * FROM Customers ORDER BY age DESC;

- HAVING
  > Lọc các nhóm dữ liệu (dùng với GROUP BY).
  > Ví dụ: SELECT age, COUNT(*) FROM Customers GROUP BY age HAVING COUNT(*) > 1;

- DISTINCT
  > Lấy các giá trị duy nhất.
  > Ví dụ: SELECT DISTINCT city FROM Customers;

- LIMIT
  > Giới hạn số lượng bản ghi trả về.
  > Ví dụ: SELECT * FROM Customers LIMIT 10;

---

2. Các kiểu dữ liệu phổ biến trong SQL
-------------------------------------

- INT (INTEGER)
  > Số nguyên, dùng để lưu các giá trị số nguyên.
  > Ví dụ: tuổi, số lượng.

- FLOAT, DOUBLE, DECIMAL
  > Số thực (có phần thập phân).
  > DECIMAL dùng để lưu chính xác các giá trị tiền tệ.

- VARCHAR(n)
  > Chuỗi ký tự có độ dài biến đổi, tối đa n ký tự.
  > Ví dụ: tên, email.

- CHAR(n)
  > Chuỗi ký tự có độ dài cố định n ký tự.

- TEXT
  > Chuỗi ký tự dài (dùng cho mô tả, nội dung lớn).

- DATE
  > Ngày (yyyy-mm-dd).

- DATETIME, TIMESTAMP
  > Ngày và giờ.

- BOOLEAN (BOOL)
  > Giá trị đúng/sai (true/false).

---

3. Ghi chú thêm
---------------

- Luôn khai báo khóa chính (PRIMARY KEY) cho bảng để định danh bản ghi duy nhất.
- Sử dụng khóa ngoại (FOREIGN KEY) để liên kết giữa các bảng.
- Kiểu dữ liệu nên chọn phù hợp với dữ liệu thực tế để tối ưu hiệu năng.
- Sử dụng chỉ mục (INDEX) để tăng tốc truy vấn với các cột thường xuyên tìm kiếm hoặc join.

---

END OF FILE
