import itertools
import random
from itertools import product
ranks = {1,2,3,4,5,6,7,8,9,10,'J','Q', 'K'}
suits ={'H', 'D','C','S'}
Cards = list(product(ranks, suits))
# # print(Cards)
def kiemtratrung(n):
    list_card = []
    dem = 0
    while dem < n:
        index = random.randint(0, 51)
        if Cards[index] not in list_card:
            dem+=1
            list_card.append(Cards[index])
    return list_card
def kiemtra_a(A):
    count_out = 0
    for i in A:
        count = 0
        for j in A:
            if i[1] == j[1]:
                count +=1
        if count == 4:
            count_out += 1
    if count_out == 4:
        return True
    return False

def cau_a(n):
    count = 0
    for i in range (n):
        list_card = kiemtratrung(4)
        if kiemtra_a(list_card):
            count+=1
    return count/n

def kiemtra_b(A):
    count_out = 0
    for i in A:
        count = 0
        for j in A:
            if i[1] != j[1]:
                count +=1
        if count == 3:
            count_out += 1
    if count_out == 4:
        return True
    return False

def cau_b(n):
    count = 0
    for i in range (n):
        list_card = kiemtratrung(4)
        if kiemtra_b(list_card):
            count+=1
    return count/n

def kiemtra_c(A):
    count_out = 0
    for i in A:
        if i[1] == 'H' or i[1] == 'D':
            count_out+=1
    if count_out == 4:
        return True
    return False

def cau_c(n):
    count = 0
    for i in range (n):
        list_card = kiemtratrung(4)
        if kiemtra_c(list_card):
            count+=1
    return count/n

def kiemtra_d(A):
    count_out = 0
    for i in A:
        count = 0
        for j in A:
            if i[0] == j[0]:
                count +=1
        if count == 4:
            count_out += 1
    if count_out == 4:
        return True
    return False

def cau_d(n):
    count = 0
    for i in range (n):
        list_card = kiemtratrung(4)
        if kiemtra_d(list_card):
            count+=1
    return count/n

def kiemtra_e(A):
    count_out = 0
    for i in A:
        if i[0] != 'J' and i[0] != 'Q' and i[0] != 'K':
            count_out+=1
    if count_out == 4:
        return True
    return False

def cau_e(n):
    count = 0
    for i in range (n):
        list_card = kiemtratrung(4)
        if kiemtra_e(list_card):
            count+=1
    return count/n

def kiemtra_f(A):
    count_out = 0
    for i in A:
        if i[0] == 'J' or i[0] == 'Q' or i[0] == 'K':
            count_out+=1
    if count_out == 4:
        return True
    return False

def cau_f(n):
    count = 0
    for i in range (n):
        list_card = kiemtratrung(4)
        if kiemtra_f(list_card):
            count+=1
    return count/n
print(cau_a(100))
print(cau_b(100))
print(cau_c(100))
print(cau_d(10000))
print(cau_e(10))
print(cau_f(1000))