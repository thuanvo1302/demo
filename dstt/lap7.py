
import numpy as np

#bai1
u1 = np.array([3,1,1])
u2 = np.array([-1,2,1])
u3= np.array([-1/2,2,7/2])

def dis(a,b):
  print(sum(a*b))
dis(u1,u2)
dis(u2,u3)
dis(u1,u3)

#bai2
y = np.array([7,6])
u = np.array([4,2])
print(sum(y*u)/sum(u*u))

#bai3
# A = np.array([[-10,13,7,-11]
#               ,[2,1,-5,3]
#               ,[-6,3,13,-3]
#               ,[16,-16,-2,5]
#               ,[2,1,-5,-7]])
# def ortho(a):
  #mxn= list(a.shape)
  #b = np.eye()
  #print(b)
#   if (a.shape[0] != a.shape[1]):
#     return false
#   else:
#     e = a.T@a
#     if e == np.eye(a.shape[0]):
#       return true
#     else:
#       false
# ortho(A)

#bai4
A = np.array([[-10,13,7,-11]
              ,[2,1,-5,3]
              ,[-6,3,13,-3]
              ,[16,-16,-2,5]
              ,[2,1,-5,-7]])
V =np.zeros((A.shape))
def hinhchieu(u,v):
  return sum(u*v)/sum(v*v)
V[:,0] = A[:,0]
for i in range(1,V.shape[1]):
  pv = 0
  for j in range(0,i):
    pv+=hinhchieu(A[:,i],A[:,j])
  V[:,i]= np.round(A[:, i-1] - pv,2)
print(V)

#bai5
from sympy import *
C = Matrix(np.array([[1,0,2,3],[4,-1,0,2],[0,-1,-8,-10]]))
c, pivot = Matrix.rref(C)
print(c)
print("basic for col:",c[pivot,:])
print("basic for row:",C[:,pivot])

#bai6 
v1 = np.array([1,2,3,4])
v2 = np.array([-1,0,1,3])
v3 = np.array([0,5,-6,8])

w = np.array([3,-6,17,11])
## rank([v1,v2,v3]) == rank([v1,v2,v3,w])
def bai6(v1,v2,v3,w):
  rank1 = np.linalg.matrix_rank([v1,v2,v3])
  rank2 = np.linalg.matrix_rank([v1,v2,v3,w])
  if rank1 == rank2:
    print("w is a linear combination of v1, v2, v3")
  else:
    print("w is not a linear combination of v1, v2, v3")
print("cau a")
v1 = np.array([1,2,3,4])
v2 = np.array([-1,0,1,3])
v3 = np.array([0,5,-6,8])

w = np.array([3,-6,17,11])
bai6(v1,v2,v3,w)

print("cau b")
v1 = np.array([1,1,2,2])
v2 = np.array([2,3,5,6])
v3 = np.array([2,-1,3,6])

w = np.array([0,5,3,0])
bai6(v1,v2,v3,w)

print("cau c")
v1 = np.array([1,1,2,2])
v2 = np.array([2,3,5,6])
v3 = np.array([2,-1,3,6])

w = np.array([-1,6,1,-4])
bai6(v1,v2,v3,w)

print("cau d")
v1 = np.array([1,2,3,4])
v2 = np.array([-1,0,1,3])
v3 = np.array([0,5,-6,8])
v4 = np.array([1,15,-12,8])

w = np.array([0,-6,17,11])
rank1 = np.linalg.matrix_rank([v1,v2,v3,v4])
rank2 = np.linalg.matrix_rank([v1,v2,v3,v4,w])
if rank1 == rank2:
  print("w is a linear combination of v1, v2, v3")
else:
  print("w is not a linear combination of v1, v2, v3")

#cau 7
A2 = Matrix(np.array([[1,0,2,3],[4,-1,0,2],[0,-1,-8,-10]]))

# tim co so cho null space cua ma tran A2
null = Matrix.nullspace(A2)
n = np.array(null).T
print(n)
v1 = n[:,0]
v2 = n[:,1]
print(v1)
print(v2)
print(A2@n)

#cau 8
from numpy import *
print("cau a")
w = Matrix(np.array([[1,1,-1,-3]]))
A = Matrix(np.array([[7,6,-4,1],[-5,-1,0,-2],[10,-8,6,-3],[3,-2,1,0]]))
A1 = Matrix(append(A,w.T,1))
print(Matrix.rref(A1))
print(A@w.T)
print("w is column space of A")
print("cau b")
w = Matrix(np.array([[1,2,1,0]]))
A = Matrix(np.array([[-8,5,-2,0],[-5,2,1,-2],[10,-8,6,-3],[3,-2,1,0]]))
A1 = Matrix(append(A,w.T,1))
print(Matrix.rref(A1))
print(A@w.T)
print("w is both column space and null space of A")

#cau 9
C = Matrix(np.array([[5,1,2,2,0],[3,3,2,-1,-12],[8,4,4,-5,12],[2,1,1,0,-2]]))
c, pivot = Matrix.rref(C)
print(c[pivot,:])
print(pivot)

#cau 10

def checkvector(A):
  det_A = np.linalg.det(A.T)
  if det_A == 0:
    print("Linear dependent")
  else:
    print("Linear independent")
A = np.array([[1,-2,0],[0,-4,1], [1,-1,1]])
checkvector(A)
print("câu b")
A = np.array([[1,0,2],[0,1,4], [2,-2,-4]])
checkvector(A)
print("câu c")
A = np.array([[1,-2,3,4],[2,4,5,0], [-2,0,0,4],[3,2,1,-1]])
checkvector(A)
print("câu d")
A = np.array([[0,0,1,2,3],[0,0,2,3,1], [1,2,3,4,5],[2,1,0,0,0],[-1,-3,-5,0,0]])
checkvector(A)

#cau 11
A = Matrix(np.array([[1,0,2],[0,1,4],[2,-2,-4]]))
print(A.T)
a, pivot = Matrix.rref(A.T)
print(a)
print("basic:",A[pivot,:])
print("dismention:",A[pivot,:].shape[0])

def magic(n):
  n = int(n)
  if n < 3:
    raise ValueError("Size must be at least 3")
  if n % 2 == 1:
    p = np.arange(1, n+1)
    return n*np.mod(p[:, None] + p - (n+3)//2, n) + np.mod(p[:, None] + 2*p-2, n) + 1
  elif n % 4 == 0:
    J = np.mod(np.arange(1, n+1), 4) // 2
    K = J[:, None] == J
    M = np.arange(1, n*n+1, n)[:, None] + np.arange(n)
    M[K] = n*n + 1 - M[K]
  else:
    p = n//2
    M = magic(p)
    M = np.block([[M, M+2*p*p], [M+3*p*p, M+p*p]])
    i = np.arange(p)
    k = (n-2)//4
    j = np.concatenate((np.arange(k), np.arange(n-k+1, n)))
    M[np.ix_(np.concatenate((i, i+p)), j)] = M[np.ix_(np.concatenate((i+p, i)), j)]
    M[np.ix_([k, k+p], [0, k])] = M[np.ix_([k+p, k], [0, k])]
  return M
