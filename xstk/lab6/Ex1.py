import matplotlib.pyplot as plt
import math
from fractions import Fraction
def generator_data(a, b, size):
    n=(b-a)/(size-1)
    result=[]
    s=a
    while s<b:
        result.append(s)
        s=s+n
    if len(result) < size:
        result.append(b)
    return result
def cmf_normal(x, mu, sigma):
    return 0.5*(1+math.erf((x-mu)/(sigma*math.sqrt(2))))
def plot_cmf_normal(mu, sigma):
    X=generator_data(mu-4*sigma, mu+4*sigma, 1000)
    P_normal=[cmf_normal(x,mu,sigma) for x in X]
    plt.plot(X,P_normal, '-')
    plt.title('PMF of Normal(%.2f, %.2f)' %(mu,sigma))
    plt.xlabel('X')
    plt.ylabel('P')
    plt.show()
plot_cmf_normal(0,1.5)

