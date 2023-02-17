import math
import random
#2a
x=[random.randint(0,2) for i in range(10000)]
#2b
X=set(x)

#2c
P=[x.count(i)/len(x) for i in X]
print(P)
#2d
#Expectations
EX=0
for x in X:
  EX=EX+(x*P[x-1])
print(EX)
#Variance
VarX =0
for x in X:
  VarX = VarX +(x-EX)*(x-EX)*P[x-1]
print(VarX)
#Standard Deviation
SD=math.sqrt(VarX)
print(SD)
#2e
FX= sum(P[1:])
print(FX)