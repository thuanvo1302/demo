###--------chapter 1 Statistics library in Python-----------
import statistics
from fractions import Fraction as F
from decimal import Decimal as D
##---------Averages and measures of central location--------
#--------------------- mean()----------------------------

x=statistics.mean([11, 2, 13, 14, 44])  #input int
print(x)    #output int
y=statistics.mean([F(8, 10), F(11, 20), 
                   F(2, 5), F(28, 5)]) #input Fraction
print(y)    #output Fraction
z=statistics.mean([D("1.5"), D("5.75"), 
                   D("10.625"), D("2.375")])   #input Decimal
print(z)    #output Decimal

#--------------------- fmean()------------------------------

data=[55, 30, 20, 40, 80]   #intput list of int
x=statistics.fmean(data)
print(x)                    #output float

#---------------------geometric_mean()----------------------

data=[55, 30, 20, 40, 80]   #intput list of int
x=statistics.geometric_mean(data)
print(x)                    #output float

#---------------------harmonic_mean()-----------------------

data=[40, 60, 100, 50, 20]
x=statistics.harmonic_mean(data)    #input list of int
print(x)                            #output float

#--------------------- median()-----------------------------

data_EvenEl=[1, 2, 4, 5]    #so luong phan tu chan
data_Oddeven=[2, 5, 6]      #so luong phan tu le
x=statistics.median(data_EvenEl)
y=statistics.median(data_Oddeven)    
print(x)                     #output float
print(y)                     #output int

#--------------------- median_low()-------------------------

data_EvenEl=[1, 2.5, 4, 5]    #so luong phan tu chan
data_Oddeven=[2, 5, 6]      #so luong phan tu le
x=statistics.median_low(data_EvenEl)
y=statistics.median_low(data_Oddeven)    
print(x)                     #output float
print(y)                     #output int

#--------------------- median_high()------------------------

data_EvenEl=[1, 2, 4.5, 5]    #so luong phan tu chan
data_Oddeven=[2, 5, 6]      #so luong phan tu le
x=statistics.median_high(data_EvenEl)
y=statistics.median_high(data_Oddeven)    
print(x)                     #output float
print(y)                     #output int

#--------------------- median_grouped()---------------------

data=[50, 51, 53, 54]
x=statistics.median_grouped(data)   #interval = 1
y=statistics.median_grouped(data,interval=2)  #interval = 2
print(x)    
print(y)       

#--------------------- mode()-------------------------------

data=[1, 2, 3, 4, 3, 2, 3, 1]       
data_1=["blue", "blue", "blue", "green", "red", "red"]
x=statistics.mode(data)
# 1 xuất hiện 2 lần
# 2 xuất hiện 2 lần
# 3 xuất hiện 3 lần ->output 3
# 4 xuất hiện 1 lần 
y=statistics.mode(data_1)   
# blue xuất hiện 3 lần ->output blue
# green xuất hiện 1 lần 
# red xuất hiện 2 lần  
print(x)    
print(y)                 

#--------------------- multimode()--------------------------

data=[]    
data_1=["blue", "blue", "blue", "green", "red", "red","red"]
x=statistics.multimode(data)    #rỗng
y=statistics.multimode(data_1)   
# blue xuất hiện 3 lần ->output blue
# green xuất hiện 1 lần 
# red xuất hiện 3 lần  ->ouput red
print(x)    
print(y)       

#--------------------- quantiles()--------------------------

data=[105, 129, 87, 86, 111, 111, 89, 81, 108, 92, 110,
        100, 75, 105, 103, 109, 76, 119, 99, 91, 103, 129,
        106, 101, 84, 111, 74, 87, 86, 103, 103, 106, 86,
        111, 75, 87, 102, 121, 111, 88, 89, 101, 106, 95,
        103, 107, 101, 81, 109, 104]   
x= statistics.quantiles(data,n=10)  # chia du lieu thanh 10 khoang lien tuc voi xac suat bang nhau

print(x)

##---------------Measures of spread---------------------

#--------------------- pstdev()--------------------------

data=[1.5, 2.5, 2.5, 2.75, 3.25, 4.75] 
x=statistics.pstdev(data)   
print(x)      # output float

#--------------------- pvariance()----------------------

data=[1.5, 2.5, 2.5, 2.75, 3.25, 4.75] #input float
data_D=[D("27.5"), D("30.25"), D("30.25"), D("34.5"), D("41.75")]   #intput Decimal
data_F=[F(1, 4), F(5, 4), F(1, 2)]      #input Fraction
x=statistics.pvariance(data)  
y=statistics.pvariance(data_D)
z=statistics.pvariance(data_F) 
print(x)        #output float
print(y)        #output Decamal
print(z)        #output Fraction

#--------------------- stdev()--------------------------

data=[1.5, 2.5, 2.5, 2.75, 3.25, 4.75]  #input float 
x= statistics.stdev(data)
print(x)        #output float

#--------------------- variance()------------------------

data=[1, 2, 2, 2, 3, 4]   #input int
x= statistics.variance(data)
print(x)                #output float

##------------Statistics for relations between two inputs-----
#--------------------- covariance()----------------------

data = [1, 2, 3, 4, 5, 6, 7, 8, 9]
data_1 = [1, 2, 3, 1, 2, 3, 1, 2, 3]
#data và data_1 có cùng độ dài
x= statistics.covariance(data, data_1)
print(x)

#--------------------- correlation()----------------------

data = [1, 2, 3, 4, 5, 6, 7, 8, 9]
data_1 = [1, 2, 3, 1, 2, 3, 1, 2, 3]
#data và data_1 có cùng độ dài
x= statistics.correlation(data, data_1)
print(x)

#--------------------- linear_regression()----------------

year = [1971, 1975, 1979, 1982, 1983]
films_total = [1, 2, 3, 4, 5]
#data và data_1 có cùng độ dài
x,y= statistics.linear_regression(year, films_total)
#x = slope,   y = intercept
result=x*2022+y
print(result)