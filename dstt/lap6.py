
from re import A
import numpy as np
import math
#bai1
A1= np.array([[1,-7],[-2,-3]])
print("cau1a")
print(np.max(np.sum(abs(A1), axis =0)))
A2=np.array([[-2,8],[3,1]])
print("cau1b")
print(np.max(np.sum(abs(A2), axis =0)))
A3=np.array([[2,-8],[3,1]])
print("cau1c")
print(np.max(np.sum(abs(A3),axis=0)))
A4=np.array([[2,3],[1,-1]])
print("cau1d")
print(np.max(np.sum(abs(A4),axis=0)))
A5=np.array([[5,-4,2],[-1,2,3],[-2,1,0]])
print("cau1e")
print(np.max(np.sum(abs(A5),axis =0)))
#cau2
B1=np.array([[1,-7],[-2,-3]])
print("cau2a")
print(np.max(np.sum(abs(B1), axis =1)))
B2=np.array([[3,6],[1,0]])
print("cau2b")
print(np.max(np.sum(abs(B2), axis =1)))
B3=np.array([[5,-4,2],[-1,2,3],[-2,1,0]])
print("cau2c")
print(np.max(np.sum(abs(B3), axis =1)))
B4=np.array([[3,6,-1],[3,1,0],[2,4,-7]])
print("cau2d")
print(np.max(np.sum(abs(B4), axis =1)))
B5=np.array([[-3,0,0],[0,4,0],[0,0,2]])
print("cau2e")
print(np.max(np.sum(abs(B5), axis =1)))
#cau3
C1=np.array([[5,-4,2],[-1,2,3],[-2,1,0]])
print("cau3a", np.sqrt(np.sum(C1**2)))
C2=np.array([[1,7,3],[4,-2,-2],[-2,-1,1]])
print("cau3b", np.sqrt(np.sum(C2**2)))
C3=np.array([[2,3],[1,-1]])
print("cau3c", np.sqrt(np.sum(C3**2)))
#cau4
print("cau4a")
u=np.array([1,1])
v=np.array([0,1])
print(sum(u*v)/(np.linalg.norm(u,2)*np.linalg.norm(v,2)))
print("cau4b")
u=np.array([1,0])
v=np.array([0,1])
print(sum(u*v)/(np.linalg.norm(u,2)*np.linalg.norm(v,2)))
print("cau4c")
u=np.array([-2,3])
v=np.array([1/2,-1/2])
print(sum(u*v)/(np.linalg.norm(u,2)*np.linalg.norm(v,2)))
#cau5
print("cau5a")
u=np.array([2,3])
u1=u/np.linalg.norm(u,2)
print(u1,np.linalg.norm(u1))
print("cau5b")
u=np.array([1,2,3])
u1=u/np.linalg.norm(u,2)
print(u1,np.linalg.norm(u1))
print("cau5c")
u=np.array([[1/2,-1/2,1/4]])
u1=u/np.linalg.norm(u,2)
print(u1,np.round(np.linalg.norm(u1)))
print("cau5d")
can=np.sqrt(2)
u=np.array([[can,2,-can,can]])
u1=u/np.linalg.norm(u,2)
print(u1,np.round(np.linalg.norm(u1)))
#cau6
s1=np.array([1,2,3])
s2=np.array([7,4,3])
s3=np.array([2,1,9])
print("cau6")
print("s1->s2=",np.linalg.norm(s1-s2))
print("s2->s3=",np.linalg.norm(s2-s3))
print("s1->s3=",np.linalg.norm(s1-s3))
#cau7
E=np.array([[80,98,99,85,106,94],[71,92,76,95,100,92],[124,163,140,160,176,161]])
A=np.array([[1,2,3],[2,1,2],[3,2,4]])
print(np.linalg.inv(A)@E)
#cau8
E=np.array([[1,20,13],[20,1,4]])
print("ATTACK->\n",E)
A=np.array([[3,4,5],[1,3,1],[1,1,2]])
print("encode ATTACK\n",E@A)
E=np.array([[12,9,14],[5,1,18],[0,1,12],[7,5,2],[18,1,0],[12,1,2],[15,18,1],[20,0,15],[18,25,0]])
print("LINEAR ALGEBRA LABORATORY->\n",E)
print("encode LINEAR ALGEBRA LABORATORY\n",E@A)
#cau9
D=np.array([[0,4,0,0,0,2,1,3],[3,1,4,3,1,2,0,1],[3,0,0,0,3,0,3,0],[0,1,0,3,0,0,2,0],[2,2,2,3,1,4,0,2]])
x=range(0,6)
a=int(input("Doc i="))
b=int(input("Doc j="))
print((D[a-1]@D[b-1])/(np.linalg.norm(D[a-1],2)*np.linalg.norm(D[b-1],2)))
#cau10
q=np.array([0,0,0.7,0.5,0,0.3])
D1=np.array([1,0.5,0.3,0,0,0])
D2=np.array([])
D3=np.array([])
D4=np.array([])
D5=np.array([])
D6=np.array([])
D7=np.array([])
D8=np.array([])