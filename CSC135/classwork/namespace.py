def f1():
    z = 5
    print(z)
def f2():
    z = 10
    print(z)
f1()
f2()

def f1():
    z = 5
    print('id(f1) = ', id(f1))
    print(z)
def f2():
    z = 10
    print('id(f2) = ', id(f2))
    print(z)
f1()
f2()

def f1():
    z = 17
    print('id(f1) = ', id(f1))
    print(z)
def f2():
    z = 10
    print('id(f2) = ', id(f2))
    z = 15
    print('id(f2) = ', id(f2))
    print(z)
f1()
f2()

def f1():
    z = 5
    print('id(f1) = ', id(f1))
    print(z)
    def f2():
        print('id(f2) = ', id(f2))
        print(z)
    f2()
f1()
