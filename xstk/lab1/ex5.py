#exercise5
import itertools
def cross(A, B):
    return {a + b for a in A for b in B}
#bai5
deck = cross('S','1234567890JQK') | cross('C','1234567890JQK') | cross('D','1234567890JQK') | cross('H','1234567890JQK')
result = list(itertools.combinations(deck, 5))
print(len(result))
three_of_a_kind = []
for s in result: 
    #print(s)
    temp = list(itertools.combinations(s, 3))
    count = 0
    for x in temp:
        # print(x)
        # print(x[0][1],x[1][1],x[2][1])
        if(x[0][1] == x[1][1] and x[0][1] == x[2][1]):
            count += 1
            print(x)
    #print(count)
    if(count == 1):
        three_of_a_kind.append(s)
        print(s)
len_three_of_a_kind = len(three_of_a_kind)
print(len_three_of_a_kind)