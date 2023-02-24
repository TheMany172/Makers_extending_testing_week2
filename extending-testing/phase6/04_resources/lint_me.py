"""
This is a file for trying out Pylint
"""
import os
# import this_does_not_exist


def open_foo_file(): # method that does a thing
    """Method that does a thing"""
    try:
        os.chdir("subdir")
        filedesc = open("foo.txt", "w", encoding="utf8")
        contents = filedesc.readlines()
        filedesc.close()
    except IOError:
        print("couldn't find the file or directory")
    return contents


if __name__ == "__main__":
    open_foo_file()
