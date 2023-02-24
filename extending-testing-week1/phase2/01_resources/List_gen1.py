alphabet_upper = list(map(chr, range(65, 91)))
for n in range(0, 10):
    for c1 in alphabet_upper:
        for c2 in alphabet_upper:
            print("EC2A " + str(n) + c1 + c2)
            