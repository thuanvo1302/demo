import random
import itertools
n=1

#cau6
from itertools import product
Ranks={1,2,3,4,5,6,7,8,9,10,'J','Q','K'}
Suits={'♡', '♢', '♣', '♠'}
Cards1=list(product(Ranks,Suits))
Cards2=list(product(Ranks,Suits))
Cards3=list(product(Ranks,Suits))
Cards4=list(product(Ranks,Suits))
Cards5=list(product(Ranks,Suits))

def simualtor_poker1(n):
    Ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 'J', 'Q', 'K'}
    Suits = {'♡', '♢', '♣', '♠'}
    Cards = list(product(Ranks, Suits))
    poker_5 = list(itertools.combinations(Cards, 5))
    random.shuffle(poker_5)
    print(poker_5)
    sum = 0
    for s in poker_5:
        count = 0
        # time = time + 1
        for i in range(0, len(s)):
            if (s[i].count('♡')):
                count = count + 1
        if (count == 5):
            sum = sum + 1

    return sum/len(poker_5)
print(simualtor_poker1(n))