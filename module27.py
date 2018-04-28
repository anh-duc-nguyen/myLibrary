import random

def toss():
	return random.choice([True, False])

def H_Win(T,H):
	while T!=0 != H!=0:
		if toss():
			T-=1
			H+=1
		else:
			H-=1
			T+=1
	return T==0 

def module27(T,H,n):
	count = 0.0
	for i in range (n):
		if H_Win(T,H):
			count = count + 1
	print("If player H starts with $ %d and player T starts \
		with $ %d, in %d tosses, the probability that player \
		H wins the game is %f." % (T,H,n,count/n))

#print(toss()) #test toss
#print (H_Win(10,20)) #test H_win
module27(10,20,1000)  #test codule27