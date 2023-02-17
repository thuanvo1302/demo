import math
import matplotlib.pyplot as plt
def pmf_bernoulli(p,x):
  return math.pow(p,x)*math.pow(1-p,1-x)
print(pmf_bernoulli(0.3,1))
def plot_pmf_bernoulli(p):
  X=[0,1]
  P_bernoulli=[pmf_bernoulli(p,x) for x in X]
  plt.plot(X,P_bernoulli,'o')

  plt.title('PMF of Bernoulli(p=%.2f)' %(p))
  plt.xlabel('Valua')
  plt.ylabel('Probabitity')
  plt.show()
plot_pmf_bernoulli(0.5)
def pmf_binom(k,n,p):
  return (math.factorial(n)/(math.factorial(k)*math.factorial(n-k)))*math.pow(p,k)*math.pow(1-p,n-k)
print(pmf_binom(3,4,0.3))
def plot_pmf_binom(n,p):
  K=list(range(0,n+1))
  P_binom=[pmf_binom(k,n,p) for k in K]
  plt.plot(K,P_binom,'-o')
  axes=plt.gca()
  axes.set_xlim([0,n])
  axes.set_ylim([0, 1.1*max(P_binom)])
  plt.title('PMF of Bin(%i, %.2f)' %(n,p))
  plt.xlabel('Number k of successes')
  plt.ylabel('Probability of k successes')
  plt.show()
plot_pmf_binom(15,0.5)

def pmf_poisson(k,lam):
  return (math.pow(lam,k)*math.pow(math.e,-lam))/math.factorial(k)
def plot_pmf_poisson(n,lam):
  K=list(range(0,n+1))
  P_poisson=[pmf_poisson(k,lam) for k in K]
  plt.plot(K,P_poisson,'-o')
  plt.title('PMF of Poisson(%i)' %lam)
  plt.xlabel('number of Events')
  plt.ylabel('Probability of Number of Events')
  plt.show()
plot_pmf_poisson(25,5)
def pmf_geo(p,x):
  return (math.pow(1-p,x-1))*p
def plot_pmf_geo(p,n):
  K=list(range(0,n+1))
  P_geo=[pmf_geo(p,k) for k in K]
  plt.plot(K,P_geo,'-o')
  plt.title('PMF of Geometric(%i)' %p)
  plt.xlabel('number of Events')
  plt.ylabel('Probability of Number of Events')
  plt.show()
plot_pmf_geo(0.3,10)
