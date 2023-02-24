import shutil
from faker import Faker
import os
fake_list = []

# This will create the directory structure for ORIGINALS
def make_originals():
    newpath = r"/Users/adamlittle/Documents/extending-testing/extending-testing/phase2/03_resources/target_directory/originals" 
    if not os.path.exists(newpath):
        os.makedirs(newpath)
    else:
        shutil.rmtree("/Users/adamlittle/Documents/extending-testing/extending-testing/phase2/03_resources/target_directory")
        os.makedirs("/Users/adamlittle/Documents/extending-testing/extending-testing/phase2/03_resources/target_directory/originals")

# This will create the directory structure for UPDATES
def make_updates():
    newpath = r"/Users/adamlittle/Documents/extending-testing/extending-testing/phase2/03_resources/target_directory/updates" 
    if not os.path.exists(newpath):
        os.makedirs(newpath)
    else:
        shutil.rmtree("/Users/adamlittle/Documents/extending-testing/extending-testing/phase2/03_resources/target_directory")
        os.makedirs("/Users/adamlittle/Documents/extending-testing/extending-testing/phase2/03_resources/target_directory/updates")

def make_allow_list():
    fake = Faker('en_UK')
    fake.seed_instance(172)
    file1 = open('/Users/adamlittle/Documents/extending-testing/extending-testing/phase2/03_resources/target_directory/allowlist', 'w')
    file1.write()

# This will populate the Contents of the above directories with a DROPLIST (can adjust the numbers on lines inside to adjust the amount dropped, and updated)
def faker_generator_drop_list():
    fake = Faker('en_UK')
    fake.seed_instance(172)
    drop_list = []

# this will create the 'ORIGINALS'
    for n in range(0, 3):
        last_name = fake.last_name()
        first_name = fake.first_name()
        fake_address = fake.address()
        file1 = open(f'/Users/adamlittle/Documents/extending-testing/extending-testing/phase2/03_resources/target_directory/originals/{last_name}', 'w')
        file1.write(first_name + " " + last_name + "\n" + fake_address)
        file1.close()
        drop_list.append(last_name)
    
# can change the numbers on line for loop to adjust what is dropped
    with open('/Users/adamlittle/Documents/extending-testing/extending-testing/phase2/03_resources/target_directory/droplist', 'w') as file:
        for item in drop_list[2:]:
            file.write("%s\n" % item)

# this will create the 'UPDATES'
    fake.seed_instance(172)
    for n in range(0, 2):
        file_update_last_name = fake.last_name()
        first_name = fake.first_name()
        fake_address = fake.address()
        file1 = open(f'/Users/adamlittle/Documents/extending-testing/extending-testing/phase2/03_resources/target_directory/updates/{file_update_last_name}', 'w')
        file1.write(first_name + " " + file_update_last_name + "\n" + fake_address + " -------------- UPDATED")
        file1.close()

# This will populate the Contents of the above directories with an ALLOWLIST (can adjust the numbers on lines inside to adjust the amount allowed, and updated)
def faker_generator_allow_list():
    fake = Faker('en_UK')
    fake.seed_instance(172)
    allow_list = []

# this will create the 'ORIGINALS'
    for n in range(0, 1):
        last_name = fake.last_name()
        first_name = fake.first_name()
        fake_address = fake.address()
        file1 = open(f'/Users/adamlittle/Documents/extending-testing/extending-testing/phase2/03_resources/target_directory/originals/{last_name}', 'w')
        file1.write(first_name + " " + last_name + "\n" + fake_address)
        file1.close()
        allow_list.append(last_name)
    
# can change the numbers on line for loop to adjust what is allowed
    with open('/Users/adamlittle/Documents/extending-testing/extending-testing/phase2/03_resources/target_directory/allowlist', 'w') as file:
        for item in allow_list[0:1]:
            file.write("%s\n" % item)

# this will create the 'UPDATES'
    fake.seed_instance(172)
    for n in range(0, 1):
        file_update_last_name = fake.last_name()
        first_name = fake.first_name()
        fake_address = fake.address()
        file1 = open(f'/Users/adamlittle/Documents/extending-testing/extending-testing/phase2/03_resources/target_directory/updates/{file_update_last_name}', 'w')
        file1.write(first_name + " " + file_update_last_name + "\n" + fake_address + " -------------- UPDATED")
        file1.close()


# The two below just order the above functions to make the final commands at the bottom more concise
def make_THE_WORLD_drop_list():
    make_updates()
    make_originals()
    faker_generator_drop_list()

def make_THE_WORLD_allow_list():
    make_updates()
    make_originals()
    faker_generator_allow_list()

##################################################################################


# Comment out one of the below to determine which you want to populate with


make_THE_WORLD_drop_list()
# make_THE_WORLD_allow_list()
