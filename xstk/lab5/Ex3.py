import math
from matplotlib import pyplot as plt
#cau a
def pmf_geo(p,x):
  return (math.pow(1-p,x-1))*p
print(pmf_geo(0.4,3))
#cau b
def plot_pmf_geo(p,n):
  K=list(range(0,n+1))
  P_geo=[pmf_geo(p,k) for k in K]
  plt.plot(K,P_geo,'-o')
  plt.title('PMF of Geometric(%i)' %p)
  plt.xlabel('number of Events')
  plt.ylabel('Probability of Number of Events')
  plt.show()
plot_pmf_geo(0.4,10)