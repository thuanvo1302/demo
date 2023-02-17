import random
import statistics
import collections
import numpy as np
#cau a
n=10000
def simualtor_dice(n):
    result=[]
   
    for i in range(n):
        die1= random.randint(1,6)
        die2=random.randint(1,6)
        result.append([die1,die2])
    return result
  
x= simualtor_dice(n)



#cau b
def simualtor_dice1(n):
    sum_res=[]
    for i in range(n):
        die1= random.randint(1,6)
        die2=random.randint(1,6)
        sum_res.append(die1+die2)
    return sum_res
X=simualtor_dice1(n)
#cau c
def probalility(n):
    result=[]
    dic=collections.Counter(X)
    for i, j in dic.items():
        result.append([i,j/n])
    return result
P= probalility(n)



#cau d
key=[]
values=[]
for i,j in P:
    key.append(i)
    values.append(j)


def expected_value(values, key):
    values = np.asarray(values)
    key = np.asarray(key)
    return (values * key).sum() / key.sum()

expectation=expected_value(values,key)
variance=statistics.variance(values)
standard_deviation=statistics.stdev(values)