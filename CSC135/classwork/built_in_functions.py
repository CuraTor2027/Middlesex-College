# Ryan Arokia-Raj
# 20230227
# CSC135-64
def assignment1():
    name = "Quinncy Gallante"
    print(f"{len(name)} items in {name}.", end = " ")
    index = 0
    print("a is indexed at", end = " ")
    while index < len(name):
        if name[index] == "a":
            print(f"{index}", end = " ")
        index += 1
    print("\n")
def assignment2():
    name = "Quinncy Gallante"
    print(f"{len(name)} items in {name}.")
    index = 0
    while index < len(name):
        print(f"{name[index]} {index}")
        index += 1
    index = len(name) - 1
    while index > -1:
        print(f"{name[index]}", end = "")
        index -= 1
    print("\n")
def assignment3():
    name = "Luca Gallante"
    for index in range(2, len(name), 3):
        print(f"{name[index]} {index}")
    print("\n")
def assignment4():
    name = "Luca Gallante"
    for index in range((len(name) - 1), -1, -2):
        print(f"{name[index]} {index}")
    print("\n")
def assignment5():
    name = "Kim Park"
    to_be_found = input("Enter a character to be found: ")
    for index in range(len(name)):
        if name[index].lower() == to_be_found:
            print(f"{name[index]} {index}")
    print("\n")
def assignment6():
    name = "KimP Park"
    to_be_found = input("Enter character P to be found: ")
    for index in range(4, len(name)):
        if name[index].lower() == to_be_found.lower():
            print(f"{name[index]} {index}")
    print("\n")
def assignment7():
    c = int(input("Enter a value: "))
    d = int(input("Enter another value: "))
    print(f"{c} + {d} = {c + d}")
    print(f"{c} - {d} = {c - d}")
    print(f"{c} // {d} = {c // d}")
    print(f"{c} % {d} = {c % d}")
    print(f"{c} * {d} = {c * d}")
    c = float(c)
    d = float(d)
    print(f"{c} + {d} = {c + d}")
    print(f"{c} - {d} = {c - d}")
    print(f"{c} // {d} = {c // d}")
    print(f"{c} % {d} = {c % d}")
    print(f"{c} * {d} = {c * d}")
    print("\n")
def main():
    assignment1()
    assignment2()
    assignment3()
    assignment4()
    assignment5()
    assignment6()
    assignment7()
if __name__ == "__main__":
    main()
