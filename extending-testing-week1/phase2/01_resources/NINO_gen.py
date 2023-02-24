import random
alpha = list(map(chr, range(65, 91)))


def make_NINO_file():
    letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    numbers = "1234567890"
    for n in range(0, 1000):
        for c1 in letters:
            for c2 in letters:
                for c3 in numbers:
                    for c4 in numbers:
                        for c5 in numbers:
                            for c6 in numbers:
                                for c7 in numbers:
                                    for c8 in numbers:
                                        for c9 in letters:
                                            with open('passlist.txt', 'w') as file:
                                                file.write(str(n) + " " + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9)
                                                # file.close()

make_NINO_file()

# def make_postcode():
#     random.choice(alpha) + str(random.randint(0,9)) + " " + str(random.randint(0,9)) + random.choice(alpha) + random.choice(alpha)



# alphabet_upper = list(map(chr, range(65, 91)))
# for n in range(0, 10):
#     for c1 in alphabet_upper:
#         for c2 in alphabet_upper:
#             print("EC2A " + str(n) + c1 + c2)

# make_postcode()
# 'K6 1JD'
# >>> make_postcode()
# 'P1 8JH'