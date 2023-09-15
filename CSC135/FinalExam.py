'''
    Ryan Arokia-Raj
    20230426
    FinalExam.py
'''
def function1():
    count = -11
    a_list = []
    while count < 10:
        a_list.append(count)
        count += 1
    print(a_list)
def function2():
    ListA = [1,2,3,4,5]
    ListB = []
    for num in ListA:
        ListB.append(num)
    ListB[2] = 10
    print(ListA[2])
    print(ListB[2])
    print(ListB)
def function3():
    ListA = [1,2,3,4,5]
    ListB = []
    for num in ListA:
        i = num
        i -= 8
        ListB.append(i)
    ListA[2] = 10
    print(ListA[2])
    print(ListB[2])
    print(ListB)
def function4():
    L3 = []
    for i in range(5):
        L3.append(i**2)
    print(L3)
def function5():
    L4 = []
    count = 0
    while count < 5:
        L4.append(count)
        count += 1
    count = 0
    while count < 5:
        L4.append(count)
        count += 1
    print(L4)
def function6():
    list1 = [4,8,9,6,5,4,8,7,8]
    average = 0
    for i in list1:
        average += i
    average /= len(list1)
    print(average)
def function7():
    ListA = [1,2,3,4,5]
    ListB = []
    for num in ListA:
        ListB.append(num)
    ListA[2] = 10
    print(ListA[2])
    print(ListB)
def function8():
    ListA = [1,2,3,4,5,6,7,8,9,10,11,12,13,13,11,7]
    for i in range(15, 12, -1):
        print(ListA[i], end = " ")
def function9():
    name = "Kim KPark k"
    index = len(name) - 1
    for i in range(len(name) - 1, 0):
        if name[i].lower() == "k":
            index = i
            break
    print(index)
def function10():
    istart = 1
    jstop = 5
    kstep = 1
    sum = 0
    jstop = int(input('enter the number of values to read =>'))
    while istart <= jstop:
        range(istart, jstop, kstep)
        print('enter')
        get_int = int(input())
        istart = istart + kstep
        if get_int >= -1 and get_int <= 1:
            print('The value enterd is not valid')
        else:
            sum = sum + get_int
    print('on exit', istart)
    print('sum ', sum)
def function11():
    code_list = [2, 4, 3, 5, 6, 5, 7, 8, 9, 11, 3]
    dups = False
    j = 0
    while j < len(code_list) and not dups:
        print('j = ', j)
        k = j + 1
        while k < len(code_list) and not dups:
            if code_list[k] == code_list[j]:
                dups = True
                print('k = ', k)
            k += 1
        j += 1
    print('dups = ', dups)
def function12():
    def refyn(refyn_list_vals):
        j = 0
        for i in refyn_list_vals: 
            refyn_list_vals[j] = j
            j = j + 1
        print('refyn_list_vals before exiting refyn() = ', refyn_list_vals)

    list_vals = [3, 5, 6, 2]
    print('list_vals before call to refyn = ', list_vals)
    refyn(list_vals)
    print('list_vals after call to refyn = ', list_vals)
def function13():
    tup = ((2,3,4,5), (6,7,8))
    i = 0
    while i < len(tup[0]):
        print(tup[0][i])
        i += 1
    i = 0
    print()
    while i < len(tup[1]):
        print(tup[1][i])
        i += 1
def function14():
    def f1(tup):
        listA = list(tup)
        print(listA)
        listA.append(20)
        print(listA)
        return listA
    tup = (2,3,4,5)
    listA = tuple(f1(tup))
    print(listA)
def function15():
    cities = {'GA':'Atlanta', 'NY':'Albany', 'CA':'San Diego'}
    print(cities)
    for i in cities:
        if 'FL' in cities:
            del(cities['FL'])
    cities['FL'] = 'Tallahassee'
    print(cities)
def function16():
    import os.path
    directory = input("Enter a directory for the file: ")
    filename = input("Enter a name for the file: ")
    filename = filename + ".txt"
    file_path = os.path.join(directory, filename)
    if not os.path.isdir(directory):
        os.mkdir(directory)
    file = open(file_path, "w")
    file.write("Ryan Arokia-Raj")
    file.close()
def function17():
    def f1(lis): 
        for i in range(2, len(lis)): 
            lis[i] = lis[i] + lis[i - 1] + lis[i - 2]
    print(f1([4,8,19]))
    print(f1([3,17,14,26]))
    print(f1([1,13,16]))
def function18():
    def f1(list):
        for i in range(0, len(list) - 1):
            if i % 2 == 0:
                list[i] += 1
            else:
                list[i] -= 1
            print(list[i])
    list = [2,6,6,23,0]
    f1(list)
def main():
    function1()
    function2()
    function3()
    function4()
    function5()
    function6()
    function7()
    function8()
    function9()
    function10()
    function11()
    function12()
    function13()
    function14()
    function15()
    function16()
    function17() # unfinished
    function18()
if __name__ == "__main__":
    main()
