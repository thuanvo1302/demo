


import numpy as np
import matplotlib.pyplot as plt
import datetime

#cau1a
a= [1,2,3,4,5,6,7]
a1= tuple(a)
print("cau1a{}".format(a1))
#cau1b
a2=set(a)
print("cau1b{}".format(a2))
#cau1c
keys = ('mot', 'hai', 'ba', 'bon', 'nam', 'sau', 'bay')
value = a
a3= dict(zip(keys, value))
print("cau1c{}".format(a3))
#cau2a
d1=list(a)
print("cau2a{}".format(d1))
#cau2b
d2= tuple(a)
print("cau2b {}".format(d2))
#cau2c
d3=set(a)
print("cau2c{}".format(d3))
#cau3a
x=5
result = value.count(x)
print("so lan xuat hien cua {} la {}".format(x,result))
#cau3b
k=7
a3
for keys, value in a3.items():
    if (value == x):
        a3[keys]=k
print(a3)
#cau3c
keys = ('mot', 'hai', 'ba', 'bon', 'nam', 'sau', 'bay')
value = a
a4= dict(zip(keys, value))
for keys, value in a4.items():
    
    if( value == x):
        del a4[keys]
        break
print(a4)
#cau3d
a4.update({"nam": 5})
print(a4)
#cau4a
s1={1,2,3,4,5,6}
s2={2,4,6,7}
print(s1 &s2 )
#cau4b
s1.update(s2)
print(s1)
#cau4c
x=8
s2.add(x)
print(s2)
#cau4d
x=6
s1.discard(x)
print(s1)
#cau5
l=[1,4,6,8,22,11,10,3,6]
x=[str(i) for i in np.arange(len(l))]
plt.bar(np.arange(len(l)),l,color='m')
plt.xticks(np.arange(len(l)),x)
plt.show()
#cau6
print("1:km->m")
print("2:m->m")
print("3:cm->m")
print("4:mm->m")
a= int (input ("Enter number "))
b= int (input("Enter length"))
if(a==1):
    print("{}m".format(b*1000))
if(a==2):
    print("{}m".format(b))
if(a==3):
    print("{}m".format(b/100))
if(a==4):
    print("{}m".format(b/1000))
#cau7
str="2/13"
strt1="3/21"
strt2="4/19"
dt1 = datetime.datetime.strptime(str, "%m/%d")
dt2 = datetime.datetime.strptime(strt1, "%m/%d")
dt3 = datetime.datetime.strptime(strt2, "%m/%d")
if((dt1-dt2).days>=0 and (dt3-dt1).days>=0 ):
    print("Aries(Ram)")
strt1="4/20"
strt2="5/20"
dt1 = datetime.datetime.strptime(str, "%m/%d")
dt2 = datetime.datetime.strptime(strt1, "%m/%d")
dt3 = datetime.datetime.strptime(strt2, "%m/%d")
if((dt1-dt2).days>=0 and (dt3-dt1).days>=0 ):
    print("Taurus(Bull)")
strt1="5/21"
strt2="6/21"
dt1 = datetime.datetime.strptime(str, "%m/%d")
dt2 = datetime.datetime.strptime(strt1, "%m/%d")
dt3 = datetime.datetime.strptime(strt2, "%m/%d")
if((dt1-dt2).days>=0 and (dt3-dt1).days>=0 ):
    print("Gemini(Twins")
strt1="6/22"
strt2="7/21"
dt1 = datetime.datetime.strptime(str, "%m/%d")
dt2 = datetime.datetime.strptime(strt1, "%m/%d")
dt3 = datetime.datetime.strptime(strt2, "%m/%d")
if((dt1-dt2).days>=0 and (dt3-dt1).days>=0 ):
    print("Cancer(Crab)")
strt1="7/23"
strt2="8/22"
dt1 = datetime.datetime.strptime(str, "%m/%d")
dt2 = datetime.datetime.strptime(strt1, "%m/%d")
dt3 = datetime.datetime.strptime(strt2, "%m/%d")
if((dt1-dt2).days>=0 and (dt3-dt1).days>=0 ):
    print("Leo(Lion)")
strt1="8/23"
strt2="9/22"
dt1 = datetime.datetime.strptime(str, "%m/%d")
dt2 = datetime.datetime.strptime(strt1, "%m/%d")
dt3 = datetime.datetime.strptime(strt2, "%m/%d")
if((dt1-dt2).days>=0 and (dt3-dt1).days>=0 ):
    print("Virgo(Vigin")
strt1="9/23"
strt2="10/23"
dt1 = datetime.datetime.strptime(str, "%m/%d")
dt2 = datetime.datetime.strptime(strt1, "%m/%d")
dt3 = datetime.datetime.strptime(strt2, "%m/%d")
if((dt1-dt2).days>=0 and (dt3-dt1).days>=0 ):
    print("Libra(Balance)")
strt1="10/24"
strt2="11/21"
dt1 = datetime.datetime.strptime(str, "%m/%d")
dt2 = datetime.datetime.strptime(strt1, "%m/%d")
dt3 = datetime.datetime.strptime(strt2, "%m/%d")
if((dt1-dt2).days>=0 and (dt3-dt1).days>=0 ):
    print("Scorpius(Scorpion)")
strt1="11/22"
strt2="12/21"
dt1 = datetime.datetime.strptime(str, "%m/%d")
dt2 = datetime.datetime.strptime(strt1, "%m/%d")
dt3 = datetime.datetime.strptime(strt2, "%m/%d")
if((dt1-dt2).days>=0 and (dt3-dt1).days>=0 ):
    print("Sagittarius(Archer)")
strt1="12/22"
strt2="1/19"
dt1 = datetime.datetime.strptime(str, "%m/%d")
dt2 = datetime.datetime.strptime(strt1, "%m/%d")
dt3 = datetime.datetime.strptime(strt2, "%m/%d")
if((dt1-dt2).days>=0 and (dt3-dt1).days>=0 ):
    print("Capricornus(Goat)")
strt1="1/20"
strt2="2/18"
dt1 = datetime.datetime.strptime(str, "%m/%d")
dt2 = datetime.datetime.strptime(strt1, "%m/%d")
dt3 = datetime.datetime.strptime(strt2, "%m/%d")
if((dt1-dt2).days>=0 and (dt3-dt1).days>=0 ):
    print("Aquarius(Water Bearer)")
strt1="2/19"
strt2="3/20"
dt1 = datetime.datetime.strptime(str, "%m/%d")
dt2 = datetime.datetime.strptime(strt1, "%m/%d")
dt3 = datetime.datetime.strptime(strt2, "%m/%d")
if((dt1-dt2).days>=0 and (dt3-dt1).days>=0 ):
    print("Prisces(Fish)")
#cau8a
t1 = datetime.date(2003,2,13)
a= t1.day
a1=t1.month
a2=t1.year
b=a%10+a//10
b3=0
b2=0
b1=0
if(a1>=10):
    b1=a1//10+a1%10
else:
     b1 = a1
while a2>0:
    b2+=a2%10
    a2=a2//10
if(b2>=10):
    b3=b2//10+b2%10
else:
    b3=b2
s=b+ b1 +b3
s_1=0
if(s>11):
    s_1=s//10+s%10
else:
    s_1 = s
print(s_1)
#cau8b
i=datetime.date.today()

t1 = datetime.date(2003,2,13)
a= t1.day
a1=t1.month
a2=i.year
b=a%10+a//10
b3=0
b2=0
b1=0
if(a1>=10):
    b1=a1//10+a1%10
else:
     b1 = a1
while a2>0:
    b2+=a2%10
    a2=a2//10
if(b2>=10):
    b3=b2//10+b2%10
else:
    b3=b2
s=b+ b1 +b3
s_1=0
if(s>9):
    s_1=s//10+s%10
else:
    s_1 = s
print(s_1)
#cau8c
l= input("Enter your name")
l1=list(l)
s=0
for i in l1:
    if(i=='A' or i=='J' or i=='S'):
        s+=1
    if(i=='B' or i=='K' or i=='T'):
        s+=2
    if(i=='C' or i=='L' or i=='U'):
        s+=3
    if(i=='D' or i=='M' or i=='V'):
        s+=4
    if(i=='E' or i=='N' or i=='W'):
        s+=5
    if(i=='F' or i=='O' or i=='X'):
        s+=6
    if(i=='G' or i=='P' or i=='Y'):
        s+=7
    if(i=='H' or i=='Q' or i=='Z'):
        s+=8
    if(i=='I' or i=='R'):
        s+=9
if(s >9 or s!=11 or s!=22):
    sc=s//10+s%10
else:
    sc=s
if(sc>9 or sc!=11 or sc!=22):
    sc_1=sc//10+sc%10
print(sc_1)
#cau8d
p=("A","Ă","Â","E","Ê","I","O","Ô","Ơ","U","Ư","Y")
l_1= input("Enter your name")
h= set(p) & set(l_1)
h=list(h)
h=h[len(h)-1]
if(h=='A' or h=='J' or h=='S'):
    print("1")
if(h=='B' or h=='K' or h=='T'):
    print("2")
if(h=='C' or h=='L' or h=='U'):
    print("3")
if(h=='D' or h=='M' or h=='V'):
    print("4")
if(h=='E' or h=='N' or h=='W'):
    print("5")
if(h=='F' or h=='O' or h=='X'):
    print("6")
if(h=='G' or h=='P' or h=='Y'):
    print("7")
if(h=='H' or h=='Q' or h=='Z'):
    print("8")
if(h=='I' or h=='R'):
    print("9")
#cau8e
print("...")
print(h)
print(l_1)
h_1=(set(h) ^ set(l_1)) 
h1=list(h_1)
sum=0
print(h1)
for i in h1:
    if(i=='A' or i=='J' or i=='S'):
        sum+=1
    if(i=='B' or i=='K' or i=='T'):
        sum+=2
    if(i=='C' or i=='L' or i=='U'):
        sum+=3
    if(i=='D' or i=='M' or i=='V'):
        sum+=4
    if(i=='E' or i=='N' or i=='W'):
        sum+=5
    if(i=='F' or i=='O' or i=='X'):
        sum+=6
    if(i=='G' or i=='P' or i=='Y'):
        sum+=7
    if(i=='H' or i=='Q' or i=='Z'):
        sum+=8
    if(i=='I' or i=='R'):
        sum+=9
if(sum > 11):
    sum_1=sum//10+sum%10
else:
    sum_1=sum
print(sum_1)



