import random
#cau1
n=100000
#cau a
def simualtor_dice1(n):
  count=0
  for i in range(n):
    die1= random.randint(1,6)
    die2=random.randint(1,6)
    if(die1==die2):
      count+=1
  return count/n
print(simualtor_dice1(n))
#cau b
def simualtor_dice2(n):
  count=0
  for i in range(n):
    die1= random.randint(1,6)
    die2=random.randint(1,6)
    if(die1!=die2):
      count+=1
  return count/n
print(simualtor_dice2(n))
#cau c
def simualtor_dice3(n):
  count=0
  for i in range(n):
    die1= random.randint(1,6)
    die2=random.randint(1,6)
    if(die1%2==0 and die2%2==0):
      count+=1
  return count/n
print(simualtor_dice3(n))
#cau d
def simualtor_dice4(n):
  count=0
  for i in range(n):
    die1= random.randint(1,6)
    die2=random.randint(1,6)
    if(die1%2!=0 and die2%2!=0):
      count+=1
  return count/n
print(simualtor_dice4(n))
#cau e
def simualtor_dice5(n):
  count=0
  for i in range(n):
    die1= random.randint(1,6)
    die2=random.randint(1,6)
    if(die1%2==0 and die2%2!=0):
      count+=1
  return 2*count/n
print(simualtor_dice5(n))
#cau f
def simualtor_dice6(n):
  count=0
  for i in range(n):
    die1= random.randint(1,6)
    die2=random.randint(1,6)
    if(die1==6 and die2==6):
      count+=1
  return count/n
print(simualtor_dice6(n))
#cau g
def simualtor_dice7(n):
  count=0
  for i in range(n):
    die1= random.randint(1,6)
    die2=random.randint(1,6)
    if(die1+die2>10):
      count+=1
  return count/n
print(simualtor_dice7(n))