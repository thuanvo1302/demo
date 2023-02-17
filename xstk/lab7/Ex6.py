import itertools
E = {0,1,2,3,4,5}
print("Cau a: ")
list_3 = []
for i in E:
    for j in E:
        for h in E:
            list_3.append((i, j, h))
print(list_3)
print(list_3)
print("Cau b:")
list_4 = list(itertools.permutations(E, 4))
print(list_4)