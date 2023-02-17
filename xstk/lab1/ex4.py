import itertools
A=[]

def cross(A, B):

  return {a + b for a in A for b in B}
urn_1=cross ('M','123456')
urn_2=cross ('W', '123456789')
U_1=list(itertools.permutations(urn_1,3))
U_2=list(itertools.permutations(urn_2,2))
for i in U_1:
    A.append(i)
    for j in U_2:
        A.append(j)
        break
print(A)