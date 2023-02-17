import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
myfile = open("Example.txt", 'r')
word = myfile.read()
word_new = ""
for i in word:
    if i.isalpha() or i.isspace():
        word_new+= i.upper()
list_word = word_new.replace('  ', ' ').split(' ')
timeAppear = []
list_word_new = []
for i in list_word:
    if i not in list_word_new:
        list_word_new.append(i)
        timeAppear.append(list_word.count(i))
print(list_word_new)
list_word_new.remove('')
print(timeAppear)
list_most_apprear = []
list_timeAppear = []
count = 0
for i in timeAppear:
    if count <= 30:
        index = timeAppear.index(max(timeAppear))
        list_timeAppear.append(max(timeAppear))
        timeAppear.remove(max(timeAppear))
        list_most_apprear.append(list_word_new[index])
        list_word_new.remove(list_word_new[index])
        count+=1
print(len(list_timeAppear))
print(len(list_most_apprear))
plt.plot(list_most_apprear, list_timeAppear,color = 'r')
plt.title("The number of appearance of words")
plt.xlabel("Word")
plt.ylabel("The number of appearance")
plt.show()
