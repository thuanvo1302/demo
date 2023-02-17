import matplotlib.pyplot as plt
import numpy as np
import pandas as pd 

myfile = pd.read_csv("company-sales_data.csv", delimiter=',')
fig = plt.figure(figsize = (3,3))
plt.plot(myfile['total_profit'])
plt.title("Cau a:")
plt.show()

fig,ax = plt.subplots(1,1)
month = [i for i in range(1,13)]
ax = fig.add_axes([0,0,1,1])
ax.scatter(month, myfile['toothpaste'])
ax.set_title("Cau b:")
plt.show()

data = [myfile['facecream'], myfile['facewash']]
X = np.arange(1,13)
fig = plt.figure()
ax = fig.add_axes([0,0,1,1])
ax.bar(X, data[0], color = 'r', width = 0.25)
ax.bar(X + 0.25, data[0], color = 'y', width = 0.25)
ax.set_title("Cau c:")
ax.legend(labels = ['facecream', 'facewash'])
plt.show()
