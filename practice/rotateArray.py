import sys

def leftRotation(a, d):
    while d> len(a):
        d = a - d
    tmpR = a[:d]
    tmpL = a[d:]
    return tmpL + tmpR
    

if __name__ == "__main__":
    n, d = input().strip().split(' ')
    n, d = [int(n), int(d)]
    a = list(map(int, input().strip().split(' ')))
    result = leftRotation(a, d)
    print (" ".join(map(str, result)))