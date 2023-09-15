def functionOne(x, y):
    for i in range(-1, -9):
        if i == x:
            print(f"{x} is in range.")
        if i == y:
            print(f"{y} is in range.")
        print(i, end=" ")
def functionTwo(x, y):
    n = x
    n += 1
    while n < y:
        print(f"n is {n}")
        n += 2
        n *= -1
        print(f"n = {n}")
        n *= -1
def functionFive(phrase):
    indexK = -1
    for i in range(0, len(phrase)):
        if phrase[i] == 'k' or phrase[i] == 'K':
            indexK = i
    print(f"Index k is found at: {indexK}")
def main():
    functionOne(0, 8)
    functionTwo(2, 10)
    functionFive("Kim KPark k")
if __name__ == "__main__":
    main()
