def function1():
    numbers = [10,3,7,1,9,4,2,8,5,6]
    numbers.sort()
    print(numbers)
    numbers.reverse()
    print(numbers)
def function2():
    L = [1,3,5,7,9]
    L.remove(3)
    print(L)
def main():
    function1()
    function2()
if __name__ == "__main__":
    main()
