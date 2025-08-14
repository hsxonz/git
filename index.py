import requests

def get_cau_hoi():
    url = "https://proxyproxy.online/chuyen_mon/cau_hoi"
    payload = {
        "cau_hoi": "Viết hàm kiểm tra số nguyên n có phải là số nguyên tố hay không. Biết rằng số nguyên tố là số \u003E 1, chỉ chia hết cho 1 và chính nó. Hàm trả về 1 nếu n là số nguyên tố, ngược lại trả về 0. Ngôn ngữ có thể dùng: C/C  , C"
    }

    response = requests.post(url, json=payload) 
    data = response.json()
    print(data)


def get_dap_an():
    url = "https://proxyproxy.online/chuyen_mon/dap_an"

    response = requests.get(url) 
    data = response.json()
    print(data)

# get_cau_hoi()
get_dap_an()