import numpy as np

print('1)')

def eigenvalues(M):
    w, v = np.linalg.eig(M)
    print('eigenvalues = ', w)
    print('eigenvectors = ', v)


print('a)')
A = np.array([[-1, 3.5, 14],
              [0, 5, -26],
              [0, 0, 2]     ])
eigenvalues(A)

print('b)')
B = np.array([[-2, 0, 0],
              [99, 0, 0],
              [10, -4.5, 10]     ])
eigenvalues(B)

print('c)')
C = np.array([[5, 5, 0, 2],
              [0 ,2, -3, 6],
              [0, 0, 3, -2],
              [0, 0, 0, 5]     ])
eigenvalues(C)

print('\n4)')
A = np.array([[-2, 2, -3],
            [2, 1, -6],
            [-1, -2, 0]])
print('A')
eigenvalues(A)
print('\nA.T')
eigenvalues(A.T)
print('\nA^-1')
eigenvalues(np.linalg.inv(A))
#eigenvalue: A == A.T != A^-1
#eigenvectors: A != A.T != A^-1

print('\n5)')
def checkDiagonalizable(A):
    w, P = np.linalg.eig(A)
    D = np.diag(w)
    res = np.matmul(P, np.matmul(D, np.linalg.inv(P)))
    print(res)
    print(np.allclose(A, res))
    print('\n')

print('check Diagonalizable A1')
A1 = np.array([[4, -5],
            [2, -3]])
checkDiagonalizable(A1)

print('check Diagonalizable A2')
A2 = np.array([[0, 2],
            [0, 1]])
checkDiagonalizable(A2)

print('check Diagonalizable A3')
A3 = np.array([[2, 3],
            [1, 4]])
checkDiagonalizable(A3)            

print('check Diagonalizable A4')
A4 = np.array([[1, 2, -2],
            [-2, 5, -2],
            [-6, 6, -3]])
checkDiagonalizable(A4)

print('check Diagonalizable A5')
A5 = np.array([[1, 2, 3, 4],
            [5, 6, 7, 8],
            [9, 10, 11, 12],
            [13, 14, 15, 16]])
checkDiagonalizable(A5)

print('\n6)')
A = np.array([[1, 2, -2],
              [0, 3, -2], 
              [0, 0, 1]])
w, V = np.linalg.eig(A)
P = np.diag(w)
res = np.matmul(np.linalg.inv(P),np.matmul(A,P))
print(res)