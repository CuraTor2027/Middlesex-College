def function_1():
    for i in range(0, 11):
        print(i)
def function_2():
    for i in range(0, 51, 5):
        print(i)
def function_3():
    for i in range(10, -1, -1):
        print(i)
def function_4():
    s1 = 'kimh'
    s2 = 'park'
    for i in range(len(s1)):
        print(f"{s1[i]}{s2[i]}", end = "")
    print()
def function_5():
    s1 = 'kim h'
    s2 = 'park'
    for i in range(len(s2)):
        print(f"{s1[i]}{s2[i]}", end = "")
def main():
    function_1()
    function_2()
    function_3()
    function_4()
    function_5()
if __name__ == "__main__":
    main()
