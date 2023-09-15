def function_1():
    x = 1
    odd = 0
    while x <= 50:
        if x % 2 == 1:
            odd += 1
        x += 1
    print(f"Odd: {odd}")
def function_2():
    x = 50
    odd = 0
    while x >= 0:
        if x % 2 == 1:
            odd += 1
        x -= 1
    print(f"Odd: {odd}")
def func(int i, int j):
    while i != 0 and j != 0:
        i = i // j
        j = (j - 1) // 2
        print(f"i: {i}\tj: {j}")
def func4(int i, int j):
    while i > j:
        i = i - j
        k = i - j
    print(f"k: {k}")
def func5(int n):
    x = 1
    y = 1
    while():
        x = x + y
        y = x - y
        n -= 1
        print(x, y)
    return x
def main():
    function_1()
    function_2()
    func(0, 5)
    func(0, 3)
    func(2, 16)
    func(5, 80)
    func(9, 40)
    func4(10, 2)
    func4(9, 5)
    func4(1, 38)
    func4(5, 5)
    func4(5, 40)
    func5(2, 1)
    func5(3, 2)
    func5(5, 3)
    func5(8, 5)
    func5(8)
if __name__ == "__main__":
    main()
