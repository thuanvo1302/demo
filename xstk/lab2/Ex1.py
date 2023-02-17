import random
#cau1
n=100000
def simualtor_dice1(n):
  count=0
  for i in range(n):
    die1= random.randint(1,6)
    die2=random.randint(1,6)
    if(die1%2==0 and die2%2==0):
      count+=1
  return count/n
print(simualtor_dice1(n))





