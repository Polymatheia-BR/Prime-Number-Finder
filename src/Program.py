x = 100
y = 2
divZero = 0

x = int(input("Digite o valor limite: "))

while(y < x):
    z = 1
    while(z<y):
        if(y%z == 0):
            divZero += 1
        z += 1
        
    if(divZero < 2):
        print(y)

    y += 1
    divZero = 0
