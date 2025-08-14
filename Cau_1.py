# cau1.py

# --------- a) Hàm đọc n nguyên dương (>0), nhập sai thì bắt nhập lại ----------
def read_positive_int(prompt="Nhập n (>0): "):
    while True:
        s = input(prompt).strip()
        # không dùng thư viện nào, chỉ tự kiểm tra thủ công
        ok = len(s) > 0 and (s.isdigit() or (s[0] == '+' and s[1:].isdigit()))
        if ok:
            n = int(s)
            if n > 0:
                return n
        print("Dữ liệu không hợp lệ, hãy nhập lại n là số nguyên dương (>0).")

# --------- b) S(n) dùng đệ quy ----------
def S_rec(n: int) -> int:
    # n > 0 theo yêu cầu
    if n == 1:
        return 1
    return n + S_rec(n - 1)

# --------- c) S(n) không dùng đệ quy (dùng vòng lặp) ----------
def S_iter(n: int) -> int:
    total = 0
    i = 1
    while i <= n:
        total += i
        i += 1
    return total

# --------- Bộ sinh số "ngẫu nhiên" đơn giản (LCG) – không import thư viện ----------
_seed = id(object())  # lấy seed thay đổi theo lần chạy

def _lcg():
    # Tham số kiểu ANSI C: a=1103515245, c=12345, m=2^31
    global _seed
    _seed = (1103515245 * _seed + 12345) % (1 << 31)
    return _seed

def rand_int(low: int, high: int) -> int:
    if low > high:
        low, high = high, low
    span = high - low + 1
    return low + (_lcg() % span)

# --------------------------- Chương trình chính ---------------------------
if __name__ == "__main__":
    # a) nhập hợp lệ
    n_user = read_positive_int()

    # b) gọi hàm đệ quy với một giá trị ngẫu nhiên
    n_rand_rec = rand_int(1, 30)  # bạn có thể đổi khoảng nếu muốn
    # c) gọi hàm không đệ quy với một giá trị ngẫu nhiên
    n_rand_it = rand_int(1, 30)

    # Kết quả
    print(f"S({n_user}) [đệ quy]   =", S_rec(n_user))
    print(f"S({n_user}) [vòng lặp] =", S_iter(n_user))

    print(f"(Ngẫu nhiên) S({n_rand_rec}) [đệ quy]   =", S_rec(n_rand_rec))
    print(f"(Ngẫu nhiên) S({n_rand_it}) [vòng lặp] =", S_iter(n_rand_it))
