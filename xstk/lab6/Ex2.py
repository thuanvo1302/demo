import math
def cmf_normal(x, mu, sigma):
    return 0.5*(1+math.erf((x-mu)/(sigma*math.sqrt(2))))
res=cmf_normal(12,10,1)-cmf_normal(9,10,1)
print(res)