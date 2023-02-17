import random 
import numpy as np
import math
#1a
x=np.random.choice([0,1,2,3,4,5], 3650, p=[0.1,0.2,0.3,0.2,0.15,0.05])
x=set(x)
X=[random.randint(0,5) for i in x]
print(X)
#1b
P=[X.count(i)/len(X) for i in x]
print(P)
#1c
#Expectations
EX=0
for X in x:
  EX=EX+(X*P[X-1])
print(EX)
#Variance
VarX =0
for X in x:
  VarX = VarX +(X-EX)*(X-EX)*P[X-1]
print(VarX)
#Standard Deviation
SD=math.sqrt(VarX)
print(SD)
#1d
FX= sum(P[3:])
print(FX)