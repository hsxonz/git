def dec2bin(n):  return format(n, 'b')       # 42 -> '101010', -10 -> '-1010'
def dec2hex(n):  return format(n, 'X')       # 255 -> 'FF'

def bin2dec(s):  return int(s, 2)            # '1101' -> 13
def hex2dec(s):  return int(s, 16)           # '7B' -> 123

def bin2hex(s):  return format(int(s, 2), 'X')   # '11111111' -> 'FF'
def hex2bin(s):  return format(int(s,16), 'b')   # '1A3' -> '110100011'

print(dec2bin(42))