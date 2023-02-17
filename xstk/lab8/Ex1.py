import pandas as pd
import numpy as np

data=pd.read_csv("iris.csv",delimiter=',')
print(data.head(5))

def mean(data):
    sum=0
    for i in data:
        sum+=i
    return round(sum/len(data),5)

df= pd.DataFrame({'sepal_length':[len(data['sepal_length']),mean(data['sepal_length']),data['sepal_length'].std(),data['sepal_length'].min(),data['sepal_length'].max()],
'sepal_width':[len(data['sepal_width']),mean(data['sepal_width']),data['sepal_width'].std(),data['sepal_width'].min(),data['sepal_width'].max()],
'petal_length':[len(data['petal_length']),mean(data['petal_length']),data['petal_length'].std(),data['petal_length'].min(),data['petal_length'].max()],
'petal_width':[len(data['petal_width']),mean(data['petal_width']),data['petal_width'].std(),data['petal_width'].min(),data['petal_width'].max()]},
columns=['sepal_length','sepal_width','petal_length','petal_width'],index=['count','mean','std','min','max'])
print(df)