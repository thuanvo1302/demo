
import itertools

def cross(A, B):

  return {a + b for a in A for b in B}
E1={'M','P','C','L'}
# urn = cross ('M','1234') |cross('P', '123')|cross('C', '12')|cross('L', '1')
urn_1 = cross('M', '1234') 
urn_2 = cross('P', '123') 
urn_3 = cross('C', '12') 
urn_4 = cross('L', '1')
count=0
U_2=list(itertools.permutations(urn_1,4))
U_3=list(itertools.permutations(urn_2,3))
U_4=list(itertools.permutations(urn_3,2))
U_5=list(itertools.permutations(urn_4,1))
U_6=[U_2,U_3,U_4,U_5]
U_7=list(itertools.permutations(U_6,4))
print(U_7)
