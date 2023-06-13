N, M = map(int, input().split())
num = [i for i in range(1, N+1)]
swap = 0
for _ in range(M):
    i, j = map(int, input().split())
    swap = num[i-1]
    num[i-1] = num[j-1]
    num[j-1] = swap
for i in num:
    print(i, end=' ')