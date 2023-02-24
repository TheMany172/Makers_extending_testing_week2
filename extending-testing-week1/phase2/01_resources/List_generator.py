import itertools

# Create a string containing all possible characters
chars = "123456789abcdefghijklmnopqrstuvwxyz"

# Generate all 4-digit combinations
combinations = itertools.product(chars, repeat=4)

# Write the combinations to a .txt file
with open("combinations.txt", "w") as f:
    for combination in combinations:
        f.write("".join(combination) + "\n")
