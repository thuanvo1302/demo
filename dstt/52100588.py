
import scipy.io 
import numpy as np


########## Requirements ######
def req1(transactions):
    transactions = np.array(transactions)
    count=dict()
    for i in transactions[:,1]:
        for j in i:
            if j in count:
                count[j] +=1
            else:
                count[j] = 1
    m=max(count.values())
    n=min(count.values())
    vmax = []
    vmin = []
    for keys, values in count.items():
        if(values == m):
            
            vmax.append(keys.strip(" "))
    
        if(values == n):
            
            vmin.append(keys.strip(" "))
    vmax.sort()
    vmin.sort()
    out=tuple((vmax,vmin))
    return out

def req2(products):
    products = np.array(products)

    vmax=[]
    vmin=[]
    keys=[]
    values=[]
    maxi=0
    for i in products[:,2]: 
        i=int(i)
        keys.append(i)
        if i > maxi:
            maxi=i
    for i in products[:,0]:
        i=i.strip(" ")
        values.append(i)
    z=dict(zip(values,keys))
    m=max(z.values())
    n=min(z.values())
    for i,j in z.items():
        if j == m:
            vmax.append(i.strip(" "))
        if j == n:
            vmin.append(i.strip(" "))
    vmax.sort()
    vmin.sort()
    out=tuple((vmax,vmin))
    return out
def req3(transactions, products):
    transactions = np.array(transactions)
    products = np.array(products)
    count=dict()
    for i in transactions[:,1]:
        for j in i:
            if j in count:
                count[j] +=1
            else:
                count[j] = 1
    
    keys=[]
    values=[]
    s=0
    for i in products[:,1]:
        i=float(i)
        keys.append(i)
    for i in products[:,0]:
        i=i.strip(" ")
        values.append(i)
    if keys == []:
        return []
    z=dict(zip(values, keys))
    
    for i,j in count.items():
        for m,n in z.items():
            if i==m:
                s+=j*n
    np.round(s,1)
    return s
def req4(transactions, products):
    transactions = np.array(transactions)
    products = np.array(products)
    count=dict()
    for i in transactions[:,1]:
        for j in i:
            if j in count:
                count[j] +=1
            else:
                count[j] = 1
    keys=[]
    values=[]
    s=[]
    q=[]
    for i in products[:,1]: 
        i=int(i)
        keys.append(i)
    for i in products[:,0]:
        i=i.strip(" ")
        values.append(i)
    z=dict(zip(values, keys))
    
    result=[]
    for i,j in count.items():
        for m,n in z.items():
            if i==m:
                s.append(j*n)
                q.append(i)
    h=dict(zip(s,q))
    for i,j in h.items():
        if i==max(s):
            result.append(j)
    return result

def req5(history, k):
    history = np.array(history)
    values=[]
    keys=[]
    g=[]
    for i in history[:,0]:
        for j in i:
            values.append(j)
    for i in history[:,1]:
        a=[]
        for j in i:
            a.append(j)
        keys.append(len(a))
    z=dict(zip(values,keys))
    if(k==0 or k>len(values)):
        return g
    keys_1=[]
    values_1=[]
    a=1
    while(a<=k):
        keys_1.append(max(keys))
        for i,j in z.items():
            if j==max(keys):
                values_1.append(i)
                z.pop(i)
                break
        keys.remove(max(keys))
        a+=1
    return values_1

def req6(transactions, history, k):
    transactions = np.array(transactions)
    history = np.array(history)
    b=[]
    a=[]
    for i in history[:,0]:
        for j in i:
            a.append(j)        
    for i in history:
            for j in i[0]:
                if j==k:
                    for k in i[1]:
                        b.append(k.strip(" "))
    if b==[]:
        return []
    d=[]
    for i in transactions:
        for j in i:
            for o in b:
                if j[0]==o:
                    for l in i[1]:
                        d.append(l)
    count=dict()
    for i in d:
            if i in count:
                count[i] +=1
            else:
                count[i] = 1
    m=max(count.values())
    vmax = []
    for keys, values in count.items():
        if(values == m):
            vmax.append(keys)
    return vmax
def req7(transactions, history):
    b=[]
    c=[]
    a=[]
    e=[]
    transactions = np.array(transactions)
    history = np.array(history)
    for i in history[:,1]:
        count=0
        for j in i:
            count+=1
        b.append(count)
    
    d=np.arange(0,len(b))

    z=dict(zip(d,b))
    for i,j in z.items():
            if j==min(b):
                c.append(history[i,:])
    for i in c:
        for j in i[1]:
            a.append(j)
    for i in transactions[::,:]:
        for j in i[0]:
            for m in a:
                if m==j:
                    for n in i[1]:
                        e.append(n)
    count=dict()
    f=[]
    for i in e:
            if i in count:
                count[i] +=1
            else:
                count[i] =1
    for i,j in count.items():      
        if j == max(count.values()):
            f.append(i)
    return f

def req8(transactions, history, k):
    transactions = np.array(transactions)
    history = np.array(history)
    b=[]
    for i in history[:,0]:
        for j in i:
            b.append(j)
    t=[0,0,0,0,0]
    f=[]
    g=[]
    for s in b:
        e=[]
        for i in history:
            for j in i[0]:
                if j==s:
                    for s in i[1]:
                        e.append(s.strip(" "))
        
        
        f.append(e)
        e.clear()
        for i in transactions[::,:]:
            d=[]
            for j in i:
                for o in e:
                    if j[0]==o:
                        for l in i[1]:
                            d.append(l)
        
        
        g.append(d)
        d.clear()
    count=dict()
    for i in d:
            if i in count:
                count[i] +=1
            else:
                count[i] = 1
    a=[]
    for i in count.values():
        a.append(i)
    return []

def req9(transactions, history, products):
    transactions = np.array(transactions)
    history = np.array(history)
    products = np.array(products)
    b=[]
    for i in products[:,0]:
        b.append(i.strip(" "))
    c=[]
    for i in transactions[:,1]:
        for j in i:
            c.append(j)
    for i in c:
        for j in b:
            if i==j:
                b.remove(i)
    return b
def req10(history, transactions, products, k):
    history = np.array(history)
    transactions = np.array(transactions)
    products = np.array(products)
    return None