import requests


data = requests.get('https://proxyproxy.online/chuyen_mon/cau_hoi?cau_hoi=xin chào bạn')
data = data.json()
print(data)