if __name__ =="__main__":
	n = int (input())
	N = []
	for i in range(n):
		N.append(input())
	#print(N)
	q = int (input())
	Q =[]
	for i in range(q):
		Q.append(input())
	ans =[]
	for q in Q:
		count = 0
		for n in N:
			if q == n:
				count +=1
		print(count)