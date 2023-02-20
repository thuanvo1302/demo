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
print(lLimplies(P,Q))
print(lLAnd(P,Q))
print(lLOr(P,Q))
print(lLXor(P,Q))
print(lLNot(P))
print(lLEquivalent(P,Q))
#Ex3
table=list(itertools.product([False,True], repeat=3))
print("p      q      r    p^q->r   r->p^q")
for p,q,r in table:
    tmp=lAnd(p,q)
    print(p ,q, r, limplies(tmp,r), limplies(r,tmp))
#Ex4
print("p      q      r    p∨q → p∧q → ¬p∨¬q")
for p,q,r in table:
    tmp=limplies(lOr(p,q),lAnd(p,q))
    tmp2=lOr(lNot(p),lNot(q))
    print(p ,q, r, limplies(tmp,tmp2))
print("p      q      r    ¬p∨(q∧r)→r")
for p,q,r in table:
    tmp=lOr(lNot(p),lAnd(q,r))
    print(p ,q, r, limplies(tmp,r))
print("p      q      r    (p→q)∧(q→r)")
for p,q,r in table:
    print(p ,q, r, lAnd(limplies(p,q),limplies(q,r)))
print("p      q      r    (p∨(q∧r))↔((p∨q)∧(p∨r))")
for p,q,r in table:
    tmp1=lOr(p,lAnd(q,r))
    tmp2=lAnd(lOr(p,q),(lOr(p,r)))
    print(p ,q, r, lEquipvalent(tmp1,tmp2))
table=list(itertools.product([False,True], repeat=4))
print("p      q      r    t     p∨q→¬r∨t")
for p,q,r,t in table:
    print(p ,q, r, t, limplies(lOr(p,q),lOr(lNot(r),t)))
print("p      q      r    t     p∨t→q→(r→t)")
for p,q,r,t in table:
    print(p ,q, r, t, limplies(limplies(lOr(p,t),q),limplies(r,t)))
print("p      q      r    t     (p∨(q∧r))↔(((p∨q)∧(p∨r))∧(t∨¬t))")
for p,q,r,t in table:
    tmp1=lOr(p,lAnd(q,r))
    tmp2=lAnd(lAnd(lOr(p,q),lOr(p,r)),lOr(t,lNot(t)))
    print(p ,q, r, t, limplies(tmp1,tmp2))
#Ex5
def compare(a,b):
    if(a==b):
        return 1
    else:
        return 0
def res1():
    p=[True,False]
    count=0
    for i in p:
        if(compare(i,lNot(lNot(i)))):
            count+=1
        else:
            count=0
    return count 
if(res1()==2):
    print("equivalent")
else:
    print("Inequivalent")

table=list(itertools.product([False,True], repeat=2))

def res2():
    count=0
    for p,q in table:
        if(compare(lAnd(lNot(lAnd(lNot(q),p)),lOr(q,p)),q)==1):
            count+=1
        else:
            return 0
    return count
if(res2()==4):
    print("equivalent")
else:
    print("Inequivalent")
def res3():
    count=0
    for p,q in table:
        if(compare(lNot(lOr(p,q)),lOr(lNot(p),lNot(q)))==1):
            count+=1
        else:
            return 0
    return count
if(res3()==4):
    print("equivalent")
else:
    print("Inequivalent")
table=list(itertools.product([False,True], repeat=3))

def res4():
    count=0
    for p,q,r in table:
        if(compare(limplies(lOr(p,q),r),lAnd(limplies(p,r),limplies(q,r)))==1):
            count+=1
        else:
            return 0
    return count
if(res4()==8):
    print("equivalent")
else:
    print("Inequivalent")
table=list(itertools.product([False,True], repeat=2))
def res5():
    count=0
    for p,q in table:
        if(compare(lNot(lAnd(p,q)),lAnd(lNot(p),lNot(q)))==1):
            count+=1
        else:
            return 0
    return count
if(res5()==4):
    print("equivalent")
else:
    print("Inequivalent")
def res6():
    count=0
    for p,q in table:
        tmp1=limplies(lOr(p,lNot(q)),lNot(p))
        tmp2=limplies(lOr(p,lNot(q)),lNot(p))
        if(compare(tmp1,tmp2)==1):
            count+=1
        else:
            return 0
    return count
if(res6()==4):
    print("equivalent")
else:
    print("Inequivalent")
def res7():
    count=0
    for p,q in table:
        if(compare(lNot(lOr(p,q)),lAnd(lNot(p),lNot(q)))==1):
            count+=1
        else:
            return 0
    return count
if(res7()==4):
    print("equivalent")
else:
    print("Inequivalent")
