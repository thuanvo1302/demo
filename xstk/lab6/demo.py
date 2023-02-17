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
def pmf_uniform_cont(a,b):
    return Fraction(1,b-a)
def plot_pmf_uniform_cont(a,b):
    X=generator_data(a,b,100)
    if b!= a:
        p=[pmf_uniform_cont(a,b) for x in X]
    plt.plot(X,p,'-')
    plt.plot([a,a],[0,1/(b-a)],'g--')
    plt.plot([b,b],[0,1/(b-a)],'g--')
    plt.title('PDF of Uniform continuous distribution(%0.2f, %0.2f' %(a,b))
    plt.show()
plot_pmf_uniform_cont(4,6)
def pmf_normal(x, mu, sigma):
    return (1.0/(sigma*math.sqrt(2*math.pi)))*(math.pow(math.e,-(x-mu)**2/(2*sigma**2)))
print(pmf_normal(3,4,2))
def cmf_normal(x, mu, sigma):
    return 0.5*(1+math.erf((x-mu)/(sigma/2)))
def plot_pmf_normal(mu, sigma):
    X=generator_data(mu-4*sigma, mu+4*sigma, 1000)
    P_normal=[pmf_normal(x,mu,sigma) for x in X]
    plt.plot(X,P_normal, '-')
    plt.title('PMF of Normal(%.2f, %.2f)' %(mu,sigma))
    plt.xlabel('X')
    plt.ylabel('P')
    plt.show()
plot_pmf_normal(0,1.5)
