def function1():
    total = 0
    for k in range(1, 51):
        total += (k**2)
    print(f"Total: {total}")
def function2():
    n = 50
    total = 0
    for k in range(1, n+1):
        total += (k**3)
    print(f"Total: {total}")
def function3():
    total = 0
    n = 78
    for k in range(1, n+1):
        total += k
    avg = total / 78
    print(f"Average: {avg}")
def function4():
    for i in range(0, 6):
        numbers[i] = int(input("Enter a number: "))
    numbers_sorted = sorted(numbers)
    print(numbers)
def main():
    function1()
    function2()
    function3()
    function4()
if __name__ == "__main__":
    main()
