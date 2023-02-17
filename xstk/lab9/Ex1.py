import pandas as pd 
import matplotlib.pyplot as plt 
import numpy as np

myfile = pd.read_csv("iris.csv",delimiter=",")
fig = plt.figure(figsize = (3,3))
ax = fig.add_axes([0,0,1,1])
range_number = [i for i in range(150)]
ax.scatter(myfile['sepal_length'], range_number, color = 'g')
ax.scatter(myfile['sepal_width'], range_number, color = 'b')
ax.set_xlabel('sepal_length')
ax.set_ylabel('sepal_width')
ax.set_title('Cau a:')
plt.show()
fig, ax = plt.subplots(1, 1)
ax.hist(myfile['sepal_length'], bins = [i for i in range(20)])
plt.show()