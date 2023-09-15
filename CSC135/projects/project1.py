def functionOne(num, digits):
    number = str(num)
    even = 0
    for i in range(digits):
        if int(number[i]) % 2 == 0:
            even += 1
    print(f"The number of even is = {even}")
def functionTwo(num1, num2, num3):
    oddEven = False
    if num1 % 2 == 0 or num2 % 2 == 0 or num3 % 2 == 0:
        if num1 % 2 == 1 or num2 % 2 == 1 or num3 % 2 == 1:
            oddEven = True
    print(oddEven)
def functionThree(a, b, c):
    uniqueCount = 3
    if a == b or a == c or b == c:
        if a == b and b == c:
            uniqueCount = 1
        elif b == c and a != c:
            uniqueCount = 2
        elif a == b and b != c:
            uniqueCount = 2
        elif a == c and a != b:
            uniqueCount = 2
    print(uniqueCount)
def functionFour(start, finish):
    sum = 0
    if start <= finish:
        for i in range(start, (finish + 1)):
            print(start, end = " ")
            sum += start
            start += 1
    elif start > finish:
        for i in range(start, (finish - 1), -1):
            print(start, end = " ")
            sum += start
            start -= 1
    print(f"\n{sum}")
def functionFive(start, test, end):
    mid = (start + end) / 2
    if test == mid:
        print(True)
    else:
        print(False)
def functionSix():
    initialBalance = float(input("Enter initial balance: "))
    transactions = int(input("Enter number of transactions: "))
    for i in range(transactions):
        amount = float(input(f"Enter amount of transaction {i + 1}: "))
        initialBalance += amount
        print(f"New Balance: {initialBalance}")
def main():
    functionOne(123456, 6)
    functionTwo(2, 4, 6)
    functionTwo(2, 3, 4)
    functionTwo(12, 4, 17)
    functionTwo(5, 17, 4)
    functionThree(18, 3, 4)
    functionThree(6, 6, 6)
    functionThree(7, 31, 7)
    functionThree(2, -2, 1)
    functionFour(5, 10)
    functionFour(3, 3)
    functionFour(10, 1)
    functionFour(-10, -5)
    functionFour(11, 12)
    functionFive(4, 6, 8)
    functionFive(2, 10, 6)
    functionFive(8, 8, 8)
    functionFive(25, 10, -5)
    functionSix()
if __name__ == "__main__":
    main()
