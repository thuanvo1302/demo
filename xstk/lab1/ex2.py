#ex2
import itertools

def cross(A, B):

  return {a + b for a in A for b in B}
urn = cross('W', '12345678') | cross('B', '123456') | cross('R', '123456789')
print(urn)
U3 = list(itertools.combinations(urn, 3))
print(len(U3))
# 2a
for s in U3:
  print(s)
# 2b
A=[]
for i in U3:
  if i[0][0] != i[-1][0] and i[0][0] != i[-2][0] and i[-1][0] != i[-2][0]:
    A.append(i)
for i in A:
  print(i)
print(len(A))
# 2c
for s in U3:
  if s[0][0]=='W' and s[-2][0]=='R':
    print(s)