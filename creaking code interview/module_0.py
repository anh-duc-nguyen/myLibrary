def pairSum(n):
    total = 0
    for i in range(n):
        total += i + i+1
    return total

print(pairSum(12))
