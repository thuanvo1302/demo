
from os import system
import numpy as np

system("cls")
A = np.array([
     [2,2],
     [2,3]
    ])

B = np.array([
     [4],
     [6]
    ])
X = np.linalg.inv(A.T@A)@A.T@B
print("cau1")
print("X1=",X[0,0],"\nX2=",X[1,0])
# Bai 2
A = np.array([
     [0,0,1],
     [0,1,1],
     [1,2,1],
     [1,0,1],
     [4,1,1],
     [4,2,1]
    ])

B = np.array([
     [0.5],
     [1.6],
     [2.8],
     [0.8],
     [5.1],
     [5.9]

    ])
X = np.linalg.inv(A.T@A)@A.T@B
print("cau2")
print("c=",X[0,0],"\nd=",X[1,0],"\ne=",X[2,0])

# Bai 3

#Bai3_a

A=np.array([[1,0],
            [1,1],
            [1,2],
            [1,3]
           ])
B=np.array([[1],[1],[2],[2]])
X=np.linalg.inv(A.T@A)@A.T@B
print("cau3a")
print("a0=",X[0,0],",a1=",X[1,0])
#bai3_b
A=np.array([[1,1],
            [1,2],
            [1,4],
            [1,5]
           ])
B=np.array([[0],[1],[2],[3]])
X=np.linalg.inv(A.T@A)@A.T@B
print("cau3b")
print("a0=",X[0,0],",a1=",X[1,0])
#bai3_c
A=np.array([[1,-1],
            [1,0],
            [1,1],
            [1,2]
           ])
B=np.array([[0],[1],[2],[4]])
X=np.linalg.inv(A.T@A)@A.T@B
print("cau3c")
print("a0=",X[0,0],",a1=",X[1,0])
#bai3_d
A=np.array([[1,2],
            [1,3],
            [1,5],
            [1,6]
           ])
B=np.array([[3],[2],[1],[0]])
X=np.linalg.inv(A.T@A)@A.T@B
print("cau3d")
print("a0=",X[0,0],",a1=",X[1,0])

#bai4
A = np.array([
    [1,2000],
    [1,6000],
    [1,20000],
    [1,30000],
    [1,40000]
    ])

B= np.array([
    [20],
    [18],
    [10],
    [6],
    [2],
    ])
print("cau4")
X=np.linalg.inv(A.T@A)@A.T@B
print("y=",X[0,0],",a=",X[1,0])
#bai5
print("cau5")
A=np.array([[np.cos(1),np.sin(1)],[np.cos(2),np.sin(2)],[np.cos(3),np.sin(3)]])
B=np.array([[7.9],[5.4],[-9]])
x=np.linalg.inv(A.T@A)@A.T@B
print("A=",x[0,0],"B=",x[1,0])
#Bai6
A=np.array([[1,1,1,1],
            [8,4,2,1],
            [27,9,3,1],
            [64,16,4,1],
            [125,25,5,1],
            [216,36,6,1]
            ])
B=np.array([[2.1],[3.5],[4.2],[3.1],[4.4],[6.8]
            ])
X=np.linalg.inv(A.T@A)@A.T@B
print("cau6")
print("a=",X[0,0],",b=",X[1,0],",c=",X[2,0],",d=",X[3,0])
import matplotlib.pyplot as plt
xv=np.arange(0,10,1)
yv=X[0,0]*xv**3+X[1,0]*xv**2+X[2,0]*xv+X[3,0]
fig=plt.figure(figsize=(10,5))
plt.plot(xv,yv)
C=np.array([1,2,3,4,5,6])
plt.plot(C,B,'ro')
plt.show()