import random
n=10000
#cau4
def simualtor_dice4(n):
  count=0
  for i in range(n):
    die1= random.randint(1,6)
    die2=random.randint(1,6)
    if(die1==1 and die2==6):
      count+=1
  return count/n
print(simualtor_dice4(n))
