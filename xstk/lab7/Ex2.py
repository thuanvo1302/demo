
import itertools
from fractions import Fraction
def cross(A, B):
    return {a + b for a in A for b in B}
def combos(items , n):

  return {' '.join(combo) for combo in itertools.combinations(items , n)}
def P(event , space):
    return Fraction(len(event & space), len(space))
urn = cross('B', '12') | cross('R', '123') | cross('W', '12345')
U3 = combos(urn, 3)
#cau a
def sameColor(U3):
    return {s for s in U3 if s.count('W')==3 or s.count('R')==3 or s.count('B')==3}
caua=sameColor(U3)
print(P(caua,U3))
#cau b
def differentColor(U3):
    return {s for s in U3 if s.count('W')==1 and s.count('R')==1 and s.count('B')==1}
caub=differentColor(U3)
print(P(caub,U3))
#cau c
def same2Color(U3):
    return {s for s in U3 if s.count('W')==2 or s.count('R')==2 or s.count('B')==2}
cauc=same2Color(U3)
print(P(cauc,U3))
#cau d
def r2w1(U3):
    return {s for s in U3 if s.count('W')==1 and s.count('R')==2}
caud=r2w1(U3)
print(P(caud,U3))
#cau e
w3={s for s in U3 if s.count('W')==3}
print(w3)
