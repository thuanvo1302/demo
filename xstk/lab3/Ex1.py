from fractions import Fraction
def P(event, space):
    return Fraction(len(event & space),len(space))
#1a
S={'MMM','MMF','MFM','FMM','FFM','FMF','MFF','FFF'}
#1b
print(len(S))
#1c
B = {s for s in S}
A_B = {s for s in B if s.count('F')==2 or s.count('F')==3}
P_B = P(B, S)
P_A_B = P(A_B, S)
P_A_with_B = P_A_B/P_B
print(P_A_with_B)
#1d
A_B = {s for s in B if s.count('F')==3}
print(P(A_B,S)/P(B,S))
#1e
B = {s for s in S if 'F' in s}
print(P(A_B,S)/P(B,S))



