import numpy as np
def cau1():
  A = np.array([
                [2, 2],
                [2, 3]
  ])
  b = [4, 6]
  x = np.matmul(np.matmul(np.linalg.inv(np.matmul(A.T, A)), A.T), B)
  print("x [by formula] =", x)
  print("A*x =", np.matmul(A, x))

  x = np.linalg.lsrsq(A, b, rcond = None)
  print("x [by lstsq funtion] =", x)
  print("A*x =", np.matmul(A, x[0]))

def cau2():
  A = np.arrayy([
                 [0, 0, 1],
                 [0, 1, 1],
                 [1, 2, 1],
                 [1, 0, 1],
                 [4, 1, 1],
                 [4, 2, 1]
  ])
  B = [0.5, 1.6, 2.8, 0.8, 5.1, 5.9]
  x = np.linalg.lsrsq(A, B, rcond = None)
  print("x [by lstsq funtion] =", x)
  print("A*x =", np.matmul(A, x[0]))

def cau3a():
    A = np.array([[0], [1], [2], [3]])
    B = [1, 1, 2, 2]
    x = np.linalg.lstsq(A, b, rcond = None)
    print("x [by lstsq function] =", x)
    print("A*x =", np.matmul(A, x[0]))

def cau3b():
    A = np.array([[1], [2], [4], [5]])
    B = [1, 1, 2, 2]
    x = np.linalg.lstsq(A, b, rcond = None)
    print("x [by lstsq funtion] =", x)
    print("A*x =", np.matmul(A, x[0]))
  
def cau3c():
  A = np.array([[-1], [0], [1], [2]])
  b = [0, 1, 2, 4]
  x = np.linalg.lstsq(A, b, rcond = None)
  print("x [by lstsq funtion] =", x)
  print("A*x =", np.matmul(A, x[0]))

#cau9
import numpy as np
import matplotlib.pyplot as plt

pts = np.array(
[[1,1],
[2, 4],
[4, 11],
[1,1]])

dx = 3; 
dy = 2;
transM = [dx, dy]
trans_pts= []
for i in range(pts.shape[0]):
  trans_pts.append(pts[i] + transM )
trans_pts = np.array (trans_pts)
plt.plot (pts [:, 0], pts[:, 1], 'b*-');
plt.plot (trans_pts [:, 0], trans_pts [:, 1], 'r*-');
plt.show()

ang = 180 * np.pi/180
rotM= [[ np.cos (ang), np.sin (ang)],
       [-np.sin(ang), np.cos(ang)]
]
rot_pts = []
for i in range (pts.shape [0]):
  rot_pts.append( np.matmul(pts[i], rotM) )
rot_pts= np.array (rot_pts)
plt.plot (pts [:, 0], pts [:, 1], 'b*-');
plt.plot(rot_pts[:, 0], rot_pts[:, 1], 'r*-');
plt.show()
#Simple demo of 2D scale in MATLAB
sx = 2
sy = 1
scalM = [[sx, 0],
         [0, sy]
]
scal_pts = []
for i in range (pts.shape [0]):
  scal_pts.append( np.matmul (pts [i], scalM) )
scal_pts = np.array (scal_pts)
plt.plot (pts [:, 0], pts [:, 1], 'b*-');
plt.plot (scal_pts [:, 0], scal_pts [:, 1], 'r*-');
plt.show()

shearX = 1
shearM = [[1, shearX],
[0, 1]]
#2D shear matrix
shear_pts= []
for i in range (pts.shape [0]):
  shear_pts.append( np.matmul (pts [i], shearM) )
shear_pts = np.array (shear_pts)
plt.plot (pts [:, 0], pts [:, 1], 'b*-');
plt.plot (shear_pts [:, 0], shear_pts [:, 1], 'r*-');
plt.show()

#cau10
import numpy as np
import matplotlib.pyplot as plt

pts = np.array(
[[1,1],
[3, 1],
[1, 3]])

transform_pts = np.matmul(pts, -np.eye (2))
plt.plot (pts [:, 0], pts [:, 1], 'b*-');
plt.plot (transform_pts [:, 0], transform_pts [:, 1], 'r*-');
plt.show()

#caull
import numpy as np
import matplotlib.pyplot as plt

pts = np.array(
[[ 2.5, 5, 1],
[-2.5, 5, 1],
[-2.5, -5, 1]])
T1 = [[1/4, 0, 0],
[ 0, 1/4, 0],
[ 0, 0, 1]]
transform_pts = np.matmul (pts, T1)
plt.plot (pts [:, 0], pts [:, 1], 'b*-');
plt.plot (transform_pts [:, 0], transform_pts [:, 1], 'r*-');
plt.show()
