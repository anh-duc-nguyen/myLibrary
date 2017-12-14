#!/bin/python

import sys

if __name__ == "__main__":
    n, m = raw_input().strip().split(' ')
    n, m = [int(n), int(m)]
    L = [0]*(n+1)
    for a0 in xrange(m):
        a, b, k = raw_input().strip().split(' ')
        a, b, k = [int(a), int(b), int(k)]
        L[a-1] += k
        L[b] -= k
    maxi =0
    print(L)
    for i in range(1,n):
    	L[i] += L[i-1]
    maxi = max(L)


    print(maxi)
    #this Wont work (runtime error)


