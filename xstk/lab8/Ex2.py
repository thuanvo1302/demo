import pandas as pd
import numpy as np

data=pd.read_csv("population.csv",delimiter=',')


RCountryCode=[data['Country Code'].unique()]

RCountryName=[data['Country Name'].unique()]
CountryName=[]
for i in RCountryName:
    i.sort()
    for j in i:
        CountryName.append(j)
CountryCode=[]
for i in RCountryCode:
    i.sort()
    for j in i:
        CountryCode.append(j)


CountValue=data.groupby(['Country Code'])['Value'].count()

SumValue=data.groupby(['Country Code'])['Value'].sum()

StdValue=np.round(data.groupby(['Country Code'])['Value'].std(),2)

MinValue=data.groupby(['Country Code'])['Value'].min()

MaxValue=data.groupby(['Country Code'])['Value'].max()
def mean():
    mean=[]
    for i in SumValue:
        for j in CountValue:
            mean.append(np.round(i/j,2))  
            break
    return mean
  



df= pd.DataFrame({'Country Name': CountryName,'Country Code':CountryCode,'Mean': mean(),'Std':StdValue,'Min':MinValue,'Max': MaxValue},columns=['Country Name','Country Code','Mean','Std','Min','Max'])
    
print(df)
