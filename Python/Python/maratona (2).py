import sys

p1 = 0
p6 = 42195
somatoria = 0
msg1 = "Marquinhos termina a prova"
msg2 = "Marquinhos nao termina"
msg3 = "Valor invalido"

p2 = int(input("posicao 2: "))
if p2 <= p1:
    print(msg3)
    sys.exit()
else:
    d = p2 - p1
    if d <= 10000:
        somatoria = somatoria + d

p3 = int(input("posicao 3: "))
if p3 <= p2:
    print(msg3)
    sys.exit()
else:
    d = p3 - p2
    if d <= 10000:
        somatoria = somatoria + d

p4 = int(input("posicao 4 : "))
if p4 <= p3:
    print(msg3)
    sys.exit()
else:
    d = p4 - p3
    if d <= 10000:
        somatoria = somatoria + d

p5 = int(input("posicao 5 : "))
if p5 <= p4:
    print(msg3)
    sys.exit()
else:
    d = p5 - p4
    if d <= 10000:
        somatoria = somatoria + d

d = p6 - p5
somatoria = somatoria + d
if somatoria != p6:
    print(msg2)
else:
    print(msg1)


