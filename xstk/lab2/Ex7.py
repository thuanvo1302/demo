import random
import itertools
n=10000
#cau7
def simualtor_poker2(n):
    Ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 'J', 'Q', 'K'}
    Suits = {'♡', '♢', '♣', '♠'}
    Cards = list(itertools.product(Ranks, Suits))
    print(Cards)
    poker_4 = list(itertools.combinations(Cards, 4))
    random.shuffle(poker_4)
    
    sum = 0
    for s in poker_4:
        count = 0
        # time = time + 1
        for i in range(0, len(s)):
            if (s[i].count('♡')):
                count = count + 1
            if (s[i].count('♢')):
                count = count + 1
            if (s[i].count('♣')):
                count = count + 1
            if (s[i].count('♠')):
                count = count + 1
        if (count == 5):
            sum = sum + 1

    return sum/len(poker_4)
print(simualtor_poker2(n))