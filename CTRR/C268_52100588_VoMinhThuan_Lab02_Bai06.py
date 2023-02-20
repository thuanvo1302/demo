import itertools

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
#Ex6
print("p         q        r       s      p→r \t ¬p→q \t q→s \t ¬r→s")
print("----------------------------------------------------------------")
table=list(itertools.product([False,True], repeat=4))
def sol1():
    for p, q, r, s in table:
        prem1 = limplies(p, r)
        prem2 = limplies(not p, q)
        prem3 = limplies(q, s)
        conc = limplies(not r, s)
        if prem1 and prem2 and prem3:
            print(p, "\t",q, "\t",r, "\t",s, "\t",prem1, "\t",prem2, "\t",prem3, "\t",conc, "\t","Critical row")
            if conc==False:
                return False
        else:
            print(p, "\t",q, "\t",r, "\t",s, "\t",prem1, "\t",prem2, "\t",prem3, "\t",conc)
if(sol1()==False):
    print("Invalid")
else:
    print("Valid")
    
print("p         q        r       s      t     p→(q→r)   p∨q \t t→q \t ¬s \t ¬r→¬t")
print("------------------------------------------------------------------------------")

table=list(itertools.product([False,True], repeat=5))

def sol2():
    for p, q, r, s, t in table:
        prem1 = limplies(p,limplies(q,r))
        prem2 = lOr(p,s)
        prem3 = limplies(t,q)
        prem4 = lNot(s)
        conc = limplies(lNot(r), lNot(t))
        if prem1 and prem2 and prem3 and prem4:
            print(p, "\t",q, "\t",r, "\t",s, "\t",t, "\t",prem1, "\t",prem2, "\t",prem3, "\t",prem4, "\t",conc, "\t","Critical row")
            if conc==False:
                return False
        else:
            print(p, "\t",q, "\t",r, "\t",s, "\t",t, "\t",prem1, "\t",prem2, "\t",prem3, "\t",prem4, "\t",conc)
if(sol2()==False):
    print("Invalid")
else:
    print("Valid")
table=list(itertools.product([False,True], repeat=4))
print("p         q        r       s      p→q \t ¬r∨s \t p∨r \t ¬q→s")
print("----------------------------------------------------------------")
def sol3():
    for p, q, r, s in table:
        prem1 = limplies(p, q)
        prem2 = lOr(lNot(r),s)
        prem3 = lOr(p,r)
        conc = limplies(lNot(q), s)
        if prem1 and prem2 and prem3:
            print(p, "\t",q, "\t",r, "\t",s, "\t",prem1, "\t",prem2, "\t",prem3, "\t",conc, "\t","Critical row")
            if conc==False:
                return False
        else:
            print(p, "\t",q, "\t",r, "\t",s, "\t",prem1, "\t",prem2, "\t",prem3, "\t",conc)
if(sol3()==False):
    print("Invalid")
else:
    print("Valid")
print("p         q        r       s      p \t p→r \tp→(q∨¬r)  ¬q∨¬s    s")
print("--------------------------------------------------------------------")
def sol4():
    for p, q, r, s in table:
        prem1 = p
        prem2 = limplies(p,r)
        prem3 = limplies(p,lOr(q,lNot(r)))
        prem4= lOr(lNot(q),lNot(s))
        conc = s
        if prem1 and prem2 and prem3 and prem4:
            print(p, "\t",q, "\t",r, "\t",s, "\t",prem1, "\t",prem2, "\t",prem3, "\t",prem4, "\t",conc, "\t","Critical row")
            if conc==False:
                return False
        else:
            print(p, "\t",q, "\t",r, "\t",s, "\t",prem1, "\t",prem2, "\t",prem3, "\t",prem4, "\t",conc)
if(sol4()==False):
    print("Invalid")
else:
    print("Valid")