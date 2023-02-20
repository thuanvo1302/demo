import itertools
#Ex1
def limplies(p,q):
    if p:
        return q
    else:
        return True
def lAnd(p, q):
    if  p:
        if q:
            return p
        else:
            return q
    else:
        return p
def lOr(p,q):
    if p:
        return p
    else:
        return q
def lXor(p, q):
    if p:
        if q:
            return False
        else:
            return p
    else:
        if q:
            return q
        else:
            return False
def lNot(p):
    if p:
        return False
    return True
def lEquipvalent(p,q):
    return lAnd(limplies(p,q),limplies(q,p))
#Ex2
P=[True,True,False,False]
Q=[True,False,True,False]
def lLimplies(P,Q):
    res=[]
    for i in range(0,len(P)):
        res.append(limplies(P[i],Q[i]))
    return res
def lLAnd(P,Q):
    res=[]
    for i in range(0,len(P)):
        res.append(lAnd(P[i],Q[i]))
    return res
def lLOr(P,Q):
    res=[]
    for i in range(0,len(P)):
        res.append(lOr(P[i],Q[i]))
    return res
def lLXor(P,Q):
    res=[]
    for i in range(0,len(P)):
        res.append(lXor(P[i],Q[i]))
    return res
def lLNot(P):
    res=[]
    for i in range(0,len(P)):
        res.append(lNot(P[i]))
    return res
def lLEquivalent(P,Q):
    res=[]
    for i in range(0,len(P)):
        res.append(lEquipvalent(P[i],Q[i]))
    return res
print("p         q       p∨q \t ¬p→q")
print("--------------------------------")
table=list(itertools.product([False,True], repeat=2))
for p,q in table:
        print(p,q,  lOr(p,q),   limplies(lNot(p),q))
def compare(a,b):
    if(a==b):
        return 1
    else:
        return 0
def res2():
    count=0
    for p,q in table:
        #print(p,q,  lOr(q,p),   limplies(lNot(p),p))
        if(compare(lOr(p,q),limplies(lNot(p),q))==1):
            count+=1
        else:
            return 0
    return count
if(res2()==4):
    print("equivalent")
else:
    print("Inequivalent")

print("p         q       p∧q \t ¬(p->¬q)")
print("--------------------------------")
table=list(itertools.product([False,True], repeat=2))
for p,q in table:
    print(p,q,  lAnd(p,q),  lNot(limplies(p,lNot(q)))  )
def res3():
    count=0
    for p,q in table:
        #print(p,q,  lOr(q,p),   limplies(lNot(p),p))
        if(compare(lAnd(p,q),lNot(limplies(p,lNot(q))))==1):
            count+=1
        else:
            return 0
    return count
if(res3()==4):
    print("equivalent")
else:
    print("Inequivalent")

print("p         q       p↔q \t (p∧q)∨(¬p∧¬q)")
print("--------------------------------")
table=list(itertools.product([False,True], repeat=2))
for p,q in table:
    print(p,q,  lEquipvalent(p,q),  lOr(lAnd(p,q),lAnd(lNot(p),lNot(q)))  )
def res3():
    count=0
    for p,q in table:
        #print(p,q,  lOr(q,p),   limplies(lNot(p),p))
        if(compare(lEquipvalent(p,q),lOr(lAnd(p,q),lAnd(lNot(p),lNot(q))))==1):
            count+=1
        else:
            return 0
    return count
if(res3()==4):
    print("equivalent")
else:
    print("Inequivalent")