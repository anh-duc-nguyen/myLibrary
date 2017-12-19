def solve(aString):
	binary = ''
	for char in aString:
		if char == "0" or char == "1":
			binary += char
	return int(binary,2)


print solve("Dkm ba1 nay de vcl ma thang m1 L0ng kh0ng lam duoc, ngu vc1 :)) ")