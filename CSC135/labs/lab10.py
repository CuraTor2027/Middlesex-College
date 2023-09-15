def function8():
    L1 = []
    for i in range(20):
        if i % 2 == 0:
            L1.append(i)
    print(L1)
def function9():
    list1 = [4,8,9,6,5,4,8,7,8]
    average = 0
    for i in list1:
        average += i
    average /= len(list1)
    print(average)
def function10():
    first = 'ryan'
    last = 'arokia-raj'
    i = 0
    while i < len(first):
        print(first[i] + last, end = " ")
        i += 1
def main():
    function8()
    function9()
    function10()
if __name__ == "__main__":
    main()
