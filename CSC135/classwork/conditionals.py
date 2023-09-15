def main():
    a = 5
    b = 3
    c = 1
    sum = a + b + c
    if sum == 0:
        print(f"Sum is {sum}")
    elif sum < 0:
        print(f"{sum} < 0")
    else:
        print(f"{sum} > 0")

    a = -5
    b = 3
    c = 1
    sum = a + b + c
    if sum == 0:
        print(f"Sum is {sum}")
    elif sum < 0:
        print(f"{sum} < 0")
    else:
        print(f"{sum} > 0")

    a = -5
    b = 3
    c = 2
    sum = a + b + c
    if sum == 0:
        print(f"Sum is {sum}")
    elif sum < 0:
        print(f"{sum} < 0")
    else:
        print(f"{sum} > 0")
def coffee():
    brand = input("Enter coffee brand: ")
    originalPrice = int(input("Enter original price: "))
    if originalPrice > 10:
        discount = 0.15
    else:
        discount = 0.05
    discount *= originalPrice
    finalPrice = originalPrice - discount
    print(f"Coffee Brand: {brand}")
    print(f"Original Price: {originalPrice}")
    print(f"Final Price: {finalPrice}")
    print(f"Discount: {discount}")
def fruits():
    oranges = 3
    apples = 1
    soursop = 0.33
    jackfruit = 0.2
if __name__ == "__main__":
    main();
    coffee();
