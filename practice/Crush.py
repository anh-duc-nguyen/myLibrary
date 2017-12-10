#!/bin/python

import sys

if __name__ == "__main__":
    n, m = raw_input().strip().split(' ')
    n, m = [int(n), int(m)]
    L = [0]*n
    for a0 in xrange(m):
        a, b, k = raw_input().strip().split(' ')
        a, b, k = [int(a), int(b), int(k)]
        for i in range(a-1,b):
            L[i] +=k
    print(max(L))
#this Wont work (runtime error)


