import random

letters = "ABCEHJKLMPRSTWXY"
numbers = "1234567890"
last_letter = "ABCD"

def make_me_NINO_tastic():
    nino_list = []
    for n in range (0, 500):
        c1 = random.choice(letters)
        c2 = random.choice(letters)
        c3 = random.choice(numbers)
        c4 = random.choice(numbers)
        c5 = random.choice(numbers)
        c6 = random.choice(numbers)
        c7 = random.choice(numbers)
        c8 = random.choice(numbers)
        c9 = random.choice(last_letter)
        if (c1 + c2 + " " + c3 + c4 + " " + c5 + c6 + " " + c7 + c8 + " " + c9) not in nino_list:
            nino_list.append(c1 + c2 + " " + c3 + c4 + " " + c5 + c6 + " " + c7 + c8 + " " + c9)
    for n in range (0, 500):
        c1 = random.choice(letters)
        c2 = random.choice(letters)
        c3 = random.choice(numbers)
        c4 = random.choice(numbers)
        c5 = random.choice(numbers)
        c6 = random.choice(numbers)
        c7 = random.choice(numbers)
        c8 = random.choice(numbers)
        c9 = random.choice(last_letter)
        if (c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9) not in nino_list:
            nino_list.append(c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9)
    with open('NINOlist.txt', 'w') as file:
        for item in nino_list:
            file.write("%s\n" % item)
        print ("Task Compelete")



make_me_NINO_tastic()