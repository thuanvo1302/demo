import random
#cau8
import itertools
def cross(A, B):
    return {a + b for a in A for b in B}
urn = cross('W', '12345678') | cross('B', '123456') | cross('R', '123456789')
def combos(items , n):

  return {' '.join(combo) for combo in itertools.combinations(items , n)}

U6 = combos(urn, 6)
w2b2r2={s for s in U6 if s.count('W')==2 and s.count('R')==2 and s.count('B')==2}
print(len(w2b2r2)/len(U6))