def solve(file):
	lines = open(file,'r')
	for line in lines:
		line = line.split()
		temp = int(line.pop())
		city = ''
		for i in line:
			city += i + ' '
		adict[city] = temp
	lines.close() #nho close file khong ong ay tru diem
	#trong cai adict co tat ca thong tin roi day
	
	highesttemp =max(adict.values())
	for key in adict.keys():
		if adict[key] == highesttemp:
			print(" hottest city is:", key)

	for key in sorted(adict.keys()):
		print( key, adict[key])

	wFile = open("newCityFile.txt",'w')
	for key in sorted(adict.keys()):
		wFile.write(key, ' :',adict[key])

	wfile.close()