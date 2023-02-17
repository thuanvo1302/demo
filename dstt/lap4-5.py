from os import system
from matplotlib import projections
import numpy as np
import matplotlib.pyplot as plt
import math
from mpl_toolkits.mplot3d import Axes3D
#cau1
system("cls")
print("cau1a")
A= np.array([[1,2,1],[2,-1,1],[2,1,0]])
v=np.array([0,0,0])
x=np.linalg.solve(A,v.T)
print(x)
print("cau1b")
A=np.array([[2,1,1,1],[1,2,1,1],[1,1,2,2],[1,1,1,2]])
v=np.array([1,1,1,1])
x=np.linalg.solve(A,v.T)
print(x)
#cau2

a1 = 4
a2 = 2
b1 = 8
b2 = 4
c1 =  12
c2 = 100

x=np.arange(-5,5)

y1= (c1-a1*x)/b1
y2 = (c2 - a2*x)/b2
fig = plt.figure()
plt.plot(x,y1,'r')
plt.plot(x,y2,'k')
# plt.show()

a1 = 4
a2 = 2
b1 = 1
b2 = 3
c1 =  12
c2 = 80

x=np.arange(-5,5)

y1= (c1-a1*x)/b1
y2 = (c2 - a2*x)/b2
fig = plt.figure()
plt.plot(x,y1,'r')
plt.plot(x,y2,'k')
# plt.show()

a1 = 4
a2 = 2
b1 = 8
b2 = 4
c1 =  12
c2 = 6

x=np.arange(-5,5)

y1= (c1-a1*x)/b1
y2 = (c2 - a2*x)/b2
fig = plt.figure()
plt.plot(x,y1,'r')
plt.plot(x,y2,'k')
# plt.show()
#cau3
fig = plt.figure()
ax = fig.add_subplot(111,projection='3d')
a = 1
b = 1
c = 1
d = 1
x,y = np.meshgrid(np.arange(-4,4),np.arange(-4,4))
z=(d - a*x - b*y)/c
ax.plot_surface(x,y,z,cmap=plt.cm.hsv , alpha = 0.5)
# plt.show()
#cau4a
A=np.array([[1,1,2],[3,6,-5],[2,4,-3]])
B=np.array([1,-1,0])
d=np.linalg.det(A)
print("cau4a")
print("detA= ",np.round(d))
if(d==0):
    print("A is not invertible")
else:
    print("A is invertible")
#cau4b
print("cau4b")
d= np.linalg.inv(A)@B
print(d)
#cau5
A=np.array([[1,1,2],[3,6,-5],[2,4,-3]])
v=np.array([1,-1,0])
x=np.linalg.solve(A,v.T)
print("cau5: c1")
print(x)
print("cau5: c2")
x1=np.linalg.inv(A)@v
print(x1)
Dx=np.array([[1,1,2],[-1,6,-5],[0,4,-3]])
Dy=np.array([[1,1,2],[3,-1,-5],[2,0,-3]])
Dz=np.array([[1,1,1],[3,6,-1],[2,4,0]])
x=np.linalg.det(Dx)/np.linalg.det(A)
y=np.linalg.det(Dy)/np.linalg.det(A)
z=np.linalg.det(Dz)/np.linalg.det(A)
print("cau5: c3")
print(np.array([x,y,z]))
#cau6
A=np.array([[1,1,1],[1,2,4],[1,3,9]])
v=np.array([6,15,38])
x=np.linalg.solve(A,v.T)
print("cau6")
print(x)
#cau7
A=np.array([[3,3.2],[3.5,3.6]])
B=np.array([118.4,135.2])
x=np.linalg.solve(A,np.transpose(B))
print("Children {} Adult {}".format(np.around(x[0]),np.around(x[1])))
#cau8
t=1
print("cau8")
print("The time t=",t)
A=np.array([[2,-4,4],[0,-2,2],[2,-2,0]])
B=np.array([3.86-(0.077*t),-3.47+(0.056*t),0])
x=np.linalg.solve(A,np.transpose(B))
print(x)
#cau9
print("cau9")
A=np.array([[0.61,0.29,0.15],[0.35,0.59,0.063],[0.04,0.12,0.787]])
B=np.array([1,1,1])
x=np.linalg.solve(A,B.T)
print(x)
#cau10
print("cau10")
A=np.array([[0.25,0.15,0.1],[0.4,0.15,0.2],[0.15,0.2,0.2]])
D=np.array([100,100,100])
print(np.round(np.transpose(D)@np.linalg.inv(1-A),2))
#cau11
print("cau11")

A=np.array([[3,-1,0],
            [8,0,-2],
            [0,-2,-1]])
x2=5
B=np.array([0,0,-2*x2])
x=np.linalg.solve(A,B.T)
print("x2= {}\nx1, x3, x4: {}".format(x2,x))


