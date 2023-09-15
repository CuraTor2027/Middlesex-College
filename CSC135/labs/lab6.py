def f1(x):
    print(x)
    def f2(x):
        print(x)
        def f3(x):
            print(x)
        f3(x)
    f2(x)
def main():
    x = 10
    f1(x)
    x = 8
    f1(x)
    x = 18
    f1(x)
    x = 118
    f1(x)
if __name__ == "__main__":
    main()
