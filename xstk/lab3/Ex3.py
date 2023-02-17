import itertools
import random
import fractions
# def cross(A, B):
#     return {a + b for a in A for b in B}
def P(event, space):
    return fractions.Fraction(len(event),len(space))
Ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 'J', 'Q', 'K'}
Suits = {'♡', '♢', '♣', '♠'}
#cau a
Cards = list(itertools.product(Ranks, Suits))
#cau b
Cards_3=list(itertools.combinations(Cards,3))
B=random.choice(Cards_3)
print(B)
#cau c

A_1={s for s in Cards_3  if s[0][0]=='K' and s[-2][0]=='K' and s[-1][0]!='K' or s[0][0]=='K' and s[-2][0]!='K' and s[-1][0]=='K' or s[0][0]!='K' and s[-2][0]=='K' and s[-1][0]=='K' or s[0][0]=='K' and s[-2][0]!='K' and s[-1][0]!='K' or s[0][0]!='K' and s[-2][0]!='K' and s[-1][0]=='K' or s[0][0]!='K' and s[-2][0]=='K' and s[-1][0]!='K'}
# print(A_1)

#cau d
A_2={s for s in Cards_3  if  s[0][0]=='K' and s[-2][0]=='K' and s[-1][0]=='K'}
A_2=A_1.union(A_2)
# print(A_2)
#cau e
P_A_1=P(A_1,Cards_3)
print(P_A_1)
P_A_2=P(A_2,Cards_3)
print(P_A_2)