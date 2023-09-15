def function_a(int item1, int item2, int item3):
    if item1 == item2:
        sum = item1 + item2 + 3
        print(sum)
    else:
        print(f"{item1} and {item2} are not the same.")
def function_b(int item1, int item2, int item3):
    if item1 != item2:
        sum = item1 + item2 - 3
        print(sum)
    else:
        print(f"{item1} and {item2} are the same.")
def function_c(int item1, int item2, int item3):
    if item1 == item3:
        num = (item1 + item3) ** 2
        print(num)
    else:
        print(f"{item1} and {item3} are not the same.")
def function_d(int item1, int item2, int item3):
    if item2 != item3:
        quotient = item2 / item2
        print(quotient)
    else:
        print("Divide by 0 not allowed.")
def function_2a():
    print("Range found")
def function_2b():
    print("Range not found")
def function_2(int y):
    if y >= 10 && y <= 50:
        function_2a()
    else:
        function_2b()
def func(int n):
    if n < 0:
        product = n * 3
        return product
    else:
        n = n + 3
        return n
    if n % 2 == 1:
        sum = n + (n % 10)
        return sum
def func(int x, int y):
    if x > y:
        x = x - 5
        y = y + 5
        print(f"x: {x}")
        print(f"y: {y}")
    else if x < y:
        x += 1
        y -= 1
        print(f"x: {x}")
        print(f"y: {y}")
    else:
        x = y * 2
        print(f"x: {x}")
def function_5(int x, int y, int z):
    even = 0
    odd = 0
    if x % 2 == 0:
        even++
    else:
        odd++
    if y % 2 == 0:
        even++
    else:
        odd++
    if z % 2 == 0:
        even++
    else:
        odd++
    print(f"Even: {even}")
    print(f"Odd: {odd}")
def main():
    function_a(2, 2, 2)
    function_a(0, 1, 0)
    function_b(2, 2, 2)
    function_b(-1, 3, -1)
    function_c(-2, -2, -2)
    function_c(-2, -2, -4)
    function_d(-1, 3, -1)
    function_d(0, 1, 0)
    function_2(15)
    func(-5)
    func(0)
    func(7)
    func(18)
    func(49)
    func(4, 7)
    func(3, 3)
    func(10, 5)
    func(20, 4)
    func(1, 1)
    function_5(2, 4, 6)
    function_5(2, 3, 4)
    function_5(12, 4, 17)
    function_5(5, 17, 4)
    function_5(14, 7, 5)
if __name__ == '__main__':
    main()
