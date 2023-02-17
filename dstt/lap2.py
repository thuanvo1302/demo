import math
import numpy as np
#cau1
print("cau1")
x = np.array([1,3,5,2,9])
print(x)
y= np.array([-1,3,15,27,29])
print(y)
#cau2a
print("cau2a")
n=int(input("Enter n: "))
lis = np.arange(12,n+1,2)
print(lis)
#cau2b
print("cau2b")
lis= np.arange(31,n+1,2)
print(lis)
#cau2c
print("cau2c")
lis= np.arange(-n,n+1,1)
print(lis)
#cau2d
print("cau2d")
print(lis[::-1])
#cau2e
print("cau2e")
lis=np.arange(10,-4,-2)
print(lis)

#cau2f
print("cau2f")
x=2**(np.arange(0,n))
lis=1/x
print(lis)
#cau2g
print("cau2g")
x=1/np.array([np.round((1.618**i-(1-1.618)**i)/np.sqrt(5)) for i in np.arange(1,n+1)])
print(x)
#cau2h
print("cau2h")

def isPrimeNumber(a):
    if (a < 2):
        return False
    squareRoot = int(math.sqrt(a))
    for i in range(2, squareRoot + 1):
        if (a % i != 0):
            return True
    return False
b=[]
# for i in range(1,n+1):
#     if (isPrimeNumber(i)):
#         b=1/np.append(i)
b= [ i for i in x if (isPrimeNumber(i))]
print(b)
#cau2k
print("cau2k")
#x=np.array((np.arange(0,n,1))/(np.arange(1,n,1)))
print(x)
#cau3
print("cau3")
x=np.array(10**np.arange(1,n,1))
print(x)
#cau4
print("cau4")
x=np.array([[1,2,3]])
y=np.array([[98,12,33]])
print(np.hstack((x,y)))
#cau5
print("cau5")
print(np.vstack((x,y)))
#cau6a
print("cau6a")
x=np.array([0,2,4,6,8,10,12,14,16,18,20])
x1=x[0:-5]
print(x1)
#cau6b
print("cau6b")
x1=min(x)
print(x1)
#cau6c
print("cau6c")
print(x[1],x[4],x[10])
#cau6d
print("cau6d")
print(x[1],x[3],x[5],x[7])
#cau6e
print("cau6e")
print(x[::2])
#cau6f
print("cau6f")
print(x[1::2])
#cau7a
print("cau7a")
x=np.array([3,11,-9,-131,-1,1,-11,91,-6,407,-12,-11,12,153,371])
print(np.max(x))
#cau7b
print("cau7b")
print(np.min(x))
#cau7c
print("cau7c")
for i in x:
    if (i<10):
        print(i)
#cau7d
print("Cau7d")
print(x[::-1])
#cau7e
print("cau7e")
x1=sorted(x)
print(x1)
#cau7f
print("cau7f")
print(x1[::-1])
#cau7g
print("cau7g")
def req7g(x):
  k=len(x)
  count=0
  for i in range(0,k):
    for j in range(i,k):
      if x[j]+x[i]==0:
        count=count+1
  return count
k=req7g(x)
print("g) xi + xj = 0 in",k,"time")
x_1=[i for i in range(0,len(x)) for j in range(i,len(x)) if(x[i]+x[j]==0)]
print(len(x_1))
#cau7h
print("cau7h")
x_1=[i for i in range(0,len(x)) for j in range(i,len(x)) if(x[i]==x[j])]
print(len(x_1))
#cau7i
print("cau7i")
y=np.array([x[i]+x[len(x)-i-1] for i in range(0,len(x))])
print(y)
#cau7j
print("cau7j")
a=0
w1=[]
for i in x:
  a=0
  if(i>0):
    i1=str(i)
    for j in i1:
      
      a= a+ int(j)**(len(i1))
    if(a==i):
      w1.append(i)
w=np.array(w1)
print(w)
#cay7k
print("cau7k")
x_1=np.array([x[i] for i in range(0,len(x)) if x[i]>=0])
print(x_1)
#cau7l
print("cau7l")
print(np.median(x))
#cau7m
print("cau7m")
x_1=[i for i in x if(i<np.mean(x))]
print(np.sum(x_1))
#cau7n
print("cau7n")
print(np.where((x<0),abs(x),x))