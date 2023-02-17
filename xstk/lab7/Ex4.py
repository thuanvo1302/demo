import itertools
import random
def cross(A, B):
    return {a + b for a in A for b in B}
URN = cross('B', '123') | cross('R', '1234') | cross('W', '12')

def combos(items, n):
    return {' '.join(combo) for combo in itertools.permutations(items, n)}
U3 = list(combos(URN, 3))
white1Blue1red1 = []
for i in U3:
    if i.count('B') == 1 and i.count('W') == 1 and i.count('R')==1:
        white1Blue1red1.append(i)
print(white1Blue1red1)

P = len(white1Blue1red1)/len(U3)
print(P)