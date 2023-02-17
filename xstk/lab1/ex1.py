import itertools

E = {1, 2, 3, 4, 5}
k=3
n=len(E)
num_3_digit=[]
permute_k = list(itertools.permutations(E,k))
num_3_digit.append(permute_k)
print(num_3_digit)
num_length = len(permute_k)
print("Size = ", "%i!/(%i-%i)! = " %(n,n,k), num_length)