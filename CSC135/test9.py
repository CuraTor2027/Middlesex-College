def function7():
    x = [1,2,3]
    y = x
    x[1] = 30
    y = x
    print(f"x and y = {x}{y}")
def function9():
    s = 'kimpark'
    list_s = list(s)
    list_s[2] = 'hello'
    list_s[0] = 1
    list_s[3] = 15
    list_s.append(2)
    print(list_s)
def function10():
    list1 = [1,2]
    list1.append(1)
    list1.append(2)
    list1.append(1)
    list1.append(2)
    print(list1)
def function11():
    L1 = [1,2,3]
    L2 = ['a','b','c']
    L3 = [1,2,3]
    for i in L2:
        L1.append(i)
    print(L1)
    L3.extend(L2)
    print(L3)
def function12():
    x = [1,(2,3),4]
    x[1] = (5,6)
    print(x)
def function13():
    a = [1,2,3]
    b = [1,2,3]
    c = [1,2,3,4]
    print(len(a) == 3)
    print(len(c) == 3)
    print(len(b) == 3)
    print(len(c) == 4)
def function14():
    numbers = [2,3,5,7,11,13,17,19]
    print(numbers[2:6])
    numbers.reverse()
    print(numbers)
    numbers.reverse()
    print(numbers)
    numbers.reverse()
    num = [i for j, i in enumerate(numbers) if j % 2 == 0]
    print(num)
    numbers.reverse()
    print(numbers[3:8])
def main():
    function7()
    function9()
    function10()
    function11()
    function12()
    function13()
    function14()
if __name__ == "__main__":
    main()
