from fractions import Fraction
def P(event, space):
    return Fraction(len(event),len(space))
S = [('Thanh', 'Nữ'), ('Hồng', 'Nữ'), ('Thương', 'Nữ'), ('Đào', 'Nữ'), ('My', 'Nữ'), ('Yến', 'Nữ'), ('Hạnh', 'Nữ'),
('My', 'Nữ'), ('Vy', 'Nữ'), ('Tiên', 'Nữ'), ('Thanh', 'Nam'), ('Thanh', 'Nam'), ('Bình', 'Nam'), ('Nhật', 'Nam'), ('Hào', 'Nam'), ('Đạt', 'Nam'), ('Minh', 'Nam')]
S_1 = [s for s in S]
#cau a
A = [s for s in S_1 for j in s if j=='Thanh']

print(A)
#cau b
B= [s for s in S if s[1]=='Nữ']
print(B)
#cau c
A_B=[i for i in A for j in B if i==j]

print(A_B)
#cau d
P_A=P(A,S)
print(P_A)
P_B=P(B,S)
print(P_B)
P_A_B=P(A_B,S)
print(P_A_B)
#cau e
P_A_B_with_B=P_A_B/P_B
print(P_A_B_with_B)