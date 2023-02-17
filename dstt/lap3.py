
from os import system
import numpy as np
import math 
system("cls");
#bai1a
x=np.arange(1,6)
g= np.repeat(x,5, axis=0)
print("cau1a")
print(g.reshape(5,5))
#bai1b
x=np.arange(1,7)
g= np.repeat(x,6, axis=0)
print("cau1b")
print(g.reshape(6,6).T)
#bai1c
x=np.arange(1,31).T
print("cau1c")
print(x.reshape(5,6).T)
#bai1d
x=np.arange(1,26).T
print("cau1d")
print(x.reshape(5,5))
#bai2
h=np.random.randint(1,5, size=(5,6))
print("cau2")
print(h)
#bai3
h=np.array([[1,2,3],[4,5,6],[7,8,9,]])
print("cau3")
print(h[:,::-1])
#bai4
print("cau4")
print(h[::-1,:])
#bai5a
h=np.array([[1,2,16,31,22],[2,8,12,21,23],[4,9,11,14,25],[3,6,10,16,34]])
print("cau5a")
a=h[1,(1,2,3)]
print(a)
#bai5b
print("cau5b")
b=h[:,2]
print(b)
#bai5c
print("cau5c")
x=np.delete(h,(0,4),axis=1)
x1=np.delete(x,(0,3),axis=0)
print(x1)
#bai5d
d=np.delete(h,(1,3),axis=1)
print("cau5d")
print(d)
#bai5e
e=np.delete(h,(0),axis =0)
print("cau5e")
print(e)
#cau5f
f=np.array(h[h>12])
print("cau5f")
print(f)
#cau6a
A= np.array([[2,4,1],[6,7,2],[3,5,9]])
# x1=np.delete(A,(1,2),axis=0)
print("cau6a")
x1=np.array(A[0,:])
print(x1)

#cau6b
# Y= np.delete(A,(0), axis=0)
print("cau6b")
Y = np.array(A[(1,2),:])
print(Y)
#cau7a
A= np.array([[2,7,9,7],[3,1,5,6],[8,1,2,5]])
print("cau7a")
print(A[:,::2])
#cau7b
print("cau7b")
print(A[1::2,:])
#cau8
A=np.array([[12,5,8],[15,9,12],[10,14,10],[16,7,9],[12,10,15]])
B=np.array([2,1,3])
print("cau8")
Total = A @ B
print("Monday",Total[0])
print("Tuesday",Total[1])
print("Wednesday",Total[2])
print("Thursday",Total[3])
print("Friday",Total[4])
#cau9
T= np.array([[0.6,0.7],[0.4,0.3]])
p=np.array([[0.5],[0.5]])
k=[1,2,10,100,100000]
print("cau9")
for i in k:
    pk = np.linalg.matrix_power(T,i)@p
    print("k= {}\tpk= {}\n".format(i,pk))
#cau10
A= np.array([[-1,4,8],[-9,1,2]])
B= np.array([[5,8],[0,-6],[5,6]])
C= np.array([[-4,1],[6,5]])
D= np.array([[-6,3,1],[8,9,-2],[6,-1,5]])
print("a)")
try:
    print(A@np.transpose(B))
except:
    print("Fail")
print("b)")
try:
    print(B@np.transpose(C))
except:
    print("Fail")
print("c)")
try:
    print(C-np.transpose(C))
except:
    print("Fail")
print("d)")
try:
    print(D-np.transpose(D))
except:
    print("Fail")
print("e)")
try:
    print(np.transpose(np.transpose(D)))
except:
    print("Fail")
print("f)")
try:
    print(2*np.transpose(C))
except:
    print("Fail")
print("g)")
try:
    print(np.transpose(A)+B)
except:
    print("Fail")
print("h)")
try:
    print(np.transpose(np.transpose(A)+B))
except:
    print("Fail")
print("i)")
try:
    print(np.transpose(2*np.transpose(A)-5*B))
except:
    print("Fail")
print("j)")
try:
    print(np.transpose(-D))
except:
    print("Fail")
print("k)")
try:
    print(-np.transpose(D))
except:
    print("Fail")
print("l)")
# try:
#     print(np.transpose(np.linalg.matrix_power(C,2)))
# except:
#     print("Fail")
try:
    print(np.transpose(C@C))
except:
    print("Fail")
print("m")
try:
    print(np.transpose(C)@(np.transpose(C)))
except:
    print("Fail")
# try:
#     print(np.linalg.matrix_power((np.transpose(C)),2))
# except:
#     print("Fail")
#cau11
A=np.array([[2,4,1],[6,7,2],[3,5,9]])
print("cau11")
print("a)")
[r,c] = A.shape
if(r==c):
    print("A is matrix square")
else:
    print("A is not matrix square")
print("b)")
AT= np.transpose(A)
if(np.array_equal(A,AT)):
    print("A is Symmetric matrix")
else:
    print("A is not Symmetric matrix")
print("c)")
if(np.array_equal(A,-AT)):
    print("A is skew-Symmetric matrix")
else:
    print("A is not skew-Symmetric matrix")
print("d)",np.triu(A))
print("e)",np.tril(A))
#cau12
print("cau12")
A=np.array([[6,0,0,5],[1,7,2,-5],[2,0,0,0],[8,3,1,8]])
print("detA= ",round(np.linalg.det(A),2))
B=np.array([[1,-2,5,2],[0,0,3,0],[2,-6,-7,5],[5,0,4,4]])
print("detB= ",round(np.linalg.det(B),2))
C=np.array([[3,5,-8,4],[0,-2,3,-7],[0,0,1,5],[0,0,0,2]])
print("detC=",round(np.linalg.det(C),2))
D=np.array([[4,0,0,0],[7,-1,0,0],[2,6,3,0],[5,-8,3,0],[5,-8,4,-3]])
[r,c]=D.shape
if(r==c):
    print("detC=",round(np.linalg.det(D),2))
else:
    print("D is not matrix square")
E=np.array([[4,0,-7,3,-5],[0,0,2,0,0],[7,3,-6,4,-8],[5,0,5,2,-3],[0,0,9,-1,2]])
print("detE=",round(np.linalg.det(E),2))
F=np.array([[6,3,2,4,0],[9,0,-4,1,0],[8,-5,6,7,1],[3,0,0,0,0],[4,2,3,2,0]])
print("detF=",round(np.linalg.det(F),2))
#cau13
print("cau13")
np.random.seed(1)
A=np.random.randint(0,10, size=(5,5))
B=np.random.randint(0,10, size=(5,5))
T=np.linalg.det(A+B)-np.linalg.det(A)-np.linalg.det(B)
if(T==0):
    print("det(A + B)=detA+detB")
else:
    print("det(A + B)!=detA+detB")
#cau14
print("cau14")
T=np.linalg.det(A@B)
T1=(np.linalg.det(A))*(np.linalg.det(B))
if(round(T,5)==round(T1,5)):
    print("det(AB)=(detA)(detB)")
else:
    print("det(AB)!=(detA)(detB)")
#cau15
print("cau15")
A=np.array([[2,4,5/2],[-3/4,2,1/4],[1/4,1/2,2]])
B=np.array([[1,-1/2,3/4],[3/2,1/2,-2],[1/4,1,1/2]])
print("a)")
print(np.linalg.inv(A)@np.linalg.inv(B))
print("\n")
print(np.linalg.inv(A@B))
print("\n")
print(np.linalg.inv(B@A))
print("b)")
print(np.transpose(np.linalg.inv(A)))
print("\n")
print(np.linalg.inv(np.transpose(A)))