def merge(a,b):
	r = []
	for i in a:
		for j in b:
			if i < j:
				r.append(i)
				r.append(j)
			else:
				r.append(j)
				r.append(i)
	return r




a =merge([1,2,3,4,7,8],[0,5,9])
print a