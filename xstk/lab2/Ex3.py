import random
#cau3
n=10000
def simualtor_dice3(n):
  count=0
  for i in range(n):
    die1= random.randint(1,6)
    die2=random.randint(1,6)
    if(die1 == die2):
      count+=1
  return count/n
print(simualtor_dice3(n))