n = int(input())
arr = map(int, input().split())
target = int(input())
cnt = 0
for i in arr:
	if i == target:
		cnt += 1
		
print(cnt)
