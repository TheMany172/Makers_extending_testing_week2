import hmac
import hashlib
import itertools

# WARNING - this is code only for a course exercise and should not be used for
# passwords in the real world!

key = "super secret key which nobody knows"
secret_hash = b'$\xed\xb8v\x10\x1f\xe2\xa6\xc2\x0f\xaf[\x98|\xc7\x84l\xe1H\x02"\xed\xbf\xde\xd7>/;.\x9bI\xdf'

def hide_password(pw):
    return hmac.new(bytes(key, 'utf-8'), bytes(pw, 'utf-8'), hashlib.sha256).digest()

def check_password(sig, pw):
    return hmac.compare_digest(hide_password(pw), sig)


def password_finder():
    combination_list = []
    # Create a string containing all possible characters
    chars = "123456789abcdefghijklmnopqrstuvwxyz"
    # Generate all 4-digit combinations
    combinations = itertools.product(chars, repeat=4)
    for combination in combinations:
        combination_list.append("".join(combination))
    for i in combination_list:
        if check_password(secret_hash, i) == True:
            print (i)



print (password_finder())

