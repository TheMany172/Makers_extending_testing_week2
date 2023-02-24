from faker import Faker

fake = Faker('en_UK')
# fake.seed_instance(999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999)
# print(fake.name())

fake.seed_instance(0)
print(fake.name())

instances = []
instances2 = []
count = 0
while count > -1:
    Faker.seed(count)
    # print(fake.name())
    if fake.name() != "Dr Mathew Ellis":
        instances.append(count)
        print (fake.name())
    else:
        instances2.append(count)
        break
    count += 1

print (instances2)




