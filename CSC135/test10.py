def function1():
    count = -11
    a_list = []
    while count < 10:
        a_list.append(count)
        count += 1
    print(a_list)
def function2():
    a_list = []
    for i in range(-20, -10):
        a_list.append(i)
    print(a_list)
def function3():
    ListA = [1,2,3,4,5]
    ListB = []
    for num in ListA:
        ListB.append(num)
    ListB[2] = 10
    print(ListA[2])
    print(ListB[2])
    ListB[2] = 3
    print(ListB)
def function4():
    ListA = [1,2,3,4,5]
    ListB = []
    i = 0
    for num in ListA:
        ListB.append(ListA[i])
        ListB[i] -= 8
        i += 1
    ListA[2] = 10
    print(ListA[2])
    print(ListB[2])
    print(ListB)
def function6():
    L3 = []
    for i in range(5):
        L3.append(i**2)
    print(L3)
def function7():
    L4 = []
    count = 0
    while count < 5:
        L4.append(count)
        count += 1
    L4 = L4 + L4
    print(L4)
def function8():
    L1 = []
    even_number = 0
    for i in range(0, 11, 2):
        even_number = i
        L1.append(even_number)
    print(L1)
def function9():
    list1 = [4,8,9,6,5,4,8,7,8]
    average = 0
    i = 0
    for i in list1:
        average += list1[i]
    average /= 9
    print(average)
def function10():
    first = 'ryan'
    last = 'arokia-raj'
    i = 0
    while i < len(first):
        print(first[i] + last, end = " ")
        i += 1
def main():
    function1()
    function2()
    function3()
    function4()
    function6()
    function7()
    function8()
    function9()
    function10()
if __name__ == "__main__":
    main()
