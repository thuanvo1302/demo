from fractions import Fraction
import math
from matplotlib import pyplot as plt
#cau a
def pmf_binom(k,n,p):
  return (math.factorial(n)/(math.factorial(k)*math.factorial(n-k)))*math.pow(p,k)*math.pow(1-p,n-k)
print(pmf_binom(2,5,0.1))

#cau b
def plot_pmf_binom(n,p):
  K=list(range(0,n+1))
  P_binom=[pmf_binom(k,n,p) for k in K]
  plt.plot(K,P_binom,'-o')
  axes=plt.gca()
  axes.set_xlim([0,n])
  axes.set_ylim([0, 1.2*max(P_binom)])
  plt.title('PMF of Bin(%i, %.2f)' %(n,p))
  plt.xlabel('Number k of successes')
  plt.ylabel('Probability of k successes')
  plt.show()
plot_pmf_binom(5,0.1)
